package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		
		Calculation cal = new Calculation();
		cal.setFirst_num(10);
		cal.setSecond_num(2);
		
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
		
	}

}
