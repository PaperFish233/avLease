<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>创建订单</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/leaseTap" method="post" class="layui-form" style="text-align: center">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——订单信息</legend>
</fieldset>

<div class="layui-form-item" style="margin-top:5%;">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">租赁人：</label>
    <div class="layui-input-inline">
      <input type="text" name="name" required lay-verify="required" placeholder="请输入租赁人" readonly value="${sessionScope.Uaccount}" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
 <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">音像名称：</label>
    <div class="layui-input-inline">
      <input type="text" name=tap required lay-verify="required" placeholder="请输入音像名称" readonly value=${param.tapname} autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
                <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">租赁时间：</label>
    <div class="layui-input-inline">
      <input type="text" name="time" required  lay-verify="required" placeholder="请输入时间" readonly value="<%=(new java.util.Date()).toLocaleString()%>" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
      <button type="submit" class="layui-btn lay-submit">确定</button>
      <a class="layui-btn layui-btn-primary" href="${pageContext.request.contextPath}/allTapsUser" >取消</a>
    </div>
    
</body>
</html>