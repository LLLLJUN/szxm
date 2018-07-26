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
	<script src="frame/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript">
		//重新渲染表单
  layui.use('form', function(){
  var form = layui.form; 
		$(document).ready(function(){ 
			$.ajax({
				url:"<%=basePath%>queryAllRoleInfo",
				dataType:"json",
				type:"get",
				success:function(data){
					var role=data.data
					for (var i=0; i< role.length; i++) {
						$("#userRole").append("<option value='"+role[i].id+"'>"+role[i].userRoleName+"</option>");
						form.render('select');
					}
				}
			});
		});
		
		$(function(){
			/* $("#userCode").blur(function(){
				var  userCode=$("#userCode").val();
				if(userCode!=""){
					
				}else{
					$("#fontname").attr({"size":1,"color":"red"}).html("用户编码不能为空");
				}
			});
			 */
            form.on('submit(demo2)', function(data){
            	$.ajax({
					url:"<%=basePath%>queryUserCode",
					data:{userCode:$("#userCode").val()},
					dataType:"json",
					type:"get",
					success:function(data){
						if(data.code==1){
							alert("该用户编号已经存在");
							/* $("#fontname").attr({"size":1,"color":"red"}).html("用户编码存在"); */
						}else if(data.code==0){
							var users={"userName":'',"userCode":'',"userTel":'',"userTel":'',"userMail":'',"storeCode":'',"userPsw":'',"userRole":''};
			    			var userName=$("#userName").val();
			    			var userCode=$("#userCode").val();
			    			var userTel=$("#userTel").val();
			    			var userMail=$("#userMail").val();
			    			var userPsw=$("#userPsw").val();
			    			var storeCode=$("#storeCode").val();
			    			form.on('select', function(data){
			    			  console.log(data.elem); //得到select原始DOM对象
			    			  console.log(data.value); //得到被选中的值]
			    			  $("#userRole").val(data.value)
			    			  console.log(data.othis); //得到美化后的DOM对象
			    			}); 
			    			var userRole=$("#userRole").val();
			                users.userName=userName;
			                users.userCode=userCode;
			                users.userTel=userTel;
			                users.userMail=userTel;
			                users.userPsw=userPsw;
			                users.storeCode=storeCode;
			                users.userRole=userRole;
			    				$.ajax({
			    					url:"<%=basePath%>addOrUpdateUsers",
			    					type:"post",
			    					contentType:'application/json',
			    					dataType:"json",
			    					data:JSON.stringify(users),
			    					success:function(data){
			    						if(data.code==1){
			    							alert("添加成功");
			    							/* window.parent.location.href="index.jsp"; */
			    							location.reload();
			    						}else if(data.code==0){
			    							alert("添加失败");
			    						}
			    					}
			    					
			    				});
							/* $("#fontname").attr({"size":1,"color":"green"}).html("用户编码可用"); */
						}
					}
				})
            	
	            return false;
	        });
            
			
		});
	});
	</script>
  </body>
</html>
