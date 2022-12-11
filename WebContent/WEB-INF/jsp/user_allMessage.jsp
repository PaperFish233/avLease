<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>留言板列表</title>
</head>
<body>
	<%@include file="user_menu.jsp" %>
	<td><a href="${pageContext.request.contextPath}/route/user_addMessage" class="layui-btn layui-btn-fluid">发布新留言</a></td>
	<div class="layui-inline"></div>

	<%@include file="user_findMessage.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>发布者</th>
			<th>留言内容</th>
			<th>发布时间</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="message" items="${messages}">
			<tr>
				<td>${message.no}</td>
				<td>${message.name}</td>
				<td>${message.content}</td>
				<td>${message.time}</td>
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>