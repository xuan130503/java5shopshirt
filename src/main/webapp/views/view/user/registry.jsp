<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
 <head>
      <!-- basic -->
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <!-- mobile metas -->
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="viewport" content="initial-scale=1, maximum-scale=1">
      <!-- site metas -->
      <title>Eflyer</title>
      <meta name="keywords" content="">
      <meta name="description" content="">
      <meta name="author" content="">
      <!-- bootstrap css -->
      <link rel="stylesheet" type="text/css" href="<c:url value='/views/templates/user/css/bootstrap.min.css'/>">
      <!-- style css -->
      <link rel="stylesheet" type="text/css" href="<c:url value='/views/templates/user/css/style.css'/>">
      <!-- Responsive-->
      <link rel="stylesheet" href="<c:url value='/views/templates/user/css/responsive.css'/>">
      <!-- fevicon -->
      <link rel="icon" href="<c:url value='/views/templates/user/images/fevicon.png'/>" type="image/gif" />
      <!-- Scrollbar Custom CSS -->
      <link rel="stylesheet" href="<c:url value='/views/templates/user/css/jquery.mCustomScrollbar.min.css'/>">
      <!-- Tweaks for older IEs-->
      <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
      <!-- fonts -->
      <link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
      <!-- font awesome -->
      <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      <!--  -->
      <!-- owl stylesheets -->
      <link href="https://fonts.googleapis.com/css?family=Great+Vibes|Poppins:400,700&display=swap&subset=latin-ext" rel="stylesheet">
      <link rel="stylesheet" href="<c:url value='/views/templates/user/css/owl.carousel.min.css'/>">
      <link rel="stylesoeet" href="<c:url value='/views/templates/user/css/owl.theme.default.min.css'/>">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
   </head>
   <body>
      <!-- banner bg main start -->
      <div class="banner_bg_main">
         <!-- header top section start -->
         <div class="container">
            <div class="header_section_top">
               <div class="row">
                  <div class="col-sm-12">
                     <div class="custom_menu">
                        <ul>
                           <li><a href="trangchu/dienthoai">Phones</a></li>
                           <li><a href="trangchu/laptop">Laptop</a></li>
                           <li><a href="trangchu/tainghe">Headphones</a></li>
                           <li><a href="trangchu/pc">PC</a></li>
                           <li><a href="#">Materials</a></li>
                        </ul>
                     </div>
                  </div>
               </div>
            </div>
         </div>
         <!-- header top section start -->
         <!-- logo section start -->
         <div class="logo_section">
            <div class="container">
               <div class="row">
                  <div class="col-sm-12">
                     <div class="logo"><a href="/trangchu"><img src="<c:url value='/views/templates/user/images/logo.png'/>"></a></div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- banner bg main end -->
      <!-- fashion section start -->
      	<div class="login-section">
            <div class="container">
               <div class="row">
                  <div class="col-sm-12">
                     <h3 class="text-center mt-5">REGISTER</h3>
				<form:form action="registry" modelAttribute="account" enctype="multipart/form-data">
				<div class="form-group">
					<div class="mb-2">
						<form:input path="username" type="text" name="username" class="form-control my-2" placeholder="Your username"/>
						<form:errors path="username" class="form-text text-danger"/>
					</div>
					<div class="mb-2">
						<form:input path="password" type="password" name="password" class="form-control my-2" placeholder="Your password"/>
						<form:errors path="password" class="form-text text-danger"/>
					</div>
					<div class="mb-2">
						<form:input path="fullname" type="text" name="fullname" class="form-control my-2" placeholder="Your fullname"/>
						<form:errors path="fullname" class="form-text text-danger"/>
					</div>
					<div class="mb-2">
						<form:input path="email" type="email" name="password" class="form-control my-2" placeholder="Your email"/>
						<form:errors path="email" class="form-text text-danger"/>
					</div>
					<div class="mb-2">
						<button formaction="/registry/save" class="btn btn-secondary my-3 d-flex justify-content-end">Register</button>	
					</div>
				</div>
			</form:form>
                  </div>
               </div>
            </div>
         </div>
      <!-- fashion section end -->
    
      <!-- footer section start -->
      <div class="footer_section layout_padding">
         <div class="container">
            <div class="footer_logo"><a href="index.html"><img src="<c:url value='/views/templates/user/images/footer-logo.png'/>"></a></div>
            <div class="input_bt">
               <input type="text" class="mail_bt" placeholder="Your Email" name="Your Email">
               <span class="subscribe_bt" id="basic-addon2"><a href="#">Subscribe</a></span>
            </div>
            <div class="footer_menu">
               <ul>
                  <li><a href="#">Best Sellers</a></li>
                  <li><a href="#">Gift Ideas</a></li>
                  <li><a href="#">New Releases</a></li>
                  <li><a href="#">Today's Deals</a></li>
                  <li><a href="#">Customer Service</a></li>
               </ul>
            </div>
            <div class="location_main">Help Line  Number : <a href="#">+1 1800 1200 1200</a></div>
         </div>
      </div>
      <!-- footer section end -->
      <!-- copyright section start -->
      <div class="copyright_section">
         <div class="container">
            <p class="copyright_text">© 2020 All Rights Reserved. Design by <a href="https://html.design">Free html  Templates</a></p>
         </div>
      </div>
      <!-- copyright section end -->
      <!-- Javascript files-->
      <script src="<c:url value='/views/templates/user/js/jquery.min.js'/>"></script>
      <script src="<c:url value='/views/templates/user/js/popper.min.js'/>"></script>
      <script src="<c:url value='/views/templates/user/js/bootstrap.bundle.min.js'/>"></script>
      <script src="<c:url value='/views/templates/user/js/jquery-3.0.0.min.js'/>"></script>
      <script src="<c:url value='/views/templates/user/js/plugin.js'/>"></script>
      <!-- sidebar -->
      <script src="<c:url value='/views/templates/user/js/jquery.mCustomScrollbar.concat.min.js'/>"></script>
      <script src="<c:url value='/views/templates/user/js/custom.js'/>"></script>
      <script>
         function openNav() {
           document.getElementById("mySidenav").style.width = "250px";
         }
         
         function closeNav() {
           document.getElementById("mySidenav").style.width = "0";
         }
      </script>
   </body>
</html>