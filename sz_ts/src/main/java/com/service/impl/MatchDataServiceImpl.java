package com.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.MatchDataDao;
import com.model.MatchData;
import com.service.MatchDataService;
import com.util.RespResultGenerator;
import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年7月26日
 */
@Service
public class MatchDataServiceImpl implements MatchDataService {
	
	@Resource
	private MatchDataDao matchDataDao;
	
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryMatchData(String storeCode, String time) {
		try {
			if(storeCode!=null && !storeCode.equals("") && !time.equals("") && time!=null){
				MatchData matchData=new MatchData();
				matchData.setCreateTime(time);
				matchData.setStoreCode(storeCode);
				List<Map<String, Object>> matchDataList= matchDataDao.selectMatchData(matchData);
				if(matchDataList.size()>0){
					return RespResultGenerator.genOK(matchDataList, "获取成功");
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
