package com.ws.model;

import java.util.List;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author lujun
 * @date 2018年7月9日
 */
@ApiModel(value="出库表",description="出库表详细信息")
public class OutStore {
	private int id;
	private String outStoreCode;
	private int goodsAllNum;
	private String goodsTotalPrices;
	private int outStoreMode;
	private String relevanceCode;
	private String warehouse;
	private String storeCode;
	private String userName;
	private String createTime;
	private String outStoreTime;
	private String remark;
	
	private int outStoreState;
	private List<OutStoreDetail> outStoreDetailList;
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
	public int getGoodsAllNum() {
		return goodsAllNum;
	}
	public void setGoodsAllNum(int goodsAllNum) {
		this.goodsAllNum = goodsAllNum;
	}
	public String getGoodsTotalPrices() {
		return goodsTotalPrices;
	}
	public void setGoodsTotalPrices(String goodsTotalPrices) {
		this.goodsTotalPrices = goodsTotalPrices;
	}

	public int getOutStoreMode() {
		return outStoreMode;
	}
	public void setOutStoreMode(int outStoreMode) {
		this.outStoreMode = outStoreMode;
	}
	public String getRelevanceCode() {
		return relevanceCode;
	}
	public void setRelevanceCode(String relevanceCode) {
		this.relevanceCode = relevanceCode;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getOutStoreTime() {
		return outStoreTime;
	}
	public void setOutStoreTime(String outStoreTime) {
		this.outStoreTime = outStoreTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getOutStoreState() {
		return outStoreState;
	}
	public void setOutStoreState(int outStoreState) {
		this.outStoreState = outStoreState;
	}
	public List<OutStoreDetail> getOutStoreDetailList() {
		return outStoreDetailList;
	}
	public void setOutStoreDetailList(List<OutStoreDetail> outStoreDetailList) {
		this.outStoreDetailList = outStoreDetailList;
	}
	
	
}
