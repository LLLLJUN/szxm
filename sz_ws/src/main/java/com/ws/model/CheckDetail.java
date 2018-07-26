package com.ws.model;

/**
 * @author lujun
 * @date 2018年7月5日
 * 盘点商品信息表
 */
public class CheckDetail {
	private int id;
	private String checkBillCode;
	private String sku;
	private String color;
	private String size;
	private int planNum;
	private int realNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCheckBillCode() {
		return checkBillCode;
	}
	public void setCheckBillCode(String checkBillCode) {
		this.checkBillCode = checkBillCode;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPlanNum() {
		return planNum;
	}
	public void setPlanNum(int planNum) {
		this.planNum = planNum;
	}
	public int getRealNum() {
		return realNum;
	}
	public void setRealNum(int realNum) {
		this.realNum = realNum;
	}
	
	
	
}
