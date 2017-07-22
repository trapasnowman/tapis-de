<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Tapis.com</title>
    <!-- load stylesheets -->  
    <link rel="stylesheet" href="css/bootstrap.min.css">                                    
    <link rel="stylesheet" href="css/bootstrap-theme.min.css">                              
    <link rel="stylesheet" href="css/style.css">                                 

</head>
    <body>        
        <div class="container">
            <div class="row">
                <div class="tm-left-right-container">
                    <!-- Left column: logo and menu -->
                    <div class="tm-blue-bg tm-left-column">                        
                        <div class="tm-logo-div text-xs-center">
                            <img src="image/flower-logo.png" alt="Logo">
                            <h1 class="tm-site-name">tapis de fleurs</h1>
                            <p>${sessionScope.user.loginname }，欢迎你！当前在线人数：${applicationScope.count}</p>
                        </div>
                        <nav class="tm-main-nav">
                            <ul class="tm-main-nav-ul">
                                <li class="tm-nav-item">
                                    <a href="#welcome" class="tm-nav-item-link">Welcome</a>
                                </li>
                                <li class="tm-nav-item">
                                    <a href="#about" class="tm-nav-item-link">繁花似锦</a>
                                </li>
                                <li class="tm-nav-item">
                                    <a href="#galleryone" class="tm-nav-item-link">鲜花专区</a>
                                </li>
                                <li class="tm-nav-item">
                                    <a href="#secondgallery" class="tm-nav-item-link">干花专区</a>
                                </li>
                                <li class="tm-nav-item">
                                    <a href="#thirdgallery" class="tm-nav-item-link">食品专区</a>
                                </li>
                            </ul>
                        </nav>                                         
                    </div> <!-- Left column: logo and menu -->

                    
                    <!-- Right column: content -->
                    <div class="tm-right-column">
                        <figure>
                            <img src="image/tapis-01.jpg">    
                        </figure>

                        <div class="tm-content-div">
                            <!-- Welcome section -->
                            <section id="welcome" class="tm-section">
                                <header>
                                    <h2 class="tm-blue-text tm-welcome-title tm-margin-b-45">Welcome to Tapis De Fleurs</h2>
                                </header>
                                <p>我听见回声，来自山谷和心间
