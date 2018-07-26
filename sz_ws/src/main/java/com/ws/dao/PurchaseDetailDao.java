package com.ws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ws.model.InStoreDetail;
import com.ws.model.PurchaseDetail;

/**
 * @author lujun
 * @date 2018年7月2日
 */
public interface PurchaseDetailDao {
	
	int inserPurchaseDetailList(@Param("purchaseDetailList")List<PurchaseDetail> purchaseDetailList);
	
	//根据sku查询出对应的采购数量
	int selectPurchaseNum(InStoreDetail inStoreDetail);
	//删除对应采购单编码的采购商品详情
	int deletePurchaseDetail(String purchaseCode);
}
