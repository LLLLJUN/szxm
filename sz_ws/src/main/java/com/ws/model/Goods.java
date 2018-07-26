package com.ws.model;

/**
 * @author lujun
 * @date 2018年6月29日
 */

public class Goods  {
	
	private int id;
	private String sku;
	private String name;
	private String style;
	private String colors;
	private String sizes;
	private String unit;
	private String purchasePrice;
	private String listPrice;
	private String curPrice;
	private String createTime;
	private int upperLimitNum;
	private int lowerLimitNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getSizes() {
		return sizes;
	}
	public void setSizes(String sizes) {
		this.sizes = sizes;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getListPrice() {
		return listPrice;
	}
	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}
	public String getCurPrice() {
		return curPrice;
	}
	public void setCurPrice(String curPrice) {
		this.curPrice = curPrice;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getUpperLimitNum() {
		return upperLimitNum;
	}
	public void setUpperLimitNum(int upperLimitNum) {
		this.upperLimitNum = upperLimitNum;
	}
	public int getLowerLimitNum() {
		return lowerLimitNum;
	}
	public void setLowerLimitNum(int lowerLimitNum) {
		this.lowerLimitNum = lowerLimitNum;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", sku=" + sku + ", name=" + name + ", style=" + style + ", colors=" + colors
				+ ", sizes=" + sizes + ", unit=" + unit + ", purchasePrice=" + purchasePrice + ", listPrice="
				+ listPrice + ", curPrice=" + curPrice + ", createTime=" + createTime + ", upperLimitNum="
				+ upperLimitNum + ", lowerLimitNum=" + lowerLimitNum + "]";
	}
	

}
