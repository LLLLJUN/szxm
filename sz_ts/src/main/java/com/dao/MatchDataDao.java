package com.dao;

import java.util.List;
import java.util.Map;

import com.model.MatchData;

/**
 * @author lujun
 * @date 2018年6月25日
 */
public interface MatchDataDao {
	//插入搭配数据
	int insertMatchData(MatchData matchData);
	//获取指定条件下的搭配款数据
	List<Map<String, Object>> selectMatchData(MatchData matchData);
}
