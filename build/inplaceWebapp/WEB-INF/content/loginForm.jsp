<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<h1>Welcome</h1>			
			<form class="form" action="login" method="post" id="loginForm">
				<input type="text" placeholder="用户名" name=loginname id="loginname">
				<input type="password" placeholder="密码" name=password id="password">
				<button type="submit" id="login-button" onclick="Save()">登录</button>
			</form>
				<a href="forgetpwd">忘记密码</a>&nbsp&nbsp<input type="checkbox" value="记住密码" id="remember" name="remember"/>记住密码<br/>
			<form class="form">	
				<a href="registeForm"><button type="button" id="register-button">注册</button></a>
			</form>
		</div>
	</div>
</div>
<div class="headfont">
<h1>Tapis De Fleurs 繁花似锦</h1>
</div>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/rememberpwd.js"></script>
</body>
</html>