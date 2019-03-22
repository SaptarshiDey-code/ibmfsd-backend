package SpringIntro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeMain {
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext employee1=new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeSpr e1=(EmployeeSpr) employee1.getBean("employee1");
		
		e1.getMessage();
		employee1.registerShutdownHook();
		
	}

}
