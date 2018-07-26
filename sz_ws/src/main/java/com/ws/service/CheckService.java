package com.ws.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年7月5日
 */
public interface CheckService {
	ResponseEntity<ResponseResult<String>> insertCheck(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectCheckByCheckBillCode(@Param("checkBillCode")String checkBillCode);

	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectCheckList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectYesCheckList(@Param("pageRow")Integer pageRow,@Param("storeCode")String storeCode);

	ResponseEntity<ResponseResult<String>> updateCheck(@Param("jsonObject") JSONObject jsonObject);
}
