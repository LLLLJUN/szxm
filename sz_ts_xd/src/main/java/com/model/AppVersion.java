package com.model;

import java.io.Serializable;

public class AppVersion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 872503745346710400L;
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
	@Override
	public String toString() {
		return "AppVersion [id=" + id + ", versionCode=" + versionCode + ", versionName=" + versionName + ", messages="
				+ messages + ", appUrl=" + appUrl + ", appCreateDate=" + appCreateDate + "]";
	}
	
	
	
}
