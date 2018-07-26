package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月2日
 */
public interface PurchaseService {
	
	ResponseEntity<ResponseResult<String>> insertPurchase(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<String>> deletePurchase(@Param("purchaseCode")String purchaseCode);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCode(@Param("purchaseCode")String purchaseCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectByPurchaseList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCodeStorage(@Param("purchaseCode")String purchaseCode);
	

}
