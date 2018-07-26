package com.ws.model;

import java.util.List;

/**
 * @author lujun
 * @date 2018年7月3日
 * 入库信息实体类
 */
public class InStore {
	private int id;
	private String inStoreCode;
	private String purchaseCode;
	private String userName;
	private String createTime;
	private String remark;
	private String storeCode;
	private String warehouse;
	private String supplierCode;
	private String goodsTotalPrices;
	private int GoodsAllNum;
	
	private int inStoreState;
	private List<InStoreDetail> inStoreDetailList;
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
	public String getPurchaseCode() {
		return purchaseCode;
	}
	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getGoodsTotalPrices() {
		return goodsTotalPrices;
	}
	public void setGoodsTotalPrices(String goodsTotalPrices) {
		this.goodsTotalPrices = goodsTotalPrices;
	}
	public int getGoodsAllNum() {
		return GoodsAllNum;
	}
	public void setGoodsAllNum(int goodsAllNum) {
		GoodsAllNum = goodsAllNum;
	}
	public List<InStoreDetail> getInStoreDetailList() {
		return inStoreDetailList;
	}
	public void setInStoreDetailList(List<InStoreDetail> inStoreDetailList) {
		this.inStoreDetailList = inStoreDetailList;
	}
	public int getInStoreState() {
		return inStoreState;
	}
	public void setInStoreState(int inStoreState) {
		this.inStoreState = inStoreState;
	}
	
	
	
	
	
}
