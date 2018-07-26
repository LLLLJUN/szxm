package com.ws.model;

import com.wordnik.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author lujun
 * @date 2018年6月29日
 * app更新实体类
 */
@ApiModel(value="app对象",description="app对象的描述")
public class AppVersion {
	@ApiModelProperty(name="id",value="主键id",example="举例",required=true,dataType="int")
	private int id;
	private int versionCode;
	private String versionName;
	private String messages;
	private String appUrl;
	private String appCreateDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public String getAppCreateDate() {
		return appCreateDate;
	}
	public void setAppCreateDate(String appCreateDate) {
		this.appCreateDate = appCreateDate;
	}
	
	
}
