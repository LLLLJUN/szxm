package com.ws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ws.model.InStoreDetail;

/**
 * @author lujun
 * @date 2018年7月4日
 */
public interface InStoreDetailDao {
	//插入入库的详细商品
	int insertInStoreDetailList(@Param("inStoreDetailList")List<InStoreDetail> inStoreDetailList);

}