以寂寞的镰刀收割空旷的灵魂
不断地重复决绝，又重复幸福
终有绿洲摇曳在沙漠
我相信自己
生来如同璀璨的夏日之花
不凋不败，妖冶如火
承受心跳的负荷和呼吸的累赘
乐此不疲   --泰戈尔《生如夏花》
</p>
                            </section>
                            <!-- About section -->
                            <section id="about" class="tm-section">
                                <div class="row">                                                                
                                    <div class="col-lg-8 col-md-7 col-sm-12 col-xs-12 push-lg-4 push-md-5">
                                        <header>
                                            <h2 class="tm-blue-text tm-section-title tm-margin-b-45">繁花似锦</h2>
                                        </header>
                                        <p>来自顶尖花艺师的精心设计，空运昆明最新鲜的A级花材。从制作到您手中，24小时的等待只为最美的瞬间。</p>
                                        <p>矜贵花材,高贵礼盒，对挚爱的深情告白。不再只是瞬间，让美丽永恒，只为将“一生只爱一人”完美传达。</p>
                                        <p>对美食和美好的向往，对新鲜和健康的追求，精心设计，用心制作。将您的心意融化在舌尖的那一抹香醇。</p>
                                        <a href="#" class="tm-button tm-button-wide">Read More</a>  
                                    </div>

                                    <div class="col-lg-4 col-md-5 col-sm-12 col-xs-12 pull-lg-8 pull-md-7 tm-about-img-container">
                                        <img src="image/tapis-02.jpg" alt="Image" class="img-fluid">    
                                    </div>  
                                </div>                            
                            </section>  

                            <!-- Gallery One section -->     
                            <section id="galleryone" class="tm-section">
                                <a href="fresh">
                                	<header><h2 class="tm-blue-text tm-section-title tm-margin-b-30">鲜花专区</h2></header>
                                </a>
                                <div class="tm-gallery-container tm-gallery-1">
                                    <div class="tm-img-container tm-img-container-1">
                                        <a href="image/tapis-03.jpg"><img src="image/tapis-03.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    
                                    <div class="tm-img-container tm-img-container-1">
                                        <a href="image/tapis-04.jpg"><img src="image/tapis-04.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-1">
                                        <a href="image/tapis-05.jpg"><img src="image/tapis-05.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-1">
                                        <a href="image/tapis-06.jpg"><img src="image/tapis-06.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-1">
                                        <a href="image/tapis-07.jpg"><img src="image/tapis-07.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>                                    
                                </div>
                            </section>

                            <!-- Second Gallery section -->     
                            <section id="secondgallery" class="tm-section">
                                <a href="dried">
                                	<header><h2 class="tm-blue-text tm-section-title tm-margin-b-30">干花专区</h2></header>
                                </a>
                                <div class="tm-gallery-container tm-gallery-2">
                                    <div class="tm-img-container tm-img-container-2">
                                        <a href="image/tapis-08.jpg"><img src="image/tapis-08.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-2">
                                        <a href="image/tapis-09.jpg"><img src="image/tapis-09.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-2">
                                        <a href="image/tapis-10.jpg"><img src="image/tapis-10.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>                                    
                                </div>
                            </section>

                            <!-- Third Gallery section -->     
                            <section id="thirdgallery" class="tm-section">
                                <a href="food">
                                	<header><h2 class="tm-blue-text tm-section-title tm-margin-b-30">食品专区</h2></header>
                                </a>	
                                <div class="tm-gallery-container tm-gallery-3">
                                    <div class="tm-img-container tm-img-container-3">
                                        <a href="image/tapis-11.jpg"><img src="image/tapis-11.jpg" alt="Image" class="img-fluid tm-img-tn"></a>    
                                    </div>
                                    <div class="tm-img-container tm-img-container-3">
                                        <a href="image/tapis-12.jpg"><img src="image/tapis-12.jpg" alt="Image" class="img-fluid tm-img-tn"></a>
                                    </div>
                                    <div class="tm-img-container tm-img-container-3">
                                        <a href="image/tapis-13.jpg"><img src="image/tapis-13.jpg" alt="Image" class="img-fluid tm-img-tn"></a>
                                    </div>
                                    <div class="tm-img-container tm-img-container-3">
                                        <a href="image/tapis-14.jpg"><img src="image/tapis-14.jpg" alt="Image" class="img-fluid tm-img-tn"></a>
                                    </div>                                    
                                </div>
                            </section>
                        </div>  
                        
                    </div> <!-- Right column: content -->
                </div>
            </div> <!-- row -->
        </div> <!-- container -->
                
        <!-- load JS files -->
        <script src="js/bootstrap.min.js"></script>           
        <script src="js/scripts.js"></script>    
        <script src="js/jquery.min.js"></script>      
        <script>     
       
            $(document).ready(function(){

                // Single page nav
                $('.tm-main-nav').singlePageNav({
                    'currentClass' : "active",
                    offset : 20
                });

                // Magnific pop up
                $('.tm-gallery-1').magnificPopup({
                  delegate: 'a', // child items selector, by clicking on it popup will open
                  type: 'image',
                  gallery: {enabled:true}
                  // other options
                }); 

                $('.tm-gallery-2').magnificPopup({
                  delegate: 'a', // child items selector, by clicking on it popup will open
                  type: 'image',
                  gallery: {enabled:true}
                  // other options
                }); 

                $('.tm-gallery-3').magnificPopup({
                  delegate: 'a', // child items selector, by clicking on it popup will open
                  type: 'image',
                  gallery: {enabled:true}
                  // other options
                }); 

                $('.tm-current-year').text(new Date().getFullYear());                
            });
        </script>             
</body>
</html>