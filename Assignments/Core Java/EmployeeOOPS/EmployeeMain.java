package Day2;
import java.util.*;
public class EmployeeMain {
	public static void main(String args[]) {
		Employee obj[];
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Employees:");
		n=sc.nextInt();
		int ids[]= new int[n];
		int age[]=new int[n];
		String name[]=new String[n];
		String dept[]=new String[n];
		int sal[]=new int[n];
		obj=new Employee[n];
		System.out.println("Enter The Ids:");
		for(int i=0;i<n;i++) {
			ids[i]=sc.nextInt();
		}
		System.out.println("Enter The Ages:");
		for(int i=0;i<n;i++) {
			age[i]=sc.nextInt();
		}
		System.out.println("Enter The Names:");
		for(int i=0;i<n;i++) {
			name[i]=sc.next();
		}
		System.out.println("Enter The Depts:");
		for(int i=0;i<n;i++) {
			dept[i]=sc.next();
		}
		System.out.println("Enter The Salary:");
		for(int i=0;i<n;i++) {
			sal[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			
			obj[i]=new Employee(ids[i],name[i],age[i],dept[i],sal[i]);
		}
		
		
		System.out.println("\t \t \t----Employee Details---------");
		System.out.println("Id:\t\t Name:\t\t Age:\t\t Dept:\t\t\tSalary:");
		for(int i=0;i<n;i++) {
			System.out.println(obj[i].getId()+"\t\t"+obj[i].getName()+"\t\t "+obj[i].getAge()+"\t\t"+obj[i].getDept()+"\t\t\t"+obj[i].getSalary());
		}
		
	}

}
