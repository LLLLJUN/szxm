package com.ws.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ws.dao.InStoreDao;
import com.ws.dao.InStoreDetailDao;
import com.ws.dao.PurchaseDao;
import com.ws.dao.PurchaseDetailDao;
import com.ws.dao.StorageDao;
import com.ws.model.Condition;
import com.ws.model.InStore;
import com.ws.model.InStoreDetail;
import com.ws.model.Page;
import com.ws.model.ResponseResult;
import com.ws.model.Storage;
import com.ws.service.InStoreService;
import com.ws.util.RespResultGenerator;
import com.ws.util.jsonbeanutil.InStoreDetailJsonUtil;
import com.ws.util.jsonbeanutil.InStoreJsonUtil;
import com.ws.util.jsonbeanutil.StorageJsonUtil;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月3日
 */
@Service
public class InStoreServiceImpl implements InStoreService {
	
	@Resource
	private InStoreDao inStoreDao;
	@Resource
	private PurchaseDao purchaseDao;
	@Resource
	private PurchaseDetailDao purchaseDetailDao;
	@Resource
	private InStoreDetailDao inStoreDetailDao;
	@Resource 
	private StorageDao storageDao;
	
	@Transactional
	public ResponseEntity<ResponseResult<String>> insertInStore(JSONObject jsonObject) {
		if(jsonObject!=null&& !jsonObject.equals("")){
			//解析json
			InStore inStore=InStoreJsonUtil.getInStoreBean(jsonObject);
			//解析json得到入库商品详细信息
			List<InStoreDetail> inStoreDetailList=InStoreDetailJsonUtil.getInStoreDetailBean(jsonObject, inStore);
			//解析json得到库存信息
			List<Storage> storageList=StorageJsonUtil.getStorageBean(jsonObject, inStore);
			//入库单插入
			int inStoreNum=inStoreDao.insertInStore(inStore);
			//商品详细信息入库单插入
			int inStoreDetailNum=inStoreDetailDao.insertInStoreDetailList(inStoreDetailList);
			//库存插入
			int storageNum=storageDao.insertStorage(storageList);
			if(inStoreNum>0&&inStoreDetailNum>0&&storageNum>0){
				/*int number=0;
				if(inStore.getInStoreState()==1){
					for (InStoreDetail inStoreDetail : inStoreDetailList) {
						//查询采购单详细商品的数量
						int purchaseNum=purchaseDetailDao.selectPurchaseNum(inStoreDetail);
						if(purchaseNum==inStoreDetail.getInStoreNum()){//如果入库商品数量等于采购商品总数删除采购商品详细信息表的商品
							purchaseDetailDao.deletePurchaseDetail(inStoreDetail);
							number++;
						}else{//未入库商品数量=采购单商品总数-部分入库的商品总数
							int	noInStoreDetailNum=purchaseNum-inStoreDetail.getInStoreNum();
							inStoreDetail.setInStoreNum(noInStoreDetailNum);
							purchaseDetailDao.updatePurchaseDetail(inStoreDetail);
							number++;
						}
					}
				}
				//查出对应采购单商品总数
				int goodsAllNum=purchaseDao.selectGoodsAllNum(inStore.getPurchaseCode());
				//未入库商品数量=采购单商品总数-入库数量
				int num=goodsAllNum-inStore.getGoodsAllNum();
				//修改采购单的入库状态，以及如果是部分入库修改采购数量
				Purchase purchase=new Purchase();
				purchase.setPurchaseCode(inStore.getPurchaseCode());
				purchase.setInStoreState(inStore.getInStoreState());
				purchase.setGoodsAllNum(num);
				int purchaseDaoNum=purchaseDao.updateInStoreState(purchase);
				if(purchaseDaoNum>0 && number>0){*/
					return RespResultGenerator.genOK(null, "新增成功");
				/*}*/
			}else{
				return RespResultGenerator.genError(null, "新增失败");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
	}

	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectNoInStoreList(String storeCode,
		Integer pageRow) {
		if(storeCode!=null && !storeCode.equals("")){
			Page page=new Page();
			Condition condition=new Condition();
			condition.setStoreCode(storeCode);
			page.setCountAll(inStoreDao.selectAllCount(condition));
			page.setPageRow(pageRow);
			page.setCondition(condition);
			List<Map<String, Object>> NoInStoreList=inStoreDao.selectNoInStoreList(page);
			if(NoInStoreList!=null){
				return RespResultGenerator.genOK(NoInStoreList, "获取成功");
			}
		}
		return RespResultGenerator.genError(null, "参数错误"); 
	}

	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectYesInStoreList(
		String storeCode,Integer pageRow) {
		if(pageRow==null){
			pageRow=1;
		}
		Page page=new Page();
		Condition condition=new Condition();
		condition.setStoreCode(storeCode);
		page.setCountAll(inStoreDao.selectAllYesCount(condition));
		page.setPageRow(pageRow);
		page.setCondition(condition);
		List<Map<String, Object>> mapList=inStoreDao.selectYesInStoreList(page);
		if(mapList!=null){
			return RespResultGenerator.genOK(mapList, "获取成功");
		}else{
			return RespResultGenerator.genError(null, "获取失败");
		}
	}

	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCodeYesInStore(String inStoreCode) {
		if(inStoreCode!=null){
			Map<String, Object> map=inStoreDao.selectByPurchaseCodeYesInStore(inStoreCode);
			if(map!=null){
				return RespResultGenerator.genOK(map, "获取成功");
			}else{
				return RespResultGenerator.genError(null, "获取失败");
			}
		}
		return RespResultGenerator.genError(null, "参数错误");
		
	}
	

	

}
