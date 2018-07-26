package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月6日
 */
public interface GoodsTransferService {
	ResponseEntity<ResponseResult<String>> insertGoodsTransfer(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<String>> deleteGoodsTransfer(@Param("transferCode")String transferCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectByTransferCode(@Param("transferCode")String transferCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectGoodsTransferList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);
}
