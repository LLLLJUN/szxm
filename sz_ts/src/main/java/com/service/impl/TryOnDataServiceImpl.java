package com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.TryOnDataDao;
import com.model.TryOnData;
import com.service.TryOnDataService;
import com.util.RespResultGenerator;
import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年7月26日
 */
@Service
public class TryOnDataServiceImpl implements TryOnDataService {
	
	@Resource
	private TryOnDataDao tryOnDataDao;
	
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryTryOnData(String storeCode, String time) {
		try {
			if(storeCode!=null && !storeCode.equals("") && !time.equals("") && time!=null){
				TryOnData tryOnData=new TryOnData();
				tryOnData.setCreateTime(time);
				tryOnData.setStoreCode(storeCode);
				List<Map<String, Object>> tryOnDataList= tryOnDataDao.selectData(tryOnData);
				if(tryOnDataList.size()>0){
					return RespResultGenerator.genOK(tryOnDataList, "获取成功");
				}
				return RespResultGenerator.genError(null, "获取失败");
			}
			return RespResultGenerator.genError(null, "参数错误");
		} catch (Exception e) {
			e.printStackTrace();
			return RespResultGenerator.genError(null, "操作错误");
		}
	}

}
