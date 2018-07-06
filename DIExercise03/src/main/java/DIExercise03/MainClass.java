package DIExercise03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bean을 설정한 xml 파일이 있는 위치 지정
		String configLocation = "classpath:applicationContext.xml";
		
		//지정한 위치를 참고하여 설정 파일을 얻어옴
		AbstractApplicationContext  ctx =
				new GenericXmlApplicationContext(configLocation);
		
		//설정 파일에서 bean을 가져옴
		//getBean()을 이용해서 MyCats타입에서 myCats를 얻어 와서 객체를 생성
		//직접 생성이 아닌 외부에서 얻어옴 (주입 시켜줌)
		MyCats myCat = ctx.getBean("myCats", MyCats.class);
		
		//호출
		myCat.catsNameInfo();
		myCat.catsAgeInfo();
		
		
	}

}
