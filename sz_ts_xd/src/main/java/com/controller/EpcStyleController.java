package com.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.EpcStyleService;
import com.util.ResponseResult;

/**
 * @author lujun
 * @date 2018年6月21日
 */
@Controller
public class EpcStyleController {
	
	@Resource
	private EpcStyleService epcStyleService;
	
	@RequestMapping(value="selectByEpc" ,method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByEpc(@Param("epc")String epc){
		return epcStyleService.insertByEpc(epc);
	}
	
	@RequestMapping(value="selectByMatchStyle",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseResult<Map<String, Object>>> selectByMatchStyle(@Param("matchStyle")String matchStyle,@Param("style")String style){
		return epcStyleService.insertByMatchStyle(matchStyle, style);
	}
	
}
