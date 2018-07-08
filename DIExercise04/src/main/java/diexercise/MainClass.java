package diexercise;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageBeanEn bean = new MessageBeanEn();
		bean.say("spring");
		MessageBeanKo bean2 = new MessageBeanKo();
		bean2.say("스프링");
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanfactory = new XmlBeanFactory(resource);
		
		MessageBeanEn bean3  = (MessageBeanEn) beanfactory.getBean("messageBeanEn");
		bean3.say("Spring");
		
		MessageBeanKo bean4 = (MessageBeanKo) beanfactory.getBean("messageBeanKo");
		bean4.say("스프링");
		

	}

}
