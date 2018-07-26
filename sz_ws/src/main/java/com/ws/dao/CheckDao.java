package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Check;
import com.ws.model.Condition;
import com.ws.model.Page;

/**
 * @author lujun
 * @date 2018年7月5日
 */
public interface CheckDao {
	//新建盘点单保存
	int insertCheck(Check check);
	//盘点单详细信息
	List<Map<String, Object>> selectCheckByCheckBillCode(String checkBillCode);
	//待盘点单列表查询
	List<Map<String , Object>> selectCheckList(Page page);
	//待盘点单总数
	int selectAllCount(Condition condition);
	//待盘点单列表查询
	List<Map<String , Object>> selectYesCheckList(Page page);
	//待盘点单总数
	int selectYesAllCount(Condition condition);
	//盘点信息上传
	int updateCheck(Check check);
	
	
}
