package com.ws.dao;

import java.util.List;
import java.util.Map;

import com.ws.model.Condition;
import com.ws.model.GoodsTransfer;
import com.ws.model.Page;

/**
 * @author lujun
 * @date 2018年7月6日
 */
public interface GoodsTransferDao {
	//插入转货单信息
   int	insertGoodsTransfer(GoodsTransfer goodsTransfer);
   //删除转货单信息
   int deleteGoodsTransfer(String transferCode);
   //转货单详细信息查看
   List<Map<String, Object>> selectByTransferCode(String transferCode);
   //转货单列表查询
   List<Map<String, Object>> selectGoodsTransferList(Page page);
   //转货单总数查询
   int selectAllCount(Condition condition);
}
