<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

<title>Home</title>
</head>
<body>


	<div style="width: 1050px; height: 200px; border: 1px solid red;">

		<div
			style="width: 100px; height: 200px; border: 1px solid green; float: left">
			<div style="height: 70px"></div>
			<select name="selectBox" id="selectBox" style="text-align:center;width:100px;height: 60px; font-size: 20px;border: solid 1px blue; border-radius: 10px;">
				<option value="0" selected>전체</option>
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
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="optradio" value="" style="width:30px;height:30px;font-size:30px;margin;">전체</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="optradio" value="00" style="width:30px;height:30px;font-size:30px;margin:auto;">DATA</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="optradio" value="01" style="width:30px;height:30px;font-size:30px;margin:auto;">중간총계</label>
			<label class="radio-inline" style="width:100px;margin-top: 10px;margin-bottom: 10px	"><input type="radio" name="optradio" value="11" style="width:30px;height:30px;font-size:30px;margin:auto;">총계</label>
			</div>
			<div style="width: 600px; height: 150px; border: 2px solid red;text-align:center;">
				<div>
					<label for="usr" style="width:130px;">서울<input type="text"class="form-control" id="usr"></label>
					<label for="usr" style="width:130px;">경기<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">인천<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">평택<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">울산<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">대전<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">부산<input type="text"class="form-control" id="usr"></label> 
					<label for="usr" style="width:130px;">광주<input type="text"class="form-control" id="usr"></label> 
				</div>
			</div>
		</div>
		<div
			style="width: 200px; height: 200px; border: 10px solid green; float: left">
			<label class="radio-inline" style="width:200px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="arg_dir" value="r" style="width:30px;height:30px;font-size:30px;margin:auto;">DATA우선</label>
			<label class="radio-inline" style="width:200px;margin-top: 10px;margin-bottom: 10px"><input type="radio" name="arg_dir" value="" style="width:30px;height:30px;font-size:30px;margin:auto;">총계우선</label>
			<label for="cnt" style="width:40px; padding-top:30px">건수</label><input type="text"id="cnt" style="width:100px;"> 
			</div>
		<div style="width: 140px; height: 200px; border: 10px solid yellow; float: right">
			<div style="width: 140px; height: 130px;"></div>
			<div style="width: 140px; height: 70px;">
			<button type="button" class="btn btn-lg btn-primary" style="width:120">검색</button>
			</div>
			
			</div>
	</div>


	<div class="container">
		<c:out value="<xmp>" escapeXml="true"></c:out>
		<h2>Hello! ${name}</h2>
		<div>JSP version</div>

		<div class="page-header">
			<h1>Buttons</h1>
		</div>
		<p>
			
			<button type="button" class="btn btn-lg btn-primary">Primary</button>
			<button type="button" class="btn btn-lg btn-success">Success</button>
			<button type="button" class="btn btn-lg btn-info">Info</button>
			<button type="button" class="btn btn-lg btn-warning">Warning</button>
			<button type="button" class="btn btn-lg btn-danger">Danger</button>
			<button type="button" class="btn btn-lg btn-link">Link</button>
		</p>
		<p>
			<button type="button" class="btn btn-default">Default</button>
			<button type="button" class="btn btn-primary">Primary</button>
			<button type="button" class="btn btn-success">Success</button>
			<button type="button" class="btn btn-info">Info</button>
			<button type="button" class="btn btn-warning">Warning</button>
			<button type="button" class="btn btn-danger">Danger</button>
			<button type="button" class="btn btn-link">Link</button>
		</p>
		<p>
			<button type="button" class="btn btn-sm btn-default">Default</button>
			<button type="button" class="btn btn-sm btn-primary">Primary</button>
			<button type="button" class="btn btn-sm btn-success">Success</button>
			<button type="button" class="btn btn-sm btn-info">Info</button>
			<button type="button" class="btn btn-sm btn-warning">Warning</button>
			<button type="button" class="btn btn-sm btn-danger">Danger</button>
			<button type="button" class="btn btn-sm btn-link">Link</button>
		</p>
		<p>
			<button type="button" class="btn btn-xs btn-default">Default</button>
			<button type="button" class="btn btn-xs btn-primary">Primary</button>
			<button type="button" class="btn btn-xs btn-success">Success</button>
			<button type="button" class="btn btn-xs btn-info">Info</button>
			<button type="button" class="btn btn-xs btn-warning">Warning</button>
			<button type="button" class="btn btn-xs btn-danger">Danger</button>
			<button type="button" class="btn btn-xs btn-link">Link</button>
		</p>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</body>
</html>

