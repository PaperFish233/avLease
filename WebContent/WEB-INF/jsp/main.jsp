<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主界面</title>
</head>
<body>
<!--根据用户类型不同，选择不同导航栏-->
<%
    if((Integer)session.getAttribute("Uauthority")==1){%>
    
     <%@include file="admin_menu.jsp" %>
       <h1 style="margin-top:12%;" align="center">欢迎<font color=Red>管理员：${sessionScope.Uaccount}</font>登录音像租赁系统！</h1><br>
     <%
    }else{%>
       <%@include file="user_menu.jsp" %>
       <h1 style="margin-top:12%;" align="center">欢迎<font color=Blue>用户：${sessionScope.Uaccount}</font>登录音像租赁系统！</h1><br>
    <% 
    }
    %>
    
 <div class="layui-form-item" style="margin-top:20%;">
 </div>
       <%@ include file="copyright.jsp"%>
</body>
</html>