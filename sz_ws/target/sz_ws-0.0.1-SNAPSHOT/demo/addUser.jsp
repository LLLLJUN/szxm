<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加用户</title>
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
	<form class="layui-form layui-form-pane" action="<%=basePath%>addOrUpdateUsers" method="post">
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户姓名</label>
	        <div class="layui-input-inline">
	            <input type="text" name="userName" lay-verify="required" autocomplete="off" placeholder="请输入姓名" class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户编码</label>
	        <div class="layui-input-inline">
	            <input type="text" name="userCode" lay-verify="required" placeholder="请输入编码"  class="layui-input">
	        </div>
	    </div>
	     <div class="layui-form-item">
	        <label class="layui-form-label">用户邮箱</label>
	        <div class="layui-input-inline">
	            <input type="text" name="userMail" lay-verify="email"  placeholder="请输入邮箱" class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户电话</label>
	        <div class="layui-input-inline">
	            <input type="text" name="userTel" lay-verify="phone"  placeholder="请输入电话"  class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">门店代码</label>
	        <div class="layui-input-inline">
	            <input type="text" name="storeCode" lay-verify="required" placeholder="请输入门店代码"  class="layui-input">
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">密码</label>
	        <div class="layui-input-inline">
	            <input type="password" name="userPsw" placeholder="请输入密码"  class="layui-input">
	        </div>
	        <div class="layui-form-mid layui-word-aux">请务必填写密码</div>
	    </div>
	    <div class="layui-form-item">
	        <label class="layui-form-label">用户角色</label>
	        <div class="layui-input-inline">
	            <select name="userRole" id="roles">
	                <option>请选择角色</option>
	            </select>
	        </div>
	    </div>
	    <div class="layui-form-item">
	        <button class="layui-btn" type="submit" lay-submit="" lay-filter="demo2">提交</button>
	    </div>
	</form>
	<script src="frame/layui/layui.js" charset="utf-8"></script>
	<script>
	    layui.use(['form', 'layedit', 'laydate'], function(){
	        var form = layui.form
	                ,layer = layui.layer
	                ,layedit = layui.layedit
	                ,laydate = layui.laydate;
	        //日期
	        laydate.render({
	            elem: '#date'
	        });
	        laydate.render({
	            elem: '#date1'
	        });
	        //创建一个编辑器
	        var editIndex = layedit.build('LAY_demo_editor');
	        //监听提交
	        form.on('submit(demo1)', function(data){
	            layer.alert(JSON.stringify(data.field), {
	                title: '最终的提交信息'
	            });
	            return false;
	        });
	    });
	</script>
	<script type="text/javascript">
		$(document).ready(function(){ 
			$.ajax({
				url:"<%=basePath%>queryAllRoleInfo",
				dataType:"json",
				type:"get",
				success:function(data){
					var role=data.data
					for (var i=0; i< role.length; i++) {
						$("#roles").append("<option value='"+role[i].id+"'>"+role[i].userRoleName+"</option>");
						
					}
				}
			});
		})
		
	</script>
  </body>
</html>
