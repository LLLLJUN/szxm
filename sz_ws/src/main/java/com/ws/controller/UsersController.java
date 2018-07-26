package com.ws.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import com.ws.model.Condition;
import com.ws.model.ResponseResult;
import com.ws.model.Users;
import com.ws.service.UsersService;

/**
 * @author lujun
 * @date 2018年6月29日
 */
@Api(value="登录接口")
@Controller
public class UsersController {
	
	@Resource
	private UsersService usersService;
	
	@ApiOperation(value="登录")
	@RequestMapping(value="tologin")
	@ApiImplicitParams({
		@ApiImplicitParam(name="userCode",value="用户编码",required=true,dataType="String"),
		@ApiImplicitParam(name="userPsw",value="用户密码",required=true,dataType="String")
	})
	@ResponseBody
	public ResponseEntity<ResponseResult<Map<String, Object>>> tologin(@RequestParam("userCode")String userCode,@RequestParam("userPsw")String userPsw,
			HttpServletRequest requ,HttpServletResponse resp,HttpSession session){
		return usersService.selectLogin(userCode,userPsw,resp,requ,session);
	}
	
	@RequestMapping("login")
    public String login(Model model, HttpServletRequest req) throws  Exception{
		//如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
        String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");
        //根据shiro返回的异常类路径判断，抛出指定异常信息
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                //最终会抛给异常处理器
                model.addAttribute("errorMsg", "账号不存在");
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                model.addAttribute("errorMsg", "用户名/密码错误");
            } else {
                //最终在异常处理器生成未知错误.
                model.addAttribute("errorMsg", "其他异常信息");
            }
        }
        //此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
        //登陆失败还到login页面
        return "forward:/login.jsp";
    }
	
	@RequestMapping(value="addOrUpdateUsers",method=RequestMethod.POST)
	@ApiOperation(value="addOrUpdateUsers",httpMethod="POST",notes="根据用户信息进行新增或更新")
	@ApiImplicitParam(name="users",value="用户信息",dataType="Users")
	public ResponseEntity<ResponseResult<String>> addOrUpdateUsers(@RequestBody Users users,HttpServletRequest requ,HttpServletResponse resp){
		return usersService.addOrUpdateUsers(users);
	}
	
	@RequestMapping(value="deleteUsers",method=RequestMethod.GET)
	@ApiOperation(value="userCode",httpMethod="GET",notes="根据用户编码删除用户")
	@ApiImplicitParam(name="userCode",value="用户编码",dataType="String")
	public ResponseEntity<ResponseResult<String>> deleteUsers(@RequestParam("userCode")String[] userCode){
		return usersService.delUsers(userCode);
				
	}
	
	@RequestMapping(value="queryUserCode",method=RequestMethod.GET)
	@ApiOperation(value="userCode",httpMethod="GET",notes="查看用户编码是否存在")
	@ApiImplicitParam(name="userCode",value="用户编码",dataType="String")
	public ResponseEntity<ResponseResult<String>> queryUserCode(@RequestParam("userCode")String userCode){
		return usersService.queryUserCode(userCode);
				
	}
	
	@ApiOperation(value="用户列表")
	@RequestMapping(value="queryUserList",method=RequestMethod.POST)
	@ApiImplicitParams({
		@ApiImplicitParam(name="condition",value="条件",dataType="Condition"),
		@ApiImplicitParam(name="page",value="分页信息",dataType="Page")
	})
	@ResponseBody
	public ResponseEntity<ResponseResult<List<Map<String, Object>>>> queryUserList( Condition condition, Integer pageRow,
			HttpServletRequest requ,HttpServletResponse resp,HttpSession session){
		return usersService.queryUserList(condition, pageRow,session);
	}
	
}
