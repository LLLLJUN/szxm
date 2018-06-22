package com.model;

import java.io.Serializable;

/**
 * 2018/6/14
 * 广告实体类
 */
public class Advertising implements Serializable {
	
	private static final long serialVersionUID = -7176180073833093396L;
	/**
	 * 
	 */
	private int id;
	private int adVersion;
	private String adUrl; 
	private String adCreateDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdVersion() {
		return adVersion;
	}
	public void setAdVersion(int adVersion) {
		this.adVersion = adVersion;
	}
	public String getAdUrl() {
		return adUrl;
	}
	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}
	public String getAdCreateDate() {
		return adCreateDate;
	}
	public void setAdCreateDate(String adCreateDate) {
		this.adCreateDate = adCreateDate;
	}
	@Override
	public String toString() {
		return "Advertising [id=" + id + ", adVersion=" + adVersion + ", adUrl=" + adUrl + ", adCreateDate="
				+ adCreateDate + "]";
	}
	
	
	
	
	 
}
