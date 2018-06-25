package com.model;

import java.io.Serializable;

/**
 * @author lujun
 * @date 2018年6月25日
 * 搭配款关注数据实体类
 */
public class MatchData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1542878050248837437L;
	private int id;
	private String matchStyel;
	private String style;
	private String createTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatchStyel() {
		return matchStyel;
	}
	public void setMatchStyel(String matchStyel) {
		this.matchStyel = matchStyel;
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
