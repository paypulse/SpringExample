package com.javalec.springMybatis.dto;

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
	private String COL9;
	private String TOT;

	

	public ChartDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ChartDto(String nm, String regionarea, String col0,String col1, String col2,String col3,String col4,String col5,String col6,String col7,String col8,String col9,String tot) {
		this.NM = nm;
		this.REGION_AREA = regionarea;
		this.COL0 =col0;
		this.COL1 = col1;
		this.COL2 = col2;
		this.COL3 = col3;
		this.COL4 = col4;
		this.COL5 = col5;
		this.COL6 = col6;
		this.COL7 = col7;
		this.COL8 = col8;
		this.COL9 = col9;
		this.TOT = tot;
		
	}

	public String getNM() {
		return NM;
	}

	public void setNM(String nM) {
		NM = nM;
	}

	public String getREGIONAREA() {
		return REGION_AREA;
	}

	public void setREGIONAREA(String rEGIONAREA) {
		REGION_AREA = rEGIONAREA;
	}

	public String getCOL0() {
		return COL0;
	}

	public void setCOL0(String cOL0) {
		COL0 = cOL0;
	}

	public String getCOL1() {
		return COL1;
	}

	public void setCOL1(String cOL1) {
		COL1 = cOL1;
	}

	public String getCOL2() {
		return COL2;
	}

	public void setCOL2(String cOL2) {
		COL2 = cOL2;
	}

	public String getCOL3() {
		return COL3;
	}

	public void setCOL3(String cOL3) {
		COL3 = cOL3;
	}

	public String getCOL4() {
		return COL4;
	}

	public void setCOL4(String cOL4) {
		COL4 = cOL4;
	}

	public String getCOL5() {
		return COL5;
	}

	public void setCOL5(String cOL5) {
		COL5 = cOL5;
	}

	public String getCOL6() {
		return COL6;
	}

	public void setCOL6(String cOL6) {
		COL6 = cOL6;
	}

	public String getCOL7() {
		return COL7;
	}

	public void setCOL7(String cOL7) {
		COL7 = cOL7;
	}

	public String getCOL8() {
		return COL8;
	}

	public void setCOL8(String cOL8) {
		COL8 = cOL8;
	}

	public String getCOL9() {
		return COL9;
	}

	public void setCOL9(String cOL9) {
		COL9 = cOL9;
	}

	public String getTOT() {
		return TOT;
	}

	public void setTOT(String tOT) {
		TOT = tOT;
	}

	
}
