package com.ws.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ws.dao.GoodsDao;
import com.ws.model.Goods;
import com.ws.model.Page;
import com.ws.model.ResponseResult;
import com.ws.service.GoodsService;
import com.ws.util.RespResultGenerator;
import com.ws.util.jsonbeanutil.GoodsJsonUtil;

import net.sf.json.JSONObject;

/**
 * @author lujun
 * @date 2018年6月29日
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsDao goodsDao;
	
	@Transactional
	public ResponseEntity<ResponseResult<Map<String, Object>>> insertGoods(JSONObject jsonObject) {
		if(jsonObject!=null &&!jsonObject.equals("")){
			Goods goods=GoodsJsonUtil.getGoodsBean(jsonObject);
			int count=goodsDao.selectBySku(goods.getSku());
			if(count>0){
				return RespResultGenerator.genError1(null, "商品已存在");
			}else{
				int num=goodsDao.insertGoods(goods);
				if(num>0){
					return RespResultGenerator.genOK(null, "上传成功");
				}else{
					return RespResultGenerator.genError(null, "上传失败");
				}
			}
		}
		return RespResultGenerator.genError(null, "参数错误");	
	}

	@Transactional
	public ResponseEntity<ResponseResult<Map<String, Object>>> deleteGoodsBySku(String sku) {
			if(sku!=null){
				int num=goodsDao.deleteGoodsBySku(sku);
				if(num>0){
					return RespResultGenerator.genOK(null, "删除成功");
				}else{
					return RespResultGenerator.genError(null, "删除失败");
				}
			}
			return RespResultGenerator.genError(null, "参数为空");
	}

	@Transactional
	public ResponseEntity<ResponseResult<Map<String, Object>>> updateGoods(JSONObject jsonObject) {
			if(jsonObject!=null && !jsonObject.equals("")){
				Goods goods=GoodsJsonUtil.getGoodsBean(jsonObject);
				int num=goodsDao.updateGoods(goods);
				if(num>0){
					return RespResultGenerator.genOK(null, "修改成功");
				}else{
					return RespResultGenerator.genError(null, "修改失败");
				}
			}
			return  RespResultGenerator.genError(null, "参数为空");
	}

	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> pageGoods(Integer pageRow) {
		Page pages=new Page();
		PageHelper.startPage(pageRow, pages.getRows());
		PageInfo<Goods> page=new PageInfo<Goods>();
		List<Map<String, Object>> list=goodsDao.Goodspage();
		return RespResultGenerator.genOK(list, "查询成功");
	}

	public ResponseEntity<ResponseResult<Map<String, Object>>> selectGoodsBySku(String sku) {
			if(sku!=null&&!sku.equals("")){
				Map<String, Object> map=goodsDao.selectGoodsBySku(sku);
				if(map!=null && !map.equals("")){
					return RespResultGenerator.genOK(map, "查询成功");
				}else{
					return RespResultGenerator.genError(null, "没有该商品");
				}
			}
			return RespResultGenerator.genError(null, "参数为空");
	}

	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryAllGoods() {
			List<Map<String, Object>>goodsList= goodsDao.selectAllGoods();
			if(goodsList!=null&&!goodsList.equals("")){
				return RespResultGenerator.genOK(goodsList, "获取成功");
			}else{
				return RespResultGenerator.genError(null, "获取失败");
			}
	}

	

}
 