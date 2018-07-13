<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	
	<link href="<c:url value="/resources/css/test.css" />" rel="stylesheet">
	<!-- <spring:url value="/resources/css/test.css" var="mainCss" /> -->
	
	<title>Home</title>
	
	<!--<link href="${mainCss}" rel="stylesheet" /> -->
</head>
<body>
	<select>
	  <option value="volvo">Volvo</option>
	  <option value="saab">Saab</option>
	  <option value="opel">Opel</option>
	  <option value="audi">Audi</option>
	</select>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
