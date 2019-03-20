package Day3_collections;
import java.util.*;

public class EmployeeMapMain {
	public static void main(String args[]) {
		EmployeeMapOp obj=new EmployeeMapOp();
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Add an Employee");
		System.out.println("2. Edit An Employee");
		System.out.println("3. Delete An Employee");
		System.out.println("4. Display Details");
		System.out.println("5. Display Details In Sorted Order");
		System.out.println("6.Exit");
		System.out.println("Enter Your Choice 1,2,3,4,5,6:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:obj.AddEmployee();
		break;
		case 2:
			int id;
			System.out.println("Enter The Employee Id You Want To Delete:");
			id=sc.nextInt();
			obj.EditEmployee(id);
			break;
		case 3:
			int idD;
			System.out.println("Enter The Id:");
			idD=sc.nextInt();
			obj.DeleteEmployee(idD);
			break;
		case 4:obj.display();
		break;
		
		case 5:break;
		
		case 6:System.exit(0);
		break;
		
		default: System.out.println("Wrong Choice");
		}
	}
	}
}
