package com.ws.model;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author lujun
 * @date 2018年7月9日
 */
@ApiModel(value="出库商品表",description="出库商品的详细信息")
public class OutStoreDetail {
	private int id;
	private String outStoreCode;
	private String sku;
	private String color;
	private String size;
	private String purchasePrice;
	private int outStoreNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOutStoreCode() {
		return outStoreCode;
	}
	public void setOutStoreCode(String outStoreCode) {
		this.outStoreCode = outStoreCode;
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
	public int getOutStoreNum() {
		return outStoreNum;
	}
	public void setOutStoreNum(int outStoreNum) {
		this.outStoreNum = outStoreNum;
	}
	
	
}
