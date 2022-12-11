<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户导航条</title>
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<script language="javascript">
function quit(){
	if(confirm("真的要退出系统吗?")){
		window.location.href="${pageContext.request.contextPath}/route/login";
	}
}

</script>
</head>
<body>

<script>
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
  var element = layui.element;
  
  //…
});
</script>

<ul class="layui-nav" lay-filter="">
  <li class="layui-nav-item"> <a href="${pageContext.request.contextPath}/route/main">首页</a></li>
  <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/allAnnouncementsUser">公告</a></li>
  <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/allMessagesUser">留言板</a></li>
    <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/allTapsUser">音像列表</a></li>
  <li class="layui-nav-item"><a href="${pageContext.request.contextPath}/findLeaseByIdUser/${sessionScope.Uaccount}">我的订单</a></li>
    <li class="layui-nav-item"><a href="#" onClick="quit()">退出账号</a></li>
</ul>

</body>
</html>