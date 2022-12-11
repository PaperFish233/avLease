<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>添加用户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addUser" method="post" class="layui-form" style="text-align: center">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——新增用户</legend>
</fieldset>

<div class="layui-form-item" style="margin-top:5%;">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">账号：</label>
    <div class="layui-input-inline">
      <input type="text" name="account" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>

<div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">昵称：</label>
    <div class="layui-input-inline">
      <input type="text" name="name" required  lay-verify="required" placeholder="请输入昵称" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
          <div class="layui-inline">
    <label class="layui-form-label"  style="width: 90px; ">密码：</label>
    <div class="layui-input-inline">
      <input type="text" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
  </div>
    </div>
   
   <div class="layui-form-item">
         <div class="layui-inline">
    <label class="layui-form-label">权限：</label>
    <div class="layui-input-block">
      <select name="authority" lay-filter="aihao">
        <option value="2">用户</option>
        <option value="1">管理员</option>
      </select>
    </div>
  </div>
    </div>
    
    <div class="layui-form-item">
      <button type="submit" class="layui-btn lay-submit">提交</button>
      <a class="layui-btn layui-btn-primary" href="${pageContext.request.contextPath}/allUsers" >取消</a>
    </div>
    
</body>
</html>