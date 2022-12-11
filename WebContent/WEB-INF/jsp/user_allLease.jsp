<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>订单列表</title>
</head>
<body>
	<%@include file="user_menu.jsp" %>
	<div class="layui-inline"></div>
	
	<%@include file="user_findLease.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>租赁人</th>
			<th>音像名称</th>
			<th>租赁时间</th>
			<th>订单状态</th>
			<th>操作</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="lease" items="${leases}">
			<tr>
				<td>${lease.no}</td>
				<td>${lease.name}</td>
				<td>${lease.tap}</td>
				<td>${lease.time}</td>
				<td><c:if test="${lease.state eq 2}"><font color=Red>已完结</font></c:if>
				<c:if test="${lease.state eq 1}"><font color=blue>进行中</font></c:if></td>
				<td align="center"><a href="${pageContext.request.contextPath}/delLeaseByIdUser/${lease.no},${lease.tap}" class="layui-btn layui-btn-sm layui-btn-danger">归还</button></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>