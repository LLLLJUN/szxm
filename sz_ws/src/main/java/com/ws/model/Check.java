package com.ws.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lujun
 * @date 2018年7月5日
 * 盘点表
 */
@Getter
@Setter
public class Check {
	private int id;
	private String checkBillCode;
	private String createTime;
	private int checkMode;
	private int checkState;
	private int planAllNum;
	private int realAllNum;
	private String storeCode;
	private String checkMakeMan;
	private String checkMan;
	private String checkTime;
	private String remark;
	
	//子查询字段
	private List<CheckDetail> checkDetailList;
	
	
}
