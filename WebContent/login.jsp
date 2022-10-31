<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Order System</title>

    <!-- Font Icon -->
    <link
      rel="stylesheet"
      href="fonts/material-icon/css/material-design-iconic-font.min.css"
    />
	<%@include file="includes/header.jsp" %>
	
    <!-- Main css -->
    <link rel="stylesheet" href="css/loginstyles.css" />
  </head>
  <body>
  	<%@include file="includes/navbar.jsp" %>
  
    <div class="main">
      <!-- Sing in  Form -->
      <section class="sign-in">
        <div class="container">
          <div class="signin-content">
            <div class="signin-image">
              <figure>
                <img src="images/signin-image.jpg" alt="sign-in image" />
              </figure>
              <a href="register.jsp" class="signin-image-link"
                >Create an account</a
              >
            </div>

            <div class="signin-form">
              <h2 class="form-title">Sign in</h2>
              <form method="post" action="login" class="login-form" id="login-form">
                <div class="form-group">
                  <label for="username"
                    ><i class="zmdi zmdi-account material-icons-name"></i
                  ></label>
                  <input
                    type="email"
                    name="email"
                    id="email"
                    placeholder="Your Email" required
                  />
                </div>
                <p  id="em" class="em" style="color: red;"></p>

                

                <div class="form-group">
                  <label for="password"><i class="zmdi zmdi-lock"></i></label>
                  <input
                    type="password"
                    name="password"
                    id="password"
                    placeholder="Password" required
                  />
                </div>
                <p  id="ps" class="ps" style="color: red;"></p>


                <div class="form-group form-button">
                  <input
                    type="submit"
                    name="signin"
                    id="signin"
                    class="form-submit"
                    value="Log in"
                    onclick="loginValidation()"
                  />
                </div>
              </form>
            </div>
          </div>
        </div>
      </section>
    </div>




    <!-- JS -->
    <script src="js/script.js"></script>
  </body>
</html>
