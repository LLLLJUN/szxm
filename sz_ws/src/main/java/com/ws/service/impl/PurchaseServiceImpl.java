package com.ws.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ws.dao.PurchaseDao;
import com.ws.dao.PurchaseDetailDao;
import com.ws.dao.StorageDao;
import com.ws.model.Condition;
import com.ws.model.Page;
import com.ws.model.Purchase;
import com.ws.model.ResponseResult;
import com.ws.service.PurchaseService;
import com.ws.util.DateUtil;
import com.ws.util.RespResultGenerator;
import com.ws.util.jsonbeanutil.PurchaseDetailUtil;
import com.ws.util.jsonbeanutil.PurchaseJsonUtil;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月2日
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	@Resource
	private PurchaseDao  purchaseDao;
	@Resource
	private PurchaseDetailDao purchaseDetailDao;
	@Resource
	private StorageDao storageDao; 

	@Transactional
	public ResponseEntity<ResponseResult<String>> insertPurchase(JSONObject jsonObject) {
				if(jsonObject!=null && !jsonObject.equals("")){
					Purchase purchase=PurchaseJsonUtil.getPurchaseBean(jsonObject);
					int purchaseNum= purchaseDao.insertPurchase(purchase);
					int purchaseDtailNum=purchaseDetailDao.inserPurchaseDetailList(
							PurchaseDetailUtil.getPurchaseDetailBean(jsonObject, purchase));
					if(purchaseNum>0&&purchaseDtailNum>0){
						return RespResultGenerator.genOK(null, "插入成功");
					}else{
						return RespResultGenerator.genError(null, "插入失败");
					}
				}
				return RespResultGenerator.genError(null, "参数为空");
	}

	@Transactional
	public ResponseEntity<ResponseResult<String>> deletePurchase(String purchaseCode) {
		if(purchaseCode!=null){
			int purchaseNum=purchaseDao.deletePurchase(purchaseCode);
			if(purchaseNum>0){
				int purchaseDetailNum=purchaseDetailDao.deletePurchaseDetail(purchaseCode);
				if(purchaseDetailNum>0){
					return RespResultGenerator.genOK(null, "删除成功");
				}
			}else{
				return RespResultGenerator.genError(null, "删除失败,该采购单与入库关联");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
	}
	@Transactional
	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCode(String purchaseCode) {
		if(purchaseCode!=null){
			if(purchaseDao.selectByPurchaseCode(purchaseCode)!=null){
				return RespResultGenerator.genOK(purchaseDao.selectByPurchaseCode(purchaseCode), "获取成功");
			}else{
				return RespResultGenerator.genError(null, "获取失败");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
	}

	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectByPurchaseList(Integer pageRow, String storeCode) {
		if(pageRow==null){
			pageRow=1;
		}
		if(storeCode!=null){
			Page page=new Page();
			Condition condition=new Condition();
			condition.setStoreCode(storeCode);
			page.setCondition(condition);
			page.setCountAll(purchaseDao.selectAllCount(condition));
			page.setPageRow(pageRow);
			if(purchaseDao.selectBystoreCodeAllPurchase(page)!=null){
				return  RespResultGenerator.genOK(purchaseDao.selectBystoreCodeAllPurchase(page),"获取成功");
			}else{
				return RespResultGenerator.genError(null, "获取失败");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
	}

	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCodeStorage(String purchaseCode) {
		if(purchaseCode!=null){
			Map<String, Object> map=new HashMap<String,Object>();
			Map<String, Object> purchaseCodeMap=purchaseDao.selectByPurchaseCode(purchaseCode);
			if(purchaseCodeMap!=null){
				map.put("inStoreCode", DateUtil.inStoreCode());
				map.putAll(purchaseCodeMap);
				return RespResultGenerator.genOK(map, "获取成功");
			}else{
				return RespResultGenerator.genError(null, "获取失败");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
	}

}
