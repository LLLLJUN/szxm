package com.ws.model;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author lujun
 * @date 2018年7月9日
 */
@ApiModel(value="权限表",description="用户拥有的权限信息")
public class Duty {
	private int id;
	private String userPermission;
	private String userDuty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserPermission() {
		return userPermission;
	}
	public void setUserPermission(String userPermission) {
		this.userPermission = userPermission;
	}
	public String getUserDuty() {
		return userDuty;
	}
	public void setUserDuty(String userDuty) {
		this.userDuty = userDuty;
	}
	
	
	
}
