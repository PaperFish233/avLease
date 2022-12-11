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
        document.location="${pageContext.request.contextPath}/delAnnouncementById/"+param
      }
    }
  </script>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>公告列表</title>
</head>
<body>
	<%@include file="admin_menu.jsp" %>
	<td><a href="${pageContext.request.contextPath}/route/admin_addAnnouncement" class="layui-btn layui-btn-fluid">发布新公告</a></td>
	<div class="layui-inline"></div>

	<%@include file="admin_findAnnouncement.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>发布者</th>
			<th>公告内容</th>
			<th>发布时间</th>
			<th>操作</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="announcement" items="${announcements}">
			<tr>
				<td>${announcement.no}</td>
				<td>${announcement.name}</td>
				<td>${announcement.content}</td>
				<td>${announcement.time}</td>
				<td align="center"><a href="${pageContext.request.contextPath}/route/admin_upAnnouncement?no=${announcement.no}&content=${announcement.content}" class="layui-btn layui-btn-sm">更新</a>
<button type="button" href="#" onclick="confirmDel(${announcement.no})" class="layui-btn layui-btn-sm layui-btn-danger">删除</button></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>