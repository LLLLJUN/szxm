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
public interface SupplierService {
	ResponseEntity<ResponseResult<Map<String, Object>>> insertSupplier(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<String>> deleteBySupplierCode(@Param("supplierCode")String supplierCode);
	
	ResponseEntity<ResponseResult<String>> updateBySupplier(@Param("jsonObject")JSONObject jsonObject);
	
	ResponseEntity<ResponseResult<Map<String, Object>>> selectBySupplierCode(@Param("supplierCode")String supplierCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> selectAllSupplier(@Param("pageRow")Integer pageRow);
}
