package Day2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Employee3Main {

	public static void main(String args[]) {
		 AbstractApplicationContext context=new AnnotationConfigApplicationContext(Employee3config.class);
		 Employee2 obj=(Employee2) context.getBean("employee");
		 //obj.setAge(27);
		 obj.setDob(LocalDate.of(1996, 05, 27));
		 obj.setDesignation("MANAGER");
		 obj.setSalary(135000);
		 obj.setSkills(Arrays.asList("Java","C#"));
		 obj.setFulltime(true);
		 obj.getMessage();
		 
		 context.registerShutdownHook();
	}
}
