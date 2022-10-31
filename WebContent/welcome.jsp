<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="includes/header.jsp" %>

 <link rel="stylesheet" href="css/index.css" />

<title>Order System</title>
</head>
<body>
	<%@include file="includes/navbar.jsp" %>
	
<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("login.jsp");
	}
%>
	<h2> Hello <%=session.getAttribute("name") %> </h2>
	
	
</body>
</html>