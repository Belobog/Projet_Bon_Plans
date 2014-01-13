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


<!--=== Content Part ===-->
<div class="container"> 	
    <!-- Portfolio Sorting Blocks -->
    <div class="sorting-block">
        <ul class="sorting-nav sorting-nav-v1 text-center">
        	<li class="filter" data-filter="all">All</li>
        	<c:forEach items="${categories}" var="categorie">
        		<li class="filter" data-filter="category_${categorie.getId()}">${categorie.getNom()}</li>
        	</c:forEach>
        </ul>

        <ul class="row sorting-grid">
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_1 category_3" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/11.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 1</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_1" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/12.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 2</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_1" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/13.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 3</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_4" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/3.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 4</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_1 category_4" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/2.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 5</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_4" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/6.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 6</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_2 category_3  category_4" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/8.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 7</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_1 category_2 category_3" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/1.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 8</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_4 category_2" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/11.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 9</span>
                        <p>Anim pariatur cliche reprehenderit</p>
                    </span>
                </a>
            </li>
            <li class="col-md-3 col-sm-6 col-xs-12 mix category_3 category_2" >
                <a href="#">
                    <img class="img-responsive" src="/bonplans/resources/assets/img/main/12.jpg" alt="">
                    <span class="sorting-cover">
                        <span>Happy New Year 10</span>
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

<jsp:include page="footer.jsp"></jsp:include>
<jsp:include page="copyright.jsp"></jsp:include>

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