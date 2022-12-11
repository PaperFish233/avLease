<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>添加音像</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addTap" method="post" class="layui-form" style="text-align: center">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——添加新音像</legend>
</fieldset>

<div class="layui-form-item"  style="margin-top:5%;">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">音像名称：</label>
    <div class="layui-input-inline">
      <input type="text" name="name" required lay-verify="required" placeholder="请输入音像名称" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
       <div class="layui-form-item">
         <div class="layui-inline">
    <label class="layui-form-label">音像类型：</label>
    <div class="layui-input-block">
      <select name="tno" lay-filter="aihao">
    <%
        String username="root";
        String password="908520"; 
        String url="jdbc:mysql://localhost:3306/avLease?serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");//填写driverclass mysql8以上 com.mysql.cj.jdbc.Driver
        Connection conn= DriverManager.getConnection(url,username,password);
        String strSql="select * from type";
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(strSql);
        while(rs.next()){ //循环遍历输出
            //值获取从索引1开始 比如 1 是id 2 是 name 在这里就是显示name 把 id 用来传参
            out.print("<option value="+rs.getString(1)+">"+rs.getString(2)+"</option>");
        }
    %>
      </select>
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
      <button type="submit" class="layui-btn lay-submit">提交</button>
      <a class="layui-btn layui-btn-primary" href="${pageContext.request.contextPath}/allTaps" >取消</a>
    </div>
    
</body>
</html>