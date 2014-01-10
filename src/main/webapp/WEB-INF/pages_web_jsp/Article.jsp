<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>Unify | Welcome...</title>

   <jsp:include page="head.jsp"></jsp:include>

           
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="/bonplans/resources/assets/plugins/font-awesome/css/font-awesome.css">
    <!-- CSS Page Style -->    
    <link rel="stylesheet" href="/bonplans/resources/assets/css/pages/portfolio-v2.css">    
        
</head> 

<body>
<jsp:include page="style_switcher.jsp"></jsp:include>

	<jsp:include page="top.jsp"></jsp:include>


	<jsp:include page="header.jsp"></jsp:include>  

<input required="required" type="text" value="${pseudo}" class="form-control"
										name="pseudo"  />



<!--=== Content Part ===-->
<div class="container"> 	
    <!-- Portfolio Sorting Blocks -->
    <div class="sorting-block">
        <ul class="sorting-nav sorting-nav-v1 text-center">
            <li class="filter" data-filter="all">All</li>
            <li class="filter" data-filter="category_1">UI Design</li>
            <li class="filter" data-filter="category_2">Wordpress</li>
            <li class="filter" data-filter="category_3">HTML5/CSS3</li>
            <li class="filter" data-filter="category_4">Bootstrap 3</li>
        </ul>

        <ul class="row sorting-grid">
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_1 category_3" data-cat="1">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/11.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_1" data-cat="3">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/12.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_1" data-cat="2">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/13.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_4" data-cat="3">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/3.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_1 category_4" data-cat="2">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/2.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_4" data-cat="1">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/6.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_3  category_4" data-cat="2">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/8.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_1 category_2 category_3" data-cat="1">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/1.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_4 category_2" data-cat="1">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/11.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_2" data-cat="3">
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/12.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
        </ul>
    
        <div class="clearfix"></div>
    </div>
    <!-- End Portfolio Sorting Blocks -->
</div><!--/container-->	 	
<!--=== End Content Part ===-->

<!--=== Footer ===-->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-4 md-margin-bottom-40">
                <!-- About -->
                <div class="headline"><h2>About</h2></div>  
                <p class="margin-bottom-25 md-margin-bottom-40">Unify is an incredibly beautiful responsive Bootstrap Template for corporate and creative professionals.</p>    

                <!-- Monthly Newsletter -->
                <div class="headline"><h2>Monthly Newsletter</h2></div> 
                <p>Subscribe to our newsletter and stay up to date with the latest news and deals!</p>
                <form class="footer-subsribe">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Email Address">                            
                        <span class="input-group-btn">
                            <button class="btn-u" type="button">Subscribe</button>
                        </span>
                    </div><!-- /input-group -->                    
                </form>                         
            </div><!--/col-md-4-->  
            
            <div class="col-md-4 md-margin-bottom-40">
                <div class="posts">
                    <div class="headline"><h2>Recent Blog Entries</h2></div>
                    <dl class="dl-horizontal">
                        <dt><a href="#"><img src="/bonplans/resources/assets/img/sliders/elastislide/6.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                    <dl class="dl-horizontal">
                    <dt><a href="#"><img src="/bonplans/resources/assets/img/sliders/elastislide/10.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                    <dl class="dl-horizontal">
                    <dt><a href="#"><img src="/bonplans/resources/assets/img/sliders/elastislide/11.jpg" alt="" /></a></dt>
                        <dd>
                            <p><a href="#">Anim moon officia Unify is an incredibly beautiful responsive Bootstrap Template</a></p> 
                        </dd>
                    </dl>
                </div>
            </div><!--/col-md-4-->

            <div class="col-md-4">
                <!-- Monthly Newsletter -->
                <div class="headline"><h2>Contact Us</h2></div> 
                <address class="md-margin-bottom-40">
                    25, Lorem Lis Street, Orange <br />
                    California, US <br />
                    Phone: 800 123 3456 <br />
                    Fax: 800 123 3456 <br />
                    Email: <a href="mailto:info@anybiz.com" class="">info@anybiz.com</a>
                </address>

                <!-- Stay Connected -->
                <div class="headline"><h2>Stay Connected</h2></div> 
                <ul class="social-icons">
                    <li><a href="#" data-original-title="Feed" class="social_rss"></a></li>
                    <li><a href="#" data-original-title="Facebook" class="social_facebook"></a></li>
                    <li><a href="#" data-original-title="Twitter" class="social_twitter"></a></li>
                    <li><a href="#" data-original-title="Goole Plus" class="social_googleplus"></a></li>
                    <li><a href="#" data-original-title="Pinterest" class="social_pintrest"></a></li>
                    <li><a href="#" data-original-title="Linkedin" class="social_linkedin"></a></li>
                    <li><a href="#" data-original-title="Vimeo" class="social_vimeo"></a></li>
                </ul>
            </div><!--/col-md-4-->
        </div><!--/row-->   
    </div><!--/container--> 
</div><!--/footer-->    
<!--=== End Footer ===-->

<!--=== Copyright ===-->
<div class="copyright">
    <div class="container">
        <div class="row">
            <div class="col-md-6">                      
                <p class="copyright-space">
                    2013 &copy; Unify. ALL Rights Reserved. 
                    <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
                </p>
            </div>
            <div class="col-md-6">  
                <a href="index.html">
                    <img id="logo-footer" src="/bonplans/resources/assets/img/logo2-default.png" class="pull-right" alt="" />
                </a>
            </div>
        </div><!--/row-->
    </div><!--/container--> 
</div><!--/copyright--> 
<!--=== End Copyright ===-->

<!-- JS Global Compulsory -->           
<script type="text/javascript" src="/bonplans/resources/assets/plugins/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/plugins/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="/bonplans/resources/assets/plugins/hover-dropdown.min.js"></script> 
<script type="text/javascript" src="/bonplans/resources/assets/plugins/back-to-top.js"></script>
<!-- JS Implementing Plugins -->           
<script type="text/javascript" src="/bonplans/resources/assets/plugins/jquery.mixitup.min.js"></script>    
<!-- JS Page Level -->           
<script type="text/javascript" src="/bonplans/resources/assets/js/app.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/js/pages/portfolio.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
        Portfolio.init();                             
    });
</script>
<!--[if lt IE 9]>
    <script src="/bonplans/resources/assets/plugins/respond.js"></script>
<![endif]-->

</body>
</html> 