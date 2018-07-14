package com.google.mybatis.dto;

public class ChartDto {
	
	private String NM;
	private String REGION_AREA;
	private String COL0;
	private String COL1;
	private String COL2;
	private String COL3;
	private String COL4;
	private String COL5;
	private String COL6;
	private String COL7;
	private String COL8;
	private String TOT;
	
	
	public ChartDto() {
		
	}
	
	public ChartDto(String nm,String regionarea, String col0, String col1, String col2, String col3,String col4, String col5,String col6, String col7, String col8, String col9, String tot) {
		this.NM = nm;
		this.REGION_AREA = regionarea;
		this.COL0 = col0;
		this.COL1 = col1;
		
	}
	

}
