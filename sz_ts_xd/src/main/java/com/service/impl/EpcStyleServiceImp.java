package com.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.EpcStyleDao;
import com.service.EpcStyleService;
import com.util.RespResultGenerator;
import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年6月21日
 */
@Service
public class EpcStyleServiceImp implements EpcStyleService {
	
	@Resource
	private EpcStyleDao epcStyleDao;
	
	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByEpc(String epc) {
		try {
			if(epc!=null){
				Map<String,Object> epcStyle=epcStyleDao.selectByEpc(epc);
				if(epcStyle!=null){
					return RespResultGenerator.genOK(epcStyle, "获取成功");
				}else{
					return RespResultGenerator.genOK(null, "没有该数据");
				}
			}else{
				return RespResultGenerator.genError(null, "epc为空");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return RespResultGenerator.genError(null, "操作失败");
		}
	}

	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByMatchStyle(String matchStyle,String style) {
		try {
			if(matchStyle!=null&& style!=null){
				Map<String, Object> epcStyle=epcStyleDao.selectByMatchStyle(matchStyle);
			 	if(epcStyle!=null){
			 		return RespResultGenerator.genOK(epcStyle, "获取成功");
			 	}else{
			 		return RespResultGenerator.genError(null, "没有该数据");
			 	}
			}else{
				return RespResultGenerator.genError(null, "参数为空");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return RespResultGenerator.genError(null, "操作失败");
		}
		
	}

}
