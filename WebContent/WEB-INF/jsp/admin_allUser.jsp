<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript">
    function confirmDel(param)
    {
      if(window.confirm("请确认是否删除该条数据?")){
        document.location="${pageContext.request.contextPath}/delUserById/"+param
      }
    }
  </script>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>用户列表</title>
</head>
<body>
	<%@include file="admin_menu.jsp" %>
	<td><a href="${pageContext.request.contextPath}/route/admin_addUser" class="layui-btn layui-btn-fluid">添加新用户</a> </td>
	<div class="layui-inline"></div>
    
	<%@include file="admin_findUser.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>账号</th>
			<th>昵称</th>
			<th>密码</th>
			<th>权限</th>
			<th>操作</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="user" items="${users}">
			<tr>
				<td>${user.no}</td>
				<td>${user.account}</td>
				<td>${user.name}</td>
				<td>${user.password}</td>
				<td><c:if test="${user.authority eq 2}"><font color=blue>用户</font></c:if>
				<c:if test="${user.authority eq 1}"><font color=Red>管理员</font></c:if></td>
				<td align="center"><a href="${pageContext.request.contextPath}/route/admin_upUser?account=${user.account}&name=${user.name}&password=${user.password}&authority=${user.authority}"  class="layui-btn layui-btn-sm">更新</a>
<button type="button" href="#" onclick="confirmDel(${user.no})" class="layui-btn layui-btn-sm layui-btn-danger">删除</button></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
</body>
</html>