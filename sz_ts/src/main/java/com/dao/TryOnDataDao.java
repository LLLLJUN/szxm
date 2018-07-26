package com.dao;

import java.util.List;
import java.util.Map;

import com.model.TryOnData;

/**
 * @author lujun
 * @date 2018年6月25日
 */
public interface TryOnDataDao {
	//插入试穿数据
	int insertTryOnData(TryOnData tryOnData);
	//获取指定时间段的试穿数据
	List<Map<String, Object>> selectData(TryOnData tryOnData);
}
