package di.exam;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bean을 설정한 xml 파일이 있는 위치 지정
		String configLocation ="classpath:applicationContext.xml";
		
		//지정한 위치를 참고하여 설정 파일을 얻어 옴
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		//설정 파일에서 bean을 가져옴 
		Cats catInfo = ctx.getBean("catsInfo",Cats.class);
		
		//호출
		catInfo.getMyCatsInfo();

	}

}
