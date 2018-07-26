package com.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年7月26日
 */
public interface TryOnDataService {
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryTryOnData(@Param("storeCode")String storeCode,@Param("time")String time);
}
