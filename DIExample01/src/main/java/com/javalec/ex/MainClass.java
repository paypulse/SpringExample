package com.javalec.ex;

import org.springframework.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*No DI 예제*/
		NODIEx ndiex = new NODIEx();
		ndiex.setE_name("홍길동");
		ndiex.setE_email("test@test.com");
		ndiex.setE_number(0102320123);
		ndiex.setE_departmentN(024);
		
		ndiex.nameP();
		ndiex.emailP();
		ndiex.numberP();
		ndiex.departmentP();
		
		/*DI 예제*/
		//bean을 설정한 xml파일이 있는 위치 지정
		String configLocation = "classpath:applicationContext.xml";
		
		//지정한 위치를 참고하여 설정 파일을 얻어옴
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCats myCat = ctx.getBean("myCats", MyCats.class);
		
		//호출
		myCat.catsNameInfo();
		myCat.catsAgeInfo();
		
		
		
	}

}
