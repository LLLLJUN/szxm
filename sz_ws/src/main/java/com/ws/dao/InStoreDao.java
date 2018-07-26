package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Condition;
import com.ws.model.InStore;
import com.ws.model.Page;

/**
 * @author lujun
 * @date 2018年7月3日
 */
public interface InStoreDao {
	//插入入库信息
	int insertInStore(InStore inStore);
	//查询待入库的商品列表
	List<Map<String, Object>> selectNoInStoreList(Page page);
	//查询待入库的商品总数
	int selectAllCount(Condition condition);
	//查询已入库的商品总数
	int selectAllYesCount(Condition conditions);
	//查询已入库的商品列表
	List<Map<String, Object>> selectYesInStoreList(Page page);
	//根据purchaseCode查询已入库采购单详情
	Map<String, Object> selectByPurchaseCodeYesInStore(String inStoreCode);
	
}
