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
        document.location="${pageContext.request.contextPath}/delTypeById/"+param
      }
    }
  </script>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>音像类别列表</title>
</head>
<body>
	<%@include file="admin_menu.jsp" %>
	<td><a href="${pageContext.request.contextPath}/route/admin_addType" class="layui-btn layui-btn-fluid">添加新类别</a></td>
	<div class="layui-inline"></div>

	<%@include file="admin_findType.jsp" %>

	<table class="layui-table">
    <thead>
		<tr>
			<th>编号</th>
			<th>类别名称</th>
			<th>操作</th>
		</tr>
		  </thead>
		   <tbody>
		<c:forEach varStatus="s" var="type" items="${types}">
			<tr>
				<td>${type.ttno}</td>
				<td>${type.ttname}</td>
				<td align="center"><a href="${pageContext.request.contextPath}/route/admin_upType?ttno=${type.ttno}&ttname=${type.ttname}" class="layui-btn layui-btn-sm">更新</a>
<button type="button" href="#" onclick="confirmDel(${type.ttno})" class="layui-btn layui-btn-sm layui-btn-danger">删除</button></td> 
			</tr>
		</c:forEach>
		  </tbody>
	</table>
	  <%@include file="copyright.jsp" %>
	  
	  
	 
</body>
</html>