package com.ws.service;

import java.util.List;

import com.ws.model.Duty;

/**
 * @author lujun
 * @date 2018年7月12日
 */
public interface DutyService {
	List<String> queryAllPermission();
	
	int addPermission(Duty permissions);
	
	List<String> selectByUserCodePermission(String userCode);
}
