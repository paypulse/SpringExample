<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*, com.test.mybatis.*" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<title>���â</title>
</head>
<body>
	<table>
		<tr>
			<td width="50px" align="center">NM</td>
			<td align="center">SCORE</td>
		</tr>
		
		<!-- -Result��  controller�� addObject�� ���� �����´�.  -->	
		<c:forEach items="${result}" var="member">
			<tr>
				<td>${member.NM}</td>
				<td>${member.SCORE}</td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>