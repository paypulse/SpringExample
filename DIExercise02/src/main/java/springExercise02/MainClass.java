package springExercise02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:xmlBeanFactory.xml");
		ctx.refresh();
		
		CarMaker carMaker = ctx.getBean("audi", Audi.class);
		
		Car c = carMaker.sell();
		System.out.println("I sold a car..."+ c.getName());

	}

}
