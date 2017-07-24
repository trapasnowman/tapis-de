<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>购物车</title>
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/cartForm.css">
</head>
<body>   
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
                                            <th class="product-name">Book</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Count</th>
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
                                                <img  alt=商品" class="shop_thumbnail" src="image/${good.picture}">
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
                                        <tr>
                                            <td class="actions" colspan="6">
                                                <input type="submit" value="立即购买" name="proceed" class="checkout-button button alt wc-forward">
                                            </td>
                                        </tr>
                                    </tbody>
                       		</c:forEach>
                       	</c:forEach>	     
                       	
                                </table>
                            </form>
                     </div>
                </div>
            </div>
        </div>
    </div> 
</body>

</html>
