package Day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee2Main {
	public static void main(String args[]) {
		//AbstractApplicationContext context=new AnnotationConfigApplicationContext(ConfigEmployee2.class);
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("xml-configAnnotations.xml");
		Employee2 obj=(Employee2) context.getBean("employee2");
		obj.getMessage();
		context.registerShutdownHook();
		
		
	}

}
