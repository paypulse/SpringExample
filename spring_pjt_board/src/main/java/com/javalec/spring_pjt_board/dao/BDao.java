package com.javalec.spring_pjt_board.dao;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

import com.javalec.spring_pjt_board.dto.BDto;

public class BDao {
	
	DataSource datasource;
	
	public BDto contentView(String bId) {
		
		
		BDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		
		
		return dto;
	}
	
	public void write(String bName, String bTitle,String bcontent) {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		try {
			
			connection = datasource.getConnection();
			String query="insert into mvc_board(BID,BNAME,BTITLE,BCONTENT,BHIT,BGROUP,BSTEP,BINDENT) values(mvc_board_seq.nextval,?,?,?,0,mvc_board_seq.currval,0,0)";
			preparedstatement = connection.prepareStatement(query);
			
			preparedstatement.setString(1, bName);
			preparedstatement.setString(2, bTitle);
			preparedstatement.setString(3, bcontent);
			
			int rm = preparedstatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(preparedstatement != null) {preparedstatement.close();}
				if(connection != null) {connection.close();}
				
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
	}
	
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
		ResultSet resultset = null;
		
		try {
			connection = datasource.getConnection();
			String query="select bId,bName,bTitle,bcontent,bDate,bHit,bGroup,bStep,bIndent from mvc_board order by bGroup desc, bStep asc";
			preparedStatement = connection.prepareStatement(query);
			resultset =  preparedStatement.executeQuery();
			
			while(resultset.next()) {
				int bId = resultset.getInt("bId");
				String bName = resultset.getString("bName");
				String bTitle= resultset.getString("bTitle");
				String bcontent = resultset.getString("bcontent");
				java.sql.Timestamp bDate = resultset.getTimestamp("bDate");
				int bHit = resultset.getInt("bHit");
				int bGroup = resultset.getInt("bGroup");
				int bStep = resultset.getInt("bStep");
				int bIndent = resultset.getInt("bIndent");
				
				BDto dto = new BDto(bId, bName, bTitle, bDate, bcontent ,bHit,bGroup, bStep, bIndent);
				dtos.add(dto);
			
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				if(resultset !=null) {resultset.close();}
				if(preparedStatement != null) {preparedStatement.close();}
				if(connection != null) {connection.close();}
				
			
			}catch(Exception e ) {
				
			}
			
		}
		
		return dtos;
		
		
	}
	
}
