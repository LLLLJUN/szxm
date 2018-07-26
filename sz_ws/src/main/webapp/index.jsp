<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
    <!-- <link rel="icon" href="frame/static/image/code.png"> -->
  </head>
  <body>
	<div class="layui-layout layui-layout-admin">
	    <!-- header -->
	    <div class="layui-header my-header">
	        <a href="index.html">
	            <div class="my-header-logo">尚装智慧门店后台</div>
	        </a>
	        <div class="my-header-btn">
	            <button class="layui-btn layui-btn-small btn-nav"><i class="layui-icon">&#xe65f;</i></button>
	        </div>
	
	        <!-- 顶部左侧添加选项卡监听 -->
	        <ul class="layui-nav" lay-filter="side-top-left">
	        </ul>
	
	        <!-- 顶部右侧添加选项卡监听 -->
	        <ul class="layui-nav my-header-user-nav" lay-filter="side-top-right">
	            <li class="layui-nav-item">
	                <a class="name" href="javascript:;"> Admin </a>
	                <dl class="layui-nav-child">
	                    <dd><a href="/"><i class="layui-icon">&#x1006;</i>退出</a></dd>
	                </dl>
	            </li>
	        </ul>
 	    </div>
	    <!-- side -->
	    <div class="layui-side my-side">
	        <div class="layui-side-scroll">
	            <!-- 左侧主菜单添加选项卡监听 -->
	            <ul class="layui-nav layui-nav-tree" lay-filter="side-main">
	               <li class="layui-nav-item  layui-nav-itemed">
	                    <a href="javascript:;"><i class="layui-icon">&#xe620;</i>用户管理</a>
	                    <dl class="layui-nav-child">
	                        <dd><a href="javascript:;" href-url="demo/userList.jsp"><i class="layui-icon">&#xe621;</i>用户列表</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/addUser.jsp"><i class="layui-icon">&#xe621;</i>新增用户</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/editUser.jsp"><i class="layui-icon">&#xe621;</i>编辑用户</a></dd>
	                    </dl>
	                </li>
	                <li class="layui-nav-item">
	                    <a href="javascript:;"><i class="layui-icon">&#xe628;</i>货品管理</a>
	                    <dl class="layui-nav-child">
	                        <!-- <dd><a href="javascript:;" href-url="demo/login.html"><i class="layui-icon">&#xe621;</i>登录页</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/register.html"><i class="layui-icon">&#xe621;</i>注册页</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/login2.html"><i class="layui-icon">&#xe621;</i>登录页2</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/map.html"><i class="layui-icon">&#xe621;</i>图表</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/add-edit.html"><i class="layui-icon">&#xe621;</i>添加-修改</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/data-table.html"><i class="layui-icon">&#xe621;</i>data-table 表格页</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/tree-table.html"><i class="layui-icon">&#xe621;</i>Tree table树表格页</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/404.html"><i class="layui-icon">&#xe621;</i>404页</a></dd>
	                        <dd><a href="javascript:;" href-url="demo/tips.html"><i class="layui-icon">&#xe621;</i>提示页</a></dd> -->
	                    </dl>
	                </li>
	                <li class="layui-nav-item">
	                	<a href="javascript:;"><i class="layui-icon">&#xe636;</i>数据管理</a>
	                	<dl class="layui-nav-child">
	                        <!-- <dd><a href="javascript:;" href-url="demo/login.html"><i class="layui-icon">&#xe621;</i>登录页</a></dd> -->
	                    </dl>
	                </li>
	                <li class="layui-nav-item">
	                	<a href="javascript:;"><i class="layui-icon">&#xe638;</i>营销管理</a>
	                	<dl class="layui-nav-child">
	                        <!-- <dd><a href="javascript:;" href-url="demo/login.html"><i class="layui-icon">&#xe621;</i>登录页</a></dd> -->
	                    </dl>
	                </li>
	            </ul>
	
	        </div>
	    </div>
	    <!-- body -->
	    <div class="layui-body my-body">
	        <div class="layui-tab layui-tab-card my-tab" lay-filter="card" lay-allowClose="true">
	            <ul class="layui-tab-title">
	                <li class="layui-this" lay-id="1"><span><i class="layui-icon">&#xe638;</i>欢迎页</span></li>
	            </ul>
	            <div class="layui-tab-content">
	                <div class="layui-tab-item layui-show">
	                    <iframe id="iframe" src="demo/welcome.jsp" frameborder="0"></iframe>
	                </div>
	            </div>
	        </div>
	    </div>
	    <!-- footer -->
	    <div class="layui-footer my-footer">
	        
	    </div>
	</div>
	
	<!-- 右键菜单 -->
	<div class="my-dblclick-box none">
	    <table class="layui-tab dblclick-tab">
	        <tr class="card-refresh">
	            <td><i class="layui-icon">&#x1002;</i>刷新当前标签</td>
	        </tr>
	        <tr class="card-close">
	            <td><i class="layui-icon">&#x1006;</i>关闭当前标签</td>
	        </tr>
	        <tr class="card-close-all">
	            <td><i class="layui-icon">&#x1006;</i>关闭所有标签</td>
	        </tr>
	    </table>
	</div>
	
	<script type="text/javascript" src="frame/layui/layui.js"></script>
	<script type="text/javascript" src="frame/static/js/vip_comm.js"></script>
	<script type="text/javascript">
	layui.use(['layer','vip_nav'], function () {
	    // 操作对象
	    var layer       = layui.layer
	        ,vipNav     = layui.vip_nav
	        ,$          = layui.jquery;
	
	    // 顶部左侧菜单生成 [请求地址,过滤ID,是否展开,携带参数]
	    //vipNav.top_left('./json/nav_top_left.json','side-top-left',false);
	    // 主体菜单生成 [请求地址,过滤ID,是否展开,携带参数]
	    vipNav.main('./json/nav_main.json','side-main',true);
	    // you code ...
	});
	</script>
	</body>
</html>
