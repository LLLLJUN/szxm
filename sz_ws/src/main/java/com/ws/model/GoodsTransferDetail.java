package com.ws.model;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author lujun
 * @date 2018年7月6日
 */
@ApiModel(value="转货商品信息表",description="转货商品信息表实体类")
public class GoodsTransferDetail {
	private int id;
	private String transferCode;
	private String sku;
	private String color;
	private String size;
	private String purchasePrice;
	private int transferNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransferCode() {
		return transferCode;
	}
	public void setTransferCode(String transferCode) {
		this.transferCode = transferCode;
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
	public int getTransferNum() {
		return transferNum;
	}
	public void setTransferNum(int transferNum) {
		this.transferNum = transferNum;
	}
	
	
}
