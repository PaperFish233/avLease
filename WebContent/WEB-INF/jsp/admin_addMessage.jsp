<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>添加留言</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addMessage" method="post" style="text-align: center">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——添加新留言</legend>
</fieldset>

<div class="layui-form-item"  style="margin-top:5%;">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">发布者：</label>
    <div class="layui-input-inline">
      <input type="text" name="name" required lay-verify="required" placeholder="请输入发布者" readonly value="${sessionScope.Uaccount}" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">留言内容：</label>
    <div class="layui-input-inline">
      <input type="text" name="content" required  lay-verify="required" placeholder="请输入留言内容" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
        <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 120px; ">发布时间：</label>
    <div class="layui-input-inline">
      <input type="text" name="time" required  lay-verify="required" placeholder="请输入时间" readonly value="<%=(new java.util.Date()).toLocaleString()%>" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
      <button type="submit" class="layui-btn lay-submit">提交</button>
      <a class="layui-btn layui-btn-primary" href="${pageContext.request.contextPath}/allMessages" >取消</a>
    </div>
    
</body>
</html>