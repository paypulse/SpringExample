package com.oraclelec.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.oraclelec.board.dto.BDto;

/*Data base에 접근 해서 작업을 하는 객체*/
public class BDao {
	
	DataSource datasource;
	
	//생성자
	public BDao() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		
		} catch (NamingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	//Data base에서 접근 할 부분 
	public ArrayList<BDto> list() {
		//게시물이 10개라면, 10개의 데이터 객체를 가져 온다. ==> 하나의 배열일 가능성이 있다. 
		//데이터를 데이터 베이스로 부터 가져와서 ArrayList로 저장 한다. 
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultset = null;
		
		try {
			
			connection = datasource.getConnection();
			
			String query = "SELECT NM NM,REGION_AREA REGION_AREA,\r\n" + 
					"    DECODE(COL0,GCOL, COL0||'▲',LCOL,COL0||'▼',COL0) || '(' || ROUND((100*COL0)/TOT,2) || '%'|| ')' COL0,\r\n" + 
					"    DECODE(COL1,GCOL, COL1||'▲',LCOL,COL1||'▼',COL1) || '(' || ROUND((100*COL1)/TOT,2) || '%'|| ')' COL1,\r\n" + 
					"    DECODE(COL2,GCOL, COL2||'▲',LCOL,COL2||'▼',COL2) || '(' || ROUND((100*COL2)/TOT,2) || '%'|| ')' COL2,\r\n" + 
					"    DECODE(COL3,GCOL, COL3||'▲',LCOL,COL3||'▼',COL3) || '(' || ROUND((100*COL3)/TOT,2) || '%'|| ')' COL3,\r\n" + 
					"    DECODE(COL4,GCOL, COL4||'▲',LCOL,COL4||'▼',COL4) || '(' || ROUND((100*COL4)/TOT,2) || '%'|| ')' COL4,\r\n" + 
					"    DECODE(COL5,GCOL, COL5||'▲',LCOL,COL5||'▼',COL5) || '(' || ROUND((100*COL5)/TOT,2) || '%'|| ')' COL5,\r\n" + 
					"    DECODE(COL6,GCOL, COL6||'▲',LCOL,COL4||'▼',COL6) || '(' || ROUND((100*COL6)/TOT,2) || '%'|| ')' COL6,\r\n" + 
					"    DECODE(COL7,GCOL, COL7||'▲',LCOL,COL4||'▼',COL7) || '(' || ROUND((100*COL7)/TOT,2) || '%'|| ')' COL7,\r\n" + 
					"    DECODE(COL8,GCOL, COL8||'▲',LCOL,COL4||'▼',COL8) || '(' || ROUND((100*COL8)/TOT,2) || '%'|| ')' COL8,\r\n" + 
					"    DECODE(COL9,GCOL, COL9||'▲',LCOL,COL4||'▼',COL9) || '(' || ROUND((100*COL9)/TOT,2) || '%'|| ')' COL9,\r\n" + 
					"    TOT TOT\r\n" + 
					"FROM (\r\n" + 
					" SELECT \r\n" + 
					"    DECODE(GROUPING(AREA_CD) || GROUPING(REGION_AREA),'00',MIN(CD_NM),'01',MIN(CD_NM) ||'합계','총계') NM,\r\n" + 
					"    REGION_AREA,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100000', SALE_CNT )),0) COL0,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100001', SALE_CNT)),0) COL1,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100002', SALE_CNT)),0) COL2,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100003', SALE_CNT)),0) COL3,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100004', SALE_CNT)),0) COL4,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100005', SALE_CNT)),0) COL5,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100006', SALE_CNT)),0) COL6,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100007', SALE_CNT)),0) COL7,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100008', SALE_CNT)),0) COL8,\r\n" + 
					"    NVL(SUM(DECODE(PROD_ID,'100009', SALE_CNT)),0) COL9,\r\n" + 
					"    GREATEST (NVL(SUM(DECODE(PROD_ID,'100000', SALE_CNT )),0),NVL(SUM(DECODE(PROD_ID,'100001', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100002', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100003', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100004', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100005', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100006', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100007', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100008', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100009', SALE_CNT)),0)) GCOL,\r\n" + 
					"    LEAST (NVL(SUM(DECODE(PROD_ID,'100000', SALE_CNT )),0),NVL(SUM(DECODE(PROD_ID,'100001', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100002', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100003', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100004', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100005', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100006', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100007', SALE_CNT)),0),\r\n" + 
					"           NVL(SUM(DECODE(PROD_ID,'100008', SALE_CNT)),0),  NVL(SUM(DECODE(PROD_ID,'100009', SALE_CNT)),0)) LCOL,\r\n" + 
					"    SUM(SALE_CNT) TOT\r\n" + 
					"    FROM ( \r\n" + 
					"        SELECT AREA_CD, REGION_AREA, PROD_ID, SUM(SALE_CNT) SALE_CNT\r\n" + 
					"        FROM SALE_TBL\r\n" + 
					"        WHERE ROWNUM <= 1000000000 \r\n" + 
					"        GROUP BY AREA_CD,REGION_AREA,PROD_ID) TA, CD_TBL TB\r\n" + 
					"    WHERE TA.AREA_CD = TB.CD_ID \r\n" + 
					"    GROUP BY ROLLUP(AREA_CD, REGION_AREA));";
			//preparedstatement 안에 query 문이 들어 가게 된다. 
			preparedstatement = connection.prepareStatement(query);
			resultset = preparedstatement.executeQuery();
			
			while(resultset.next()) {
				String NM = resultset.getString("NM");
				String REGION_AREA = resultset.getString("REGION_AREA");
				String COL0 = resultset.getString("COL0");
				String COL1 = resultset.getString("COL1");
				String COL2 = resultset.getString("COL2");
				String COL3 = resultset.getString("COL3");
				String COL4 = resultset.getString("COL4");
				String COL5 = resultset.getString("COL5");
				String COL6 = resultset.getString("COL6");
				String COL7 = resultset.getString("COL7");
				String COL8 = resultset.getString("COL8");
				String COL9 = resultset.getString("COL9");
				int TOT = resultset.getInt("TOT");
				
				
				BDto dto = new BDto(NM,REGION_AREA,COL0,COL1, COL2, COL3, COL4, COL5, COL6,COL7, COL8, COL9, TOT);
				dtos.add(dto);
				
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(resultset != null) {resultset.close();};
				if(preparedstatement != null) {preparedstatement.close();};
				if(connection != null) {connection.close();};
				
			}catch(Exception e2) {
				
			}
			
		}
		
		return dtos;
	}
	

}
