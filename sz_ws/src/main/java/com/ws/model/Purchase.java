package com.ws.model;

import java.util.List;

/**
 * @author lujun
 * @date 2018年7月2日
 * 采购单实体类
 */
public class Purchase {
	private int id;
	private String purchaseCode;
	private String goodsTotalPrices;
	private int goodsAllNum;
	private String supplierCode;
	private String warehouse;
	private String storeCode;
	private String userName;
	private String remark;
	private int inStoreState;
	private String createTime;
	
	//子查询字段
	private List<PurchaseDetail> purchaseDetailList;
	private Supplier supplier;
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
	public String getGoodsTotalPrices() {
		return goodsTotalPrices;
	}
	public void setGoodsTotalPrices(String goodsTotalPrices) {
		this.goodsTotalPrices = goodsTotalPrices;
	}
	public int getGoodsAllNum() {
		return goodsAllNum;
	}
	public void setGoodsAllNum(int goodsAllNum) {
		this.goodsAllNum = goodsAllNum;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getInStoreState() {
		return inStoreState;
	}
	public void setInStoreState(int inStoreState) {
		this.inStoreState = inStoreState;
	}
	public List<PurchaseDetail> getPurchaseDetailList() {
		return purchaseDetailList;
	}
	public void setPurchaseDetailList(List<PurchaseDetail> purchaseDetailList) {
		this.purchaseDetailList = purchaseDetailList;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
	
	
}
