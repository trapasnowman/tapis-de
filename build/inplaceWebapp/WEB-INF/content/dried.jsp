<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
<title>干花</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.mins.js"></script>
<!-- Custom Theme files -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<!--webfont-->
<link href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Dancing+Script:400,700' rel='stylesheet' type='text/css'>
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
						</ul>						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="dreamcrub">
		<div class="container">
			   	 <ul class="breadcrumbs">
                    <li>首页</li>&nbsp;<span>&gt;</span>
					<li>干花</a></li>
                 </ul>
                <ul class="previous">
                	<li><a href="index">返回首页</a></li>
                </ul>
                <div class="clearfix"></div>
		</div>
	</div>
	<!-- start content -->
		<div class="container">
	   		<div class="ft-ball">						
			<c:forEach items="${requestScope.good_list }" var="good">
				<div class="cont span_2_of_3">					
					<div class="box1">	
						<div class="col_1_of_single1 span_1_of_single1">
				     		<div class="view1 view-fifth1">
				  	  			<div class="top_box">
					  				<h3 class="m_1">${good.good_name}</h3>
					  				<p class="m_2">${good.material }</p>
									<a href="detail_good?good_sn=${good.good_sn }">
						   			<div class="css3"><img src="image/${good.picture }" alt=""></div></a>
                       				<div class="price">¥ ${good.price }</div>
					   			</div>
					    	</div>
							<ul class="list2">
								<li>
									<ul class="icon1 sub-icon1 profile_img">
										<li><a class="active-icon c1" href="cartForm">加入购物车</a></li>
									</ul>
								</li>
							</ul>
			    	    	<div class="clear"></div>
			    		</div>
			    	</div>
			    </div>					
			</c:forEach>		
			</div>
		</div>
	<!-- content-section-ends -->
</body>
</html>