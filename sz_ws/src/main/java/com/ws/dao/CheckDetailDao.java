package com.ws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ws.model.CheckDetail;

/**
 * @author lujun
 * @date 2018年7月5日
 */
public interface CheckDetailDao {
	//新建盘点单商品信息插入
	int insertCheckDetailList(@Param("checkDetailList")List<CheckDetail> checkDetailList);
	//盘点信息上传
	int updateCheck(@Param("checkDetailList")List<CheckDetail> checkDetailList);
	

}
