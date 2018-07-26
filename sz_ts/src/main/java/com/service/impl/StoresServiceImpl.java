package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.StoresDao;
import com.service.StoresService;
import com.util.RespResultGenerator;
import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年7月26日
 */

@Service
public class StoresServiceImpl implements StoresService {
	@Resource
	private StoresDao storesDao;
	//ts_img_manage
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryStores(String storeCode) {
		try {
			List<Map<String, Object>> storesInfoList=new ArrayList<>();
			if(storeCode==null || storeCode.equals("")){
				storesInfoList=storesDao.selectAllStore();
			}else{
				Map<String, Object> storesInfo=storesDao.selectByStoreCode(storeCode);
				storesInfoList.add(storesInfo);
			}
			if(storesInfoList!=null){
				return RespResultGenerator.genOK(storesInfoList, "获取成功");
			}
			return RespResultGenerator.genError(null, "获取失败");
		} catch (Exception e) {
			e.printStackTrace();
			return RespResultGenerator.genError(null, "操作错误");
		}
	}

}
