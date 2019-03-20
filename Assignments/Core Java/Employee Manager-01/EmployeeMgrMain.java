package Day2;
import java.util.*;
public class EmployeeMgrMain {
	public static void main(String args[]) {
		int ch;
		EmployeeMgrOp obj=new EmployeeMgrOp();
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
		case 1:String name,desig,loc;
		int id,sal;
		
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee Id:");
		id=sc.nextInt();
		System.out.println("Enter Employee Location:");
		loc=sc.next();
		System.out.println("Enter Employee Designation:");
		desig=sc.next();
		System.out.println("Enter Employee Salary:");
		sal=sc.nextInt();
		obj.AddEmpl(name, id, loc, desig, sal);
		break;
		
		case 2:
			int idE;
			System.out.println("Enter The Id Of the Employee You Want to edit:");
			idE=sc.nextInt();
			obj.edit(idE);
			break;
			
		case 3:
			int idD;
			System.out.println("Enter The Id Of the Employee You Want to Delete:");
			idD=sc.nextInt();
			obj.delete(idD);
			break;
			
		case 4: obj.display();
		break;
		
		case 5:obj.sorted();
		break;
		case 6:System.exit(0);
		break;
		default:System.out.println("Wrong Choice");
		}
		}
	}

}
