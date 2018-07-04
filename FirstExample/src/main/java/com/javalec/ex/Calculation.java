package com.javalec.ex;

public class Calculation {
	private int first_num;
	private int second_num;
	public int getFirst_num() {
		return first_num;
	}
	public void setFirst_num(int first_num) {
		this.first_num = first_num;
	}
	public int getSecond_num() {
		return second_num;
	}
	public void setSecond_num(int second_num) {
		this.second_num = second_num;
	}
	
	public void add() {
		System.out.println("add()");
		System.out.println(first_num+"+"+second_num+"="+(first_num+second_num));
		
		
	}
	public void sub() {
		System.out.println("sub()");
		System.out.println(first_num+"-"+second_num+"="+(first_num-second_num));
	}
	public void multi() {
		System.out.println("multi()");
		System.out.println(first_num+"*"+second_num+"="+(first_num*second_num));
	}
	
	public void div() {
		System.out.println("div()");
		System.out.println(first_num+"/"+second_num+"="+(first_num/second_num));
	}
	
	
}
