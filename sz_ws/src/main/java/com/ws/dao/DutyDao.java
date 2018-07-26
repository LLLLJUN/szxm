package com.ws.dao;

import java.util.List;

import com.ws.model.Duty;

/**
 * @author lujun
 * @date 2018年7月12日
 */
public interface DutyDao {
	//从数据库查出全部权限
	List<String> selectAllUserPermission();
	//插入权限
	int insertPermission(Duty duty);
	//根据用户编码查询用户对应的权限、
    List<String> selectByUserCodePermission(String userCode);
}
