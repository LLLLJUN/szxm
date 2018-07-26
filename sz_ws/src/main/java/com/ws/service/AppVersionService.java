package com.ws.service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;


public interface AppVersionService {
	ResponseEntity<ResponseResult<Map<String,Object>>> selectAppVersion(@Param("appVersion")int appVersion);
	
}
