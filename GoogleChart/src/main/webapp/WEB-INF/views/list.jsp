<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="500" cellpadding="0" cellpadding="0" border="1">
		<tr>
			<td>NM</td>
			<!--  
			<td>REGION_AREA</td>
			<td>COL0</td>
			<td>COL1</td>
			<td>COL2</td>
			<td>COL3</td>
			<td>COL4</td>
			<td>COL5</td>
			<td>COL6</td>
			<td>COL7</td>
			<td>COL8</td>
			<td>COL9</td>
			<td>TOT</td> -->
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.NM}</td>
			<!--  
			<td>${dto.REGION_AREA}</td>
			<td>${dto.COL0}</td>
			<td>${dto.COL1}</td>
			<td>${dto.COL2}</td>
			<td>${dto.COL3}</td>
			<td>${dto.COL4}</td>
			<td>${dto.COL5}</td>
			<td>${dto.COL6}</td>
			<td>${dto.COL7}</td>
			<td>${dto.COL8}</td>
			<td>${dto.COL9}</td>
			<td>${dto.TOT}</td>   --->
			
		</tr>
		</c:forEach>
	
	
	</table>
</body>
</html>