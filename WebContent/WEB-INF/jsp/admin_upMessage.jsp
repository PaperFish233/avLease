<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>更新留言</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upMessageById" method="post" style="text-align: center">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——更新留言</legend>
</fieldset>

<div class="layui-form-item"  style="margin-top:5%;">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">编号：</label>
    <div class="layui-input-inline">
      <input type="text" name="no" required lay-verify="required" placeholder="请输入编号" readonly value="${param.no}" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>

<div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">更新者：</label>
    <div class="layui-input-inline">
      <input type="text" name="name" required lay-verify="required" placeholder="请输入更新者" readonly value="${sessionScope.Uaccount}" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">留言内容：</label>
    <div class="layui-input-inline">
      <input type="text" name="content" required  lay-verify="required" placeholder="请输入公告内容" value=${param.content} autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
        <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">更新时间：</label>
    <div class="layui-input-inline">
      <input type="text" name="time" required  lay-verify="required" placeholder="请输入时间" readonly value="<%=(new java.util.Date()).toLocaleString()%>" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
      <button type="submit" class="layui-btn lay-submit">更新</button>
      <a class="layui-btn layui-btn-primary" href="${pageContext.request.contextPath}/allMessages" >取消</a>
    </div>
    
</body>
</html>