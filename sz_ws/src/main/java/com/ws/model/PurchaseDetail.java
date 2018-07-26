package com.ws.model;

import java.io.Serializable;

/**
 * @author lujun
 * @date 2018年7月2日
 * 采购商品详情表
 */

public class PurchaseDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -653517491890656407L;
	private int id;
	private String purchaseCode;
	private String sku;
	private String color;
	private String size;
	private int purchaseNum;
	private String purchasePrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchaseCode() {
		return purchaseCode;
	}
	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
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
	public int getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(int purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	
	
}
