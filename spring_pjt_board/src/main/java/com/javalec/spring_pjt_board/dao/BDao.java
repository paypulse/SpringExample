package com.javalec.spring_pjt_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

import com.javalec.spring_pjt_board.dto.BDto;

public class BDao {
	
	DataSource datasource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			

		}catch(NamingException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<BDto> list() {
		
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Result resultset = null;
		
		try {
			connection = datasource.getConnection();
			String query="";
			preparedStatement = connection.prepareStatement(query);
			resultset = (Result) preparedStatement.executeQuery();
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
		return dtos;
		
		
	}
	
}
