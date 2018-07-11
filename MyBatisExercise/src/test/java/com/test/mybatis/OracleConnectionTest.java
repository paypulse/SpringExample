package com.test.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {
	private static final String Driver = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "smj";
	private static final String PW ="snake";
	
	@Test
	public void testDBConnection() throws Exception{
		Class.forName(Driver);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {e.printStackTrace();}
	}

}
