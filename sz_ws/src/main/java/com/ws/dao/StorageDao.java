package com.ws.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ws.model.Storage;

/**
 * @author lujun
 * @date 2018年7月3日
 */
public interface StorageDao {
	//入库完成往门店库存表中插入库存信息
	int insertStorage(@Param("storageList")List<Storage> storageList);
	//门店库存查询
	List<Map<String,Object>> selectAllStorage(String storeCode);

}
