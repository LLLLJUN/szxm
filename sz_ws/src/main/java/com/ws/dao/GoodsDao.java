package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Goods;

/**
 * @author lujun
 * @date 2018年6月29日
 */
public interface GoodsDao {
	//新增商品时先查看商品是否存在
	int selectBySku(String sku);
	//增加商品
	int insertGoods(Goods goods);
	//删除商品
	int deleteGoodsBySku(String sku);
	//修改商品信息
	int updateGoods(Goods goods);
	//查询总条数
	int selectAllCount();
	//分页查询商品列表
	List<Map<String,Object>> Goodspage();
	//商品详细信息
	Map<String, Object> selectGoodsBySku(String sku);
	//查询全部商品详细信息
	List<Map<String, Object>> selectAllGoods();
}
