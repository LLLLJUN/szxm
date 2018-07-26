package com.dao;

import java.util.List;
import java.util.Map;

/**
 * @author lujun
 * @date 2018年7月26日
 */
public interface StoresDao {
	//查询所有门店信息
	List<Map<String, Object>> selectAllStore();
	//查询指定条件的门店信息
	Map<String, Object> selectByStoreCode(String storeCode);
}
