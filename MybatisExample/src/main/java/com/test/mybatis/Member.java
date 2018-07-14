package com.test.mybatis;

public class Member {
	/*db column : QUIZ_SCORE TABLE*/
	private String NM;
	private String SCORE;
	
	/*멤버 변수 GET,SET함수 추가*/
	public String getNM() {
		return NM;
	}
	public void setNM(String nM) {
		NM = nM;
	}
	public String getSCORE() {
		return SCORE;
	}
	public void setSCORE(String sCORE) {
		SCORE = sCORE;
	}

	
	
	

}
