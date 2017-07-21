<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" contentType="text/html; charset=UTF-8"/>
<title>详情</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.mins.js" ></script>
<!-- Custom Theme files -->
<link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />

<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
<script src="js/jquery.details.js"></script>
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
					<a href="index.html"><h1>Tapis de fleurs</h1></a>
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
					<li>商品</li>&nbsp;<span>&gt;</span>
					<li>详情</a></li>
                 </ul>
                <ul class="previous">
                	<li><a href="index.html">返回首页</a></li>
                </ul>
                <div class="clearfix"></div>
		</div>
	</div>
	<!-- start content -->
	<div class="women_main">
		<div class="container">
			<div class="row single">
				<div class="col-md-9 span-single">
					<div class="single_left">
						<div class="grid images_3_of_2">
							<ul id="etalage">
								<li>	
									<img class="etalage_thumb_image" src="image/${good.image }" class="img-responsive" />
									<img class="etalage_source_image" src="image/${good.image }" class="img-responsive" />								
								</li>
								<li>
									<img class="etalage_thumb_image" src="image/${good.picturea }" class="img-responsive" />
									<img class="etalage_source_image" src="image/${good.picturea }" class="img-responsive" />
								</li>
								<li>
									<img class="etalage_thumb_image" src="image/${good.pictureb }" class="img-responsive"  />
									<img class="etalage_source_image" src="image/${good.pictureb }"class="img-responsive"  />
								</li>
								<li>
									<img class="etalage_thumb_image" src="image/${good.picturec }" class="img-responsive"  />
									<img class="etalage_source_image" src="image/${good.picturec }"class="img-responsive"  />
								</li>
							</ul>
							<div class="clearfix"></div>		
						</div>
						<div class="desc1 span_3_of_2">
							<h3>${good.good_name }</h3>
							<p>¥ ${good.price }<a href="#">有一个超链接</a></p>
							<div class="det_nav">
								<h4>看看其他 :</h4>
								<ul>
									<li><a href="fresh"><img src="image/tapis-03.jpg" class="img-responsive" alt=""/></a></li>
									<li><a href="dried"><img src="image/tapis-2021.jpg" class="img-responsive" alt=""/></a></li>
									<li><a href="food"><img src="image/tapis-11.jpg" class="img-responsive" alt=""/></a></li>
								</ul>
							</div>
							<div class="filter-by-color">
							<h3>Filter by Color</h3>
							<ul class="w_nav2">
								<li><a class="color1" href="#"></a></li>
								<li><a class="color2" href="#"></a></li>
								<li><a class="color3" href="#"></a></li>
								<li><a class="color4" href="#"></a></li>
								<li><a class="color5" href="#"></a></li>
							</ul>
							</div>
							<div class="btn_form">
								<a href="single.html">立即购买</a>
							</div>
							<a href="#"><span>又有一个超链接 </span></a>	
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="single-bottom1">
					<h6>商品详情</h6>
					<p class="prod-desc">¥ ${good.material }</p>
					<p class="prod-desc">¥ ${good.packing }</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- content end -->		
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>