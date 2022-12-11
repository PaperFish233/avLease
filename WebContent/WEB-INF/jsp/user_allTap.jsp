<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>音像列表</title>
</head>
<body>
	<%@include file="user_menu.jsp" %>
	<div class="layui-inline"></div>

	<%@include file="user_findTap.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>音像名称</th>
			<th>音像类别</th>
			<th>音像状态</th>
			<th>操作</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="tap" items="${taps}">
			<tr>
				<td>${tap.no}</td>
				<td>${tap.name}</td>
				<td>${tap.tname}</td>
				<td><c:if test="${tap.state eq 2}"><font color=Red>租赁中</font></c:if>
				<c:if test="${tap.state eq 1}"><font color=blue>待租赁</font></c:if></td>
				<td align="center"><a href="${pageContext.request.contextPath}/route/user_leaseTap?tapname=${tap.name}" class="layui-btn layui-btn-sm">租赁</a></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>