package com.ws.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ws.model.GoodsTransferDetail;

/**
 * @author lujun
 * @date 2018年7月6日
 */
public interface GoodsTransferDetailDao {
	//插入转货商品详细信息
	int insertGoodsTransferDetailList(@Param("goodsTransferDetailList")List<GoodsTransferDetail> goodsTransferDetailList);
	//删除转货商品详细信息
	int deleteGoodsTransferDetail(String transferCode);
}
