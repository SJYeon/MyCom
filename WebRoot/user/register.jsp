<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="register" method="post">
  	手机号：<input name="user.phone"><br>
  	密&nbsp;码:<input type="password" name="user.password"><br>
  	昵&nbsp;称：<input name="user.nickname"><br>
  	E-mail:<input name="user.email"><br>
  	邀请人id：<input name="inviterid"><br>
  	学校:<select name="user.school">
  			<option value="西安电子科技大学老校区">西安电子科技大学老校区</option>
  		</select><br>
  	性别:<select name="user.sex">
  			<option value="男">男</option>
  			<option value="女">女</option>
  			<option value="保密">保密</option>
  		</select><br>
  	QQ:<input name="user.qq"><br>
  	<input type="submit" value="注册">
   </form>
  </body>
</html>
