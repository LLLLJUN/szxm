package com.ws.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import com.ws.model.Condition;
import com.ws.model.ResponseResult;
import com.ws.model.Users;


/**
 * @author lujun
 * @date 2018年6月29日
 */
public interface UsersService {
	//登录
	ResponseEntity<ResponseResult<Map<String,Object>>> selectLogin(@Param("userName")String userCode,@Param("userPsw")String userPsw,
			HttpServletResponse resp,HttpServletRequest requ,HttpSession session);
	//插入权限
	Users queryByUserCode(String userCode);
	//新增用户
	ResponseEntity<ResponseResult<String>> addOrUpdateUsers(@Param("users")Users users);
	//删除用户
	ResponseEntity<ResponseResult<String>> delUsers(@Param("userCode")String [] userCode);
	
	ResponseEntity<ResponseResult<String>> queryUserCode(@Param("userCode")String userCode);
	
	ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryUserList(@Param("condition") Condition condition,@Param("page") Integer page,HttpSession session);
}
