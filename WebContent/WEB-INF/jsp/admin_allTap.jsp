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
        document.location="${pageContext.request.contextPath}/delTapById/"+param
      }
    }
  </script>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>音像列表</title>
</head>
<body>
	<%@include file="admin_menu.jsp" %>
	<td><a href="${pageContext.request.contextPath}/route/admin_addTap" class="layui-btn layui-btn-fluid">添加新音像</a></td>
	<div class="layui-inline"></div>

	<%@include file="admin_findTap.jsp" %>

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
				<td align="center"><a href="${pageContext.request.contextPath}/route/admin_upTap?no=${tap.no}&name=${tap.name}&tno=${tap.tno}&state=${tap.state}" class="layui-btn layui-btn-sm">更新</a>
<button type="button" href="#" onclick="confirmDel(${tap.no})" class="layui-btn layui-btn-sm layui-btn-danger">删除</button></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>