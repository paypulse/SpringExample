package com.javalec.ex;

public class NODIEx {
	private String e_name;
	private int e_number;
	private String e_email;
	private int e_departmentN;
	
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public int getE_number() {
		return e_number;
	}
	public void setE_number(int e_number) {
		this.e_number = e_number;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	public int getE_departmentN() {
		return e_departmentN;
	}
	public void setE_departmentN(int e_departmentN) {
		this.e_departmentN = e_departmentN;
	}
	
	public void nameP()
	{
		System.out.println(e_name);
	}
	
	public void numberP()
	{
		System.out.println(e_number);
	}
	
	public void emailP() {
		System.out.println(e_email);
	}
	
	public void departmentP() {
		System.out.println(e_departmentN);
	}

}
