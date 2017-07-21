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
			
			<form class="form" action="login" method="post">
				<input type="text" placeholder="用户名" name=loginname>
				<input type="password" placeholder="密码" name=password>
				<button type="submit" id="login-button">登录</button><br/><br/>
				<button type="submit" id="register-button"><a href="registerForm">注册</a></button>
			</form>
		</div>
	</div>
</div>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<div>
<h1>欢迎您成为我们的会员！</h1>
</div>
</body>
</html>