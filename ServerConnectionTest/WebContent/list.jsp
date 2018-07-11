<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.199:1521:wisedb";
		String uid = "wise_user";
		String upw = "1234";
		String query = "select * from std_score";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
		try{
			out.println("try");
			Class.forName(driver);	//oracle.jdbc.driver.OracleDriver
			out.println("driver" + "= " + driver);
			connection = DriverManager.getConnection(url, uid, upw);	//jdbc:oracle:thin:@localhost:1521:xe
			out.println("connection");
			statement = connection.createStatement();	
			out.println("statement");
			resultSet = statement.executeQuery(query);	//select * from member			
			out.println("resultSet");
			
			while(resultSet.next()){
				String nm = resultSet.getString("nm");
				String subject = resultSet.getString("subject");
				int score = resultSet.getInt("score");
				
				out.println("이름 : " + nm + ", 과목 : " + subject + ", 점수 : " + score + "<br />");
			}
			
		}catch(Exception e) {
		} finally {
			try{
				if(resultSet != null) resultSet.close();
				if(connection != null) connection.close();
				if(statement != null) statement.close();

			} catch(Exception e){
				
			}			
		}
	%>
	
</body>
</html>