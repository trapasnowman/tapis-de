<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>购物车</title>
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/cartForm.css">
    <link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
	<link rel="stylesheet" href="css/etalage.css">
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
							<li><a href="cart">购物车</a></li>
							<li><a href="changepwd">修改密码</a></li>
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
					<li>购物车</li>
                 </ul>
                <ul class="previous">
                	<li><a href="index">返回首页</a></li>
                </ul>
                <div class="clearfix"></div>
		</div>
	</div>
   <div class="juzhong">
     <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="remove">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">购物车</th>
                                            <th class="product-thumbnail">图片</th>
                                            <th class="product-name">商品名</th>
                                            <th class="product-price">价格</th>
                                            <th class="product-quantity">数量</th>
                                        </tr>
                                    </thead>
                <c:forEach items="${requestScope.cart_list }" var="cart">
                	<c:forEach items="${cart.good }" var="good">
                                    <tbody>
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove"  href="remove?good_id=${good.id}">×</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <img  class="shop_thumbnail" src="image/${good.picture}">
                                            </td>

                                            <td class="product-name">
                                                ${good.good_name}
                                            </td>

                                            <td class="product-price">
                                                ${good.price}
                                            </td>

                                            <td class="product-quantity">
                                                <div class="quantity buttons_added">
                                                    <a  href="reduce?good_id=${good.id}" class="minus" >-</a>
                                                    ${cart.count}
                                                    <a  href="increase?good_id=${good.id}"  class="plus" >+</a>
                                                </div>
                                            </td>
                                        </tr>

                                    </tbody>
                       		</c:forEach>
                       	</c:forEach>	     
                                        <tr>
                                            <td class="actions" colspan="6">
                                                <input type="submit" value="立即购买" name="proceed" class="checkout-button button alt wc-forward">
                                            </td>
                                        </tr>                       	
                                </table>
                            </form>
                     </div>
                </div>
            </div>
        </div>
    </div> 
 </div>   
</body>

</html>
