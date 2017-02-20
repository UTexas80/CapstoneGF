<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String table = (String) request.getAttribute("table");
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/Stylesheet.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Falk10Grocery</title>
</head>
<body>
	
		<div id="header">
			    <div id="header-left">
					<h4>Glen C. Falk</h4>
    			</div>
    			<div id="header-middle">
					<h4>MIST7510</h4>
    			</div>
    			<div id="header-right">
					<h4>Assignment 10</h4>
    			</div>
		</div>
		
		<div id="nav">
			<h4>Grocery Db</h4>
			<a href="index.jsp"><button type="button" id="buttonNav">Home</button></a>
		</div>
	
		<div id="section">
			<h4>Products:</h4>
				<%= table %>
				<br />
				<a href="add"><button type="button">Add Product</button></a>
		</div>
		
		<div id="footer">
			<p>The University of Georgia Master of Internet Technology Program</p>
		</div>
				
</body>
</html>