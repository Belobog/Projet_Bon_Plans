<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->  
<head>
    <title>Connexion</title>

    <jsp:include page="head.jsp"></jsp:include>       
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="/bonplans/resources/assets/plugins/font-awesome/css/font-awesome.css">
    <!-- CSS Page Style -->    
    <link rel="stylesheet" href="/bonplans/resources/assets/css/pages/page_log_reg_v2.css">        
</head> 

<body>
<jsp:include page="style_switcher.jsp"></jsp:include>   

<!--=== Content Part ===-->    
<div class="container">
    <!--Reg Block-->
    <form th:action="@{/Connexion}" method="post">
    <div class="reg-block">
        <div class="reg-block-header">
            <h2>Sign In</h2>
            <ul class="list-inline style-icons text-center">
                <li><a href="index.html"><i class="icon-home icon-round icon-round-sm icon-color-grey"></i></a></li>
                <li><a href="#"><i class="icon-linkedin icon-round icon-round-sm icon-color-grey"></i></a></li>
                <li><a href="#"><i class="icon-facebook icon-round icon-round-sm icon-color-grey"></i></a></li>
                <li><a href="#"><i class="icon-twitter icon-round icon-round-sm icon-color-grey"></i></a></li>
                <li><a href="#"><i class="icon-rss icon-round icon-round-sm icon-color-grey"></i></a></li>
            </ul>
        </div>
        
       

        <div class="input-group margin-bottom-20">
            <span class="input-group-addon"><i class="icon-envelope"></i></span>
            <input name="email" type="text" class="form-control" placeholder="Email">
        </div>
        <div class="input-group margin-bottom-20">
            <span class="input-group-addon"><i class="icon-lock"></i></span>
            <input name="password" type="password" class="form-control" placeholder="Password">
        </div>
        
        <input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}"/>
        
        <hr>
        <label class="checkbox">
            <input type="checkbox"> 
            <p>Always stay signed in</p>
        </label>
                                
        <div class="row">
            <div class="col-md-10 col-md-offset-1">
                <button type="submit" class="btn-u btn-block">Log In</button>
            </div>
        </div>
    </div>
    </form>
    <!--End Reg Block-->
</div><!--/container-->
<!--=== End Content Part ===-->

<!-- JS Global Compulsory -->           
<script type="text/javascript" src="/bonplans/resources/assets/plugins/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/plugins/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="/bonplans/resources/assets/plugins/hover-dropdown.min.js"></script> 
<script type="text/javascript" src="/bonplans/resources/assets/plugins/back-to-top.js"></script>
<!-- JS Implementing Plugins -->           
<script type="text/javascript" src="/bonplans/resources/assets/plugins/countdown/jquery.countdown.js"></script>
<script type="text/javascript" src="/bonplans/resources/assets/plugins/backstretch/jquery.backstretch.min.js"></script>
<script type="text/javascript">
    $.backstretch([
      "/bonplans/resources/assets/img/bg/5.jpg",
      "/bonplans/resources/assets/img/bg/4.jpg",
      ], {
        fade: 1000,
        duration: 7000
    });
</script>
<!-- JS Page Level -->           
<script type="text/javascript" src="/bonplans/resources/assets/js/app.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
        App.init();
    });
</script>
<!--[if lt IE 9]>
    <script src="/bonplans/resources/assets/plugins/respond.js"></script>
<![endif]-->

</body>
</html> 