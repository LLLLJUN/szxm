package com.ws.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.ws.model.ResponseResult;

/**
 * @author lujun
 * @date 2018年7月12日
 */
public interface RoleService {
	List<String> selectAllRole();

    List<String> selectByUserCodeRole(String userCode);
    
    ResponseEntity<ResponseResult<List<Map<String, Object>>>> seleceAllRoleInfo();
}
