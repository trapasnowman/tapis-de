<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<title>修改密码</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.mins.js"></script>
<!-- Custom Theme files -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
    <!-- header-section-starts -->
	<div class="header">
		<div class="top-header">
			<div class="container">
				<div class="header-left">
					<p>最美的呈现，只为最爱的你</p>
				</div>
			</div>
		</div>
		<div class="bottom-header">
			<div class="container">
				<div class="logo">
					<a href="index"><h1>Tapis de fleurs</h1></a>
				</div>
				<div class="header_bottom_right">
					<div class="h_menu4">	
						<ul class="nav">
							<li ><a href="index">首页</a></li>
							<li><a href="fresh" >鲜花</a></li>
							<li><a href="dried">干花</a></li>
							<li><a href="food">美食</a></li>
							<li><a href="cartForm">购物车</a></li>
							<li><a href="changepwd">修改密码</a></li>
						</ul>						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<div class="changepwd">
		<form  action="updatepassword" method="post">
			用户名：<input type="text" placeholder="用户名" name=loginname><br/><br/>
			新密码：<input type="password" placeholder="密码" name=password><br/><br/>
			<button type="submit" id="changepwd">提交新密码</button><br/>
		</form>
	</div>
</body>
</html>