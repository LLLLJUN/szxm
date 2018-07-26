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

import com.service.StoresService;
import com.util.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author lujun
 * @date 2018年7月26日
 */
@Controller
@Api(value="门店接口")
public class StoresController {
	
	@Resource
	private StoresService storesService;
	
	@RequestMapping(value="queryStore",method=RequestMethod.GET)
	@ApiOperation(value="获取门店信息接口")
	@ResponseBody
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryStore(@RequestParam("storeCode")String storeCode){
		return storesService.queryStores(storeCode);
	}
}
