package JDBC_Assignment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Wassgn2main {
	
public static void main(String args[]) throws IOException, ClassNotFoundException, NullPointerException, SQLException {
	Scanner sc=new Scanner(System.in);
	AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	Wassgn2Op O=(Wassgn2Op) context.getBean("opr");
	int ch;
	while(true) {
	System.out.println("1.Add Employee");
	System.out.println("2.Show All Employees");
	System.out.println("3.Edit Employee");
	System.out.println("4. Delete Employee");
	System.out.println("5. Show Statistics");
	System.out.println("6. Import From File");
	System.out.println("7. Export To File");
	System.out.println("8. DB Operations");
	System.out.println("9. Exit");
	System.out.println("Enter Your Choice 1,2,3,4,5,6,7,8,9:");
	ch=sc.nextInt();
	switch(ch) {
	
	case 1:
	
	O.AddEmpl();
	
	break;
	
	case 2:
	//Wassgn2Op O1=(Wassgn2Op)context.getBean("displayEmpl");
	O.displayEmpl();
	break;
	
	case 3:O.Edit();
	break;
	
	case 4: O.DeleteEmpl();
			break;
			
	/*case 5: O.statisticsStream();
			break;*/
	
	case 6: O.Import();
			break;
			
	case 7:O.Export();
			break;
			
	case 8: O.OtherDbOps();
			break;
	
	case 9:System.exit(0);
		   break;
	
	default: System.out.println("Wrong Choice");
	}
	}
	//context.registerShutdownHook();
}
}
