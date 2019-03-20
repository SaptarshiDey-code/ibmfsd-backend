package Day4_Generics;
import java.util.*;

import Day3_collections.EmployeeMapOp;

public class WeekendAssgn_EmployeeMain {
	public static void main(String args[]) {
		WeekendAssgn_EmployeeOp obj=new WeekendAssgn_EmployeeOp();
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Add an Employee");
		System.out.println("2. Edit An Employee");
		System.out.println("3. Delete An Employee");
		System.out.println("4. Display Details");
		System.out.println("5. Filters");
		System.out.println("6.Sort By Name");
		System.out.println("7.Statistics");
		System.out.println("8.Exit");
		System.out.println("Enter Your Choice 1,2,3,4,5,6,7,8:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:obj.AddEmployee();
		break;
		case 2:
			int id;
			System.out.println("Enter The Employee Id You Want To Edit:");
			id=sc.nextInt();
			obj.EditEmployee(id);
			break;
		case 3:
			int idD;
			System.out.println("Enter The Employee Id You Want To Delete:");
			idD=sc.nextInt();
			obj.DeleteEmployee(idD);
			break;
		case 4:obj.display();
		break;
		
		case 5:obj.filter();
		break;
		
		case 6:obj.sort();
		break;
		
		case 7:obj.statistics();
		break;
		case 8:System.exit(0);
		break;
		
		default: System.out.println("Wrong Choice");
		}
	}
	}

}
