package com.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.AppVersionService;
import com.util.ResponseResult;

@Controller
public class AppVersionController {
	@Resource
	private AppVersionService appVersionService;
	
	@RequestMapping(value="selectAppVersion", method= RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseResult<Map<String,Object>>> selectAppVersion(Integer appVersion){
		return appVersionService.selectAppVersion(appVersion);
	};

	@RequestMapping(value="url", method= RequestMethod.GET)
	@ResponseBody
	public ModelAndView urlset(HttpServletRequest requst,HttpServletResponse response){
		response.setContentType("txt/html;Charset=UTF-8");
		return new ModelAndView("login");
	};
}
