package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月3日
 */
public interface InStoreService {
	ResponseEntity<ResponseResult<String>> insertInStore(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectNoInStoreList(@Param("storeCode")String storeCode,@Param("pageRow")Integer pageRow);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectYesInStoreList(@Param("storeCode")String storeCode,@Param("pageRow")Integer pageRow);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> selectByPurchaseCodeYesInStore(@Param("inStoreCode")String inStoreCode);
	
	
}
