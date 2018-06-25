package com.model;

import java.io.Serializable;

/**
 * @author lujun
 * @date 2018年6月25日
 * 试穿数据实体类
 */
public class TryOnData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6398868927098974623L;
	private int id;
	private String epc;
	private String style;
	private String createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEpc() {
		return epc;
	}
	public void setEpc(String epc) {
		this.epc = epc;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	
	
}
