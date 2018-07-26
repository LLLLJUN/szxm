package com.ws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ws.model.OutStoreDetail;

/**
 * @author lujun
 * @date 2018年7月9日
 */
public interface OutStoreDetailDao {
	//保存出库的商品详细信息到出库商品表
	int insertOutStoreList(@Param("outStoreDetailList")List<OutStoreDetail> outStoreDetailList);
}
