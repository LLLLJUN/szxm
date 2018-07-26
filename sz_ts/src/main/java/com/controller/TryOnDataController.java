package com.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.TryOnDataService;
import com.util.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author lujun
 * @date 2018年7月26日
 */
@Api(value="试穿数据接口")
@Controller
public class TryOnDataController {
	
	@Resource
	private TryOnDataService tryOnDataService;
	
	@ApiOperation(value="获取试穿数据")
	@RequestMapping(value="queryTryOnData",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryTryOnData(@RequestParam("storeCode")String storeCode,
			@RequestParam("time")String time){
		return tryOnDataService.queryTryOnData(storeCode, time);
		
	}
}
