package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Condition;
import com.ws.model.Page;
import com.ws.model.Purchase;

/**
 * @author lujun
 * @date 2018年7月2日
 */
public interface PurchaseDao {
	//新增采购单
	int insertPurchase(Purchase purchase);
	//删除采购单
	int deletePurchase(String purchaseCode);
	//根据purchaseCode查询采购单详情
	Map<String, Object> selectByPurchaseCode(String purchaseCode);
	//采购单列表
	List<Map<String, Object>> selectBystoreCodeAllPurchase(Page page);
	//查询对应门店采购单总数
	int selectAllCount(Condition condition);
	//根据采购单号，查找对应的入库信息
	List<Map<String,Object>> selectByPurchaseCodeStorage(String purchaseCode);
	
	
}
