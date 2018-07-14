package com.javalec.springMybatis.dao;

import java.util.ArrayList;

import com.javalec.springMybatis.dto.ChartDto;

public interface IDao {
	
	public ArrayList<ChartDto> listChartDao();
	public ArrayList<ChartDto> optionChartDao(String selectlist, 
												String datagk,
												String areacode1,
												String areacode2,
												String areacode3,
												String areacode4,
												String areacode5,
												String areacode6,
												String areacode7,
												String areacode8,
												String orderdata,
												String cntdata);
	
	
}
