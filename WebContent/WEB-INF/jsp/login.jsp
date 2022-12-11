<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
</head>
<body>
 <form name="form" method="post" action="${pageContext.request.contextPath}/loginUser" style="text-align: center">
  
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>音像租赁系统——登陆</legend>
</fieldset>

  <div class="layui-form-item" style="margin-top:5%;"> 
          <div class="layui-inline">
    <label class="layui-form-label">账号：</label>
    <div class="layui-input-inline">
      <input type="text" name="account" required  lay-verify="required" value="paperfish1" placeholder="请输入账号" autocomplete="off" class="layui-input">
    </div>
  </div>
</div>
  
   <div class="layui-form-item" style="margin-top:2%;">
             <div class="layui-inline">
    <label class="layui-form-label">密码：</label>
    <div class="layui-input-inline">
      <input type="password" name="password" required lay-verify="required" value="1" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
        </div>
</div>

    <div class="layui-form-item" style="margin-top:2%;">
      <button type="submit" class="layui-btn lay-submit">登录</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>


      
<a style="color:blue" href="${pageContext.request.contextPath}/route/register" >注册账号</a><br>


    <div class="layui-form-item" style="margin-top:12%;">
    <div class="layui-input-block">
    
        </div>
  </div>
    </form>  
   <%@ include file="copyright.jsp"%>

</body>
</html>