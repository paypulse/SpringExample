<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Google chart</title>
</head>
<body>
<form action="optionChart" method="post">
	<div style="width: 1600px; height: 200px; border: 1px solid red;">

		<div
			style="width: 100px; height: 200px; border: 1px solid green; float: left">
			<div style="height: 70px"></div>
			<select name="selectlist" style="text-align:center;width:100px;height: 60px; font-size: 20px;border: solid 1px blue; border-radius: 10px;">
				<option value="" selected>전체</option>
				<option value="10">서울</option>
				<option value="20">경기</option>
				<option value="30">인천</option>
				<option value="40">평택</option>
				<option value="50">울산</option>
				<option value="60">대전</option>
				<option value="70">부산</option>
				<option value="80">광주</option>
			</select>
			<div style="height: 70px"></div>
		</div>

		<div
			style="width: 600px; height: 200px; border: 1px solid black; float: left;">
			<div style="width: 600px; height: 50px; border: 1px solid yellow; text-align:center">
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" checked name="datagk" value="" style="width:30px;height:30px;font-size:30px;">전체</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="datagk" value="00" style="width:30px;height:30px;font-size:30px;margin:auto;">DATA</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="datagk" value="01" style="width:30px;height:30px;font-size:30px;margin:auto;">중간총계</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px	"><input type="radio" name="datagk" value="11" style="width:30px;height:30px;font-size:30px;margin:auto;">총계</label>
			</div>
			<div style="width: 600px; height: 150px; border: 2px solid red;text-align:center;">
				<div>
					<label for="usr" style="width:130px;">서울<input name="areacode1" type="text"class="form-control" id="usr" value="1"></label>
					<label for="usr" style="width:130px;">경기<input name="areacode2" type="text"class="form-control" id="usr" value="2"></label> 
					<label for="usr" style="width:130px;">인천<input name="areacode3" type="text"class="form-control" id="usr" value="3"></label> 
					<label for="usr" style="width:130px;">평택<input name="areacode4" type="text"class="form-control" id="usr" value="4"></label> 
					<label for="usr" style="width:130px;">울산<input name="areacode5" type="text"class="form-control" id="usr" value="5"></label> 
					<label for="usr" style="width:130px;">대전<input name="areacode6" type="text"class="form-control" id="usr" value="6"></label> 
					<label for="usr" style="width:130px;">부산<input name="areacode7" type="text"class="form-control" id="usr" value="7"></label> 
					<label for="usr" style="width:130px;">광주<input name="areacode8" type="text"class="form-control" id="usr" value="8"></label> 
				</div>
			</div>
		</div>
		<div
			style="width: 200px; height: 200px; border: 10px solid green; float: left">
			<label class="radio-inline" style="width:200px;margin-top: 10px;margin-bottom: 10px"><input type="radio" checked name="orderdata" value="r" style="width:30px;height:30px;font-size:30px;margin:auto;">DATA우선</label>
			<label class="radio-inline" style="width:200px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="orderdata" value="R" style="width:30px;height:30px;font-size:30px;margin:auto;">총계우선</label>
			<label for="cnt" style="width:40px; padding-top:30px">건수</label><input name="cntdata" type="text"id="cnt" style="width:100px;"> 
			</div>
		<div style="width: 140px; height: 200px; border: 10px solid yellow; float: right">
			<div style="width: 140px; height: 130px;"></div>
			<div style="width: 140px; height: 70px;">
			<button id="btn1" class="btn btn-lg btn-primary" style="width:120">검색</button>
			</div>
			
			</div>
	</div>
</form>
	<table width="1600px" cellpadding="0" cellspacing="0" border="1">		
		<tr>
			<td>NM</td>
			<td>region</td>
			<td>청소기</td>
			<td>세탁기</td>
			<td>건조기</td>
			<td>정수기</td>
			<td>도어락</td>
			<td>전화기</td>
			<td>냉장고</td>
			<td>김치냉장고</td>
			<td>전자레인지</td>
			<td>가스레인지</td>
			<td>TOT</td>
		<tr>
			<c:forEach items="${optionChart}" var="dto">
				<tr>
					<td>${dto.NM}</td>
					<td>${dto.REGIONAREA}</td>
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
					<td>${dto.TOT}</td>
				<tr>
			</c:forEach>
	</table>
	<p>
		<a href="writeForm">글작성</a>
	</p>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>