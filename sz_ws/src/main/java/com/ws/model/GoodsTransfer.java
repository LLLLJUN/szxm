package com.ws.model;

import java.util.List;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author lujun
 * @date 2018年7月6日
 */
@ApiModel(value="转货信息表",description="转货信息表的实体类")
public class GoodsTransfer {

	private int id;
	private String transferCode;
	private int goodsAllNum;
	private String goodsTotalPrices;
	private int outStoreState;
	private int inStoreState;
	private String sendStoreCode;
	private String sendStoreName;
	private String warehouse;
	private String receiveStoreCode;
	private String receiveStoreName;
	private String userName;
	private String remark;
	private String createTime;
	
	//子查询字段
	private List<GoodsTransferDetail> goodsTransferDetailList;
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
	
	public int getOutStoreState() {
		return outStoreState;
	}
	public void setOutStoreState(int outStoreState) {
		this.outStoreState = outStoreState;
	}
	public int getInStoreState() {
		return inStoreState;
	}
	public void setInStoreState(int inStoreState) {
		this.inStoreState = inStoreState;
	}
	public String getSendStoreCode() {
		return sendStoreCode;
	}
	public void setSendStoreCode(String sendStoreCode) {
		this.sendStoreCode = sendStoreCode;
	}
	public String getSendStoreName() {
		return sendStoreName;
	}
	public void setSendStoreName(String sendStoreName) {
		this.sendStoreName = sendStoreName;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getReceiveStoreCode() {
		return receiveStoreCode;
	}
	public void setReceiveStoreCode(String receiveStoreCode) {
		this.receiveStoreCode = receiveStoreCode;
	}
	public String getReceiveStoreName() {
		return receiveStoreName;
	}
	public void setReceiveStoreName(String receiveStoreName) {
		this.receiveStoreName = receiveStoreName;
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
	public List<GoodsTransferDetail> getGoodsTransferDetailList() {
		return goodsTransferDetailList;
	}
	public void setGoodsTransferDetailList(List<GoodsTransferDetail> goodsTransferDetailList) {
		this.goodsTransferDetailList = goodsTransferDetailList;
	}
	
	
	
}
