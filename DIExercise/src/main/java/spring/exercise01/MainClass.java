package spring.exercise01;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"spring/exercise01/di/bean/animal.xml");
		
		PetOwner person = (PetOwner) context.getBean("PetOwner");
		person.play();
		context.close();

	}

}
