package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Condition;
import com.ws.model.OutStore;
import com.ws.model.Page;

/**
 * @author lujun
 * @date 2018年7月9日
 */
public interface OutStoreDao {
	//待出库列表查询
	List<Map<String, Object>> selectNoOutStoreList(Page page);
	//待出库列表总数查询
	int selectNoAllCount(Condition condition);
	//出库完成的商品信息上传
	int insertOutStore(OutStore outStore);
	//修改转货单状态
	int updateGoodsTransfer(OutStore outStore);
	//已出库列表查询
	List<Map<String, Object>> selectYesOutStoreList(Page page);
	//已出库单总数查询
	int selectYesAllCount(Condition condition);
	//待出库单详细信息查询
	Map<String, Object> selectByTransferCode(String transferCode);
	//已出库单详细信息查询
	List<Map<String, Object>> selectByOutStoreCode(String outStoreCode);
}
