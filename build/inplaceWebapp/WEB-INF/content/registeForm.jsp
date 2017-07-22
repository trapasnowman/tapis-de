<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>注册</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
<div class="htmleaf-container">
	<div class="wrapper">
		<div class="container">
			<h1></h1>			
			<form class="form" action="registe" method="post">		
				<input type="text" placeholder="用户名" name=loginname>
				<input type="password" placeholder="密码" name=password>
				<input type="text" placeholder="邮箱" name=email>
				<input type="text" placeholder="手机" name=phone>
				<input type="text" placeholder="地址" name=address>
				<button type="submit" id="register-button">注册</button><br/><br/>
			</form>
		</div>
	</div>
</div>
<div class="headfont">
<h1>欢迎您注册成为我们的会员！</h1>
</div>
</body>
</html>