package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月9日
 */
public interface OutStoreService {
	ResponseEntity<ResponseResult<String>> addOutStore(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> queryByTransferCode(@Param("transferCode")String transferCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryNoTransferList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryYesTransferList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);

	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryYesOutStoreCode(String outStoreCode);
}
