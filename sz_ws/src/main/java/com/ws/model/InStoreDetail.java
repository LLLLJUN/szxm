package com.ws.model;

/**
 * @author lujun
 * @date 2018年7月4日
 * 入库商品详细信息表
 */
public class InStoreDetail {
	private int id;
	private String inStoreCode;
	private String sku;
	private String color;
	private String size;
	private String purchasePrice;
	private int inStoreNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInStoreCode() {
		return inStoreCode;
	}
	public void setInStoreCode(String inStoreCode) {
		this.inStoreCode = inStoreCode;
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
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getInStoreNum() {
		return inStoreNum;
	}
	public void setInStoreNum(int inStoreNum) {
		this.inStoreNum = inStoreNum;
	}
	
	
}
