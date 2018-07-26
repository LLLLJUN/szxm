package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Page;
import com.ws.model.Supplier;

/**
 * @author lujun
 * @date 2018年7月2日
 */
public interface SupplierDao {
	//新增供应商
	int insertSupplier(Supplier supplier);
	//删除供应商
	int deleteBySupplierCode(String supplierCode);
	//修改供应商信息
	int updateSupplier(Supplier supplier);
	//根据supplierCode 查询供应商详情
	Map<String, Object> selectBySupplierCode(String supplierCode);
	//供应商列表
	List<Map<String,Object>> selectAllSupplier(Page page);
	//供应商总数
	int selectCount();
}
