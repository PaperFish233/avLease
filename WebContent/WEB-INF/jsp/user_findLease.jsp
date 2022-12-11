<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>查找订单</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/findLeaseByIdUser2/${sessionScope.Uaccount}" method="post">
		
    <div class="layui-inline">
      <label class="layui-form-label">音像名称：</label>
      <div class="layui-input-inline">
        <input type="text" name="tap" class="layui-input">
      </div>
    </div>
    <div class="layui-inline">
      <div class="layui-input-inline">
       <button type="sumbit" class="layui-btn">查询</button>
      </div>
    </div>

	</form>
</body>
</html>