package com.oraclelec.board.dto;


/*실제 Data base의 값을 가져와서 객체로 바꾸는 곳 */
public class BDto {
	
	/*Database의 컬럼 명이 오는게 좋다. */
	String NM;
	String REGION_AREA;
	String COL0;
	String COL1;
	String COL2;
	String COL3;
	String COL4;
	String COL5;
	String COL6;
	String COL7;
	String COL8;
	String COL9;
	int TOT;
	
	/*생성자*/
	public BDto() {
		
	}
	
	
	/*인자 있는 생성자: 초기화를 위해 setting*/
	public BDto(String NM,String REGION_AREA, String COL0, String COL1, String COL2, String COL3, String COL4, String COL5, String COL6, String COL7, String COL8, String COL9, int TOT)
	{
		this.NM = NM;
		this.REGION_AREA = REGION_AREA;
		this.COL0 = COL0;
		this.COL1 = COL1;
		this.COL2 = COL2;
		this.COL3 = COL3;
		this.COL4 = COL4;
		this.COL5 = COL5;
		this.COL6 = COL6;
		this.COL7 = COL7;
		this.COL8 = COL8;
		this.COL9 = COL9;		
		this.TOT = TOT;
	}
	
	
	/*각 멤버 변수에 관한 setter, getter*/
	public String getNM() {
		System.out.println("있나?" +NM);
		return NM;
	}

	public void setNM(String nM) {
		NM = nM;
	}

	public String getREGION_AREA() {
		System.out.println("있나?"+ REGION_AREA);
		return REGION_AREA;
	}

	public void setREGION_AREA(String rEGION_AREA) {
		REGION_AREA = rEGION_AREA;
	}

	public String getCOL0() {
		
		System.out.println("있나?" + COL0);
		return COL0;
		
	}

	public void setCOL0(String cOL0) {
		COL0 = cOL0;
	}

	public String getCOL1() {
		System.out.println("있나?" + COL1);
		return COL1;
	}

	public void setCOL1(String cOL1) {
		COL1 = cOL1;
	}

	public String getCOL2() {
		System.out.println("있나?" + COL2);
		return COL2;
	}

	public void setCOL2(String cOL2) {
		COL2 = cOL2;
	}

	public String getCOL3() {
		System.out.println("있나?" + COL3);
		return COL3;
	}

	public void setCOL3(String cOL3) {
		COL3 = cOL3;
	}

	public String getCOL4() {
		System.out.println("있나?" + COL4);
		return COL4;
	}

	public void setCOL4(String cOL4) {
		
		COL4 = cOL4;
	}

	public String getCOL5() {
		System.out.println("있나?" + COL5);
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

	public int getTOT() {
		return TOT;
	}

	public void setTOT(int tOT) {
		TOT = tOT;
	}
	

	
	
}
