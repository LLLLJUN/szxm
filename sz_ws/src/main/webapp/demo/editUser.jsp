<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
	<link rel="stylesheet" href="frame/layui/css/layui.css">
    <link rel="stylesheet" href="frame/static/css/style.css">
    <link rel="icon" href="frame/static/image/code.png">	
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  </head>
  <body class="body">
	<form class="layui-form layui-form-pane">
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户姓名</label>
	        <div class="layui-input-inline">
	            <input type="text" id="userName" lay-verify="required" autocomplete="off" placeholder="请输入姓名" class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	    	<font id="fontname"></font><p>
	        <label class="layui-form-label">用户编码</label>
	        <div class="layui-input-inline">
	            <input type="text" id="userCode" lay-verify="required" placeholder="请输入编码"  class="layui-input">
	        </div>
	    </div>
	     <div class="layui-form-item">
	        <label class="layui-form-label">用户邮箱</label>
	        <div class="layui-input-inline">
	            <input type="text" id="userMail" lay-verify="email"  placeholder="请输入邮箱" class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户电话</label>
	        <div class="layui-input-inline">
	            <input type="text" id="userTel" lay-verify="phone"  placeholder="请输入电话"  class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">门店代码</label>
	        <div class="layui-input-inline">
	            <input type="text" id="storeCode" lay-verify="required" placeholder="请输入门店代码"  class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">密码</label>
	        <div class="layui-input-inline">
	            <input type="password" id="userPsw" placeholder="请输入密码"  class="layui-input">
	        </div>
	        <div class="layui-form-mid layui-word-aux">请务必填写密码</div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户角色</label>
	        <div class="layui-input-inline">
	            <select id="userRole" name="userRole" lay-filter="userRole" lay-verify="required" lay-search="required" aria-invalid="false">
	                
	            </select>
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <button class="layui-btn" lay-submit="" id="add" lay-filter="demo2">提交</button>
	    </div>
	</form>
  </body>
</html>
