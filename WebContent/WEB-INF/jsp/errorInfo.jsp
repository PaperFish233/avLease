<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">
<script src="//unpkg.com/layui@2.6.8/dist/layui.js"></script>
<title>返回信息</title>
</head>
<body>


<%
    if((Integer)session.getAttribute("errorMessage")==1){%>
    
	<h1 style="margin-top:12%;" align="center"><font color=Red>用户名或密码错误，请重新输入！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转回登录页面！</h3>

	<% response.setHeader("refresh","3;URL=route/login");%> 
     
     <%
    }else if((Integer)session.getAttribute("errorMessage")==2){%>
       
    <h1 style="margin-top:12%;" align="center"><font color=blue>注册成功！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转回登录页面！</h3>

	<% response.setHeader("refresh","3;URL=route/login");%> 
       
     <%
    }else if((Integer)session.getAttribute("errorMessage")==3){%>
       
    <h1 style="margin-top:12%;" align="center"><font color=Red>已经存在重复账号，请重新输入！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转注册页面！</h3>

	<% response.setHeader("refresh","3;URL=route/register");%> 
	
	<%
    }else if((Integer)session.getAttribute("errorMessage")==4){%>
       
    <h1 style="margin-top:12%;" align="center"><font color=Red>已经存在重复账号，请重新输入！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转新增用户页面！</h3>

	<% response.setHeader("refresh","3;URL=route/admin_addUser");%> 
	
	<%
    }else if((Integer)session.getAttribute("errorMessage")==5){%>
       
    <h1 style="margin-top:12%;" align="center"><font color=blue>归还成功！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转订单管理页面！</h3>
	
	<script>
	function jumpurl(){
	location='${pageContext.request.contextPath}/allLeases';
	}
	setTimeout('jumpurl()',3000);
	</script>
	
	<%
    }else if((Integer)session.getAttribute("errorMessage")==6){%>
       
    <h1 style="margin-top:12%;" align="center"><font color=blue>归还成功！</font></h1>
	<h3 style="margin-top:1%;" align="center">页面将在5秒内跳转我的订单页面！</h3>

	<script>
	function jumpurl(){
	location='${pageContext.request.contextPath}/findLeaseByIdUser/${sessionScope.Uaccount}';
	}
	setTimeout('jumpurl()',3000);
	</script>	
       
    <% 
    }
    %>


</body>
</html>