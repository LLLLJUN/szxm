package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年6月29日
 */
public interface GoodsService {
	ResponseEntity<ResponseResult<Map<String, Object>>> insertGoods(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> deleteGoodsBySku(@Param("sku")String sku);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> updateGoods(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> pageGoods(@Param("pageRow")Integer pageRow);

	ResponseEntity<ResponseResult<Map<String, Object>>> selectGoodsBySku(@Param("sku")String sku);
		
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryAllGoods();
}
