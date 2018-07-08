package dixercise05;

//bean factory
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//IOC container
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.using Bean Factory
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//2. using Applictaion Context
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		

	}

}
