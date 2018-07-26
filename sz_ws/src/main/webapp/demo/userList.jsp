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
    <link rel="icon" href="../frame/static/image/code.png">	
  </head>
  <body class="body">
	
<!-- 工具集 -->
<div class="my-btn-box">
    <span class="fl">
    	<a class="layui-btn btn-add btn-default" id="btn-add" window.parent.location.href="addUser.jsp">添加</a>
    </span>
    
    <span class="fr">
        <span class="layui-form-label">搜索条件：</span>
        <div class="layui-input-inline">
            <input type="text" autocomplete="off" placeholder="请输入搜索条件" class="layui-input">
        </div>
        <button class="layui-btn mgl-20">查询</button>
    </span>
</div>
<div class="layui-form">
  <table class="layui-table" id="userList">
    <thead>
      <tr>
        <th>名字</th>
        <th>编号</th>
        <th>权限角色</th>
        <th>邮箱</th>
        <th>联系电话</th>
        <th>门店名字</th>
        <th>创建时间</th>
        <th>操作</th>
      </tr> 
    </thead>
    <tbody>
    </tbody>
  </table>
  
  <div id="demo7"></div>
</div>

<script type="text/javascript" src="frame/layui/layui.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
    // layui方法
    layui.use(['table', 'form', 'laypage','layer'], function () {
        // 操作对象
        var form = layui.form
                , table = layui.table
                , layer = layui.layer
                , laypage =layui.laypage
                , $ = layui.jquery;
        // 获取选中行
        table.on('checkbox(dataCheck)', function (obj) {
            layer.msg('123');
            console.log(obj.checked); //当前是否选中状态
            console.log(obj.data); //选中行的相关数据
            console.log(obj.type); //如果触发的是全选，则为：all，如果触发的是单选，则为：one
        });
      //完整功能
        laypage.render({
          elem: 'demo7'
          ,count: 100
          ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
          ,jump: function(obj){
            console.log(obj)
          }
        });
      	
      	/* $("#btn-add").click(function(){
      		window.parent.location.href="addUser.jsp";
      		
      	}); */
        
        $(document).ready(function(){
        	var condition={"storeCode":''};
        	var page={"pageRow":''};
        	$.ajax({
        		url:"<%=basePath%>queryUserList",
        		contentType:'application/json',
        		type:"post",
        		dataType:"json",
        		data:{"condition":JSON.stringify(condition)},
        		success:function(data){
        			var users=data.data;
        			for (var i= 0; i < users.length; i++) {
        				$("#userList tbody").prepend(
        						"<tr><td>"+users[i].userName+"</td><td>"+users[i].userCode+"</td><td>"+users[i].userRole+"</td><td>"+users[i].userMail+"</td><td>"+users[i].userTel+"</td><td>"+users[i].storeName+"</td><td>"+users[i].createTime+"</td><td>"
	        				        	+"<button class='layui-btn'>"+"编辑"+"</button>"
	        				        	+"<button class='layui-btn layui-btn-danger'>"+"删除"+"</button>"+
	        				        "</td></tr>"
        						
        				);
					}
        		}
        	});
        	
        });
    });
    
</script>
</body>
</html>
