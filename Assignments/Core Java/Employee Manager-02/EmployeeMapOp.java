package Day3_collections;
import java.util.*;
public class EmployeeMapOp {
	
	TreeMap <Integer,EmployeeHash> obj =new <Integer,EmployeeHash> TreeMap(); 
	Scanner sc=new Scanner(System.in);
	public void AddEmployee() {
		
		String name,loc;
		int id,Salary;
		
		System.out.println("Enter The Employee Name:");
		name=sc.next();
		System.out.println("Enter The Employee Id:");
		id=sc.nextInt();
		System.out.println("Enter The Employee Location:");
		loc=sc.next();
		System.out.println("Enter The Employee Salary:");
		Salary=sc.nextInt();
		
		obj.put(id, new EmployeeHash(name,id,loc,Salary));
	}
	
	public boolean SearchEmpl(int id) {
		if(obj.containsKey(id)) {
			return true;
		}
		return false;
	}
	
	public void DeleteEmployee(int id) {
		if(SearchEmpl(id)) {
			System.out.println("Employee Deleted:"+obj.remove(id));
		}
		else {
			System.out.println("Employee Not Found");
		}
	}
	
	public void display() {
		
		//TreeSet TS=(TreeSet) (obj.entrySet());
		System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
		for(Object O:obj.keySet()) {
			System.out.println(obj.get(O).getId()+"\t\t"+obj.get(O).getName()+"\t\t"+obj.get(O).getLocation()+"\t\t"+obj.get(O).getSalary());
		}
	}
	
	public void EditEmployee(int id) {
		
		if(SearchEmpl(id)) {
			int ch;
			while(true) {
				System.out.println("1.Edit Name:");
				System.out.println("2. Edit Location:");
				
				System.out.println("3. Edit Salary");
				System.out.println("4.Back To The Main Menu");
				System.out.println("Enter Your Choice 1,2,3,4:");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					String name;
					System.out.println("Enter The Updated Name:");
					name=sc.next();
					obj.get(id).setName(name);
					break;
				case 2:
					String loc;
					System.out.println("Enter The Updated Location:");
					loc=sc.next();
					obj.get(id).setLocation(loc);
					break;
					
				
				case 3:
					int sal;
					System.out.println("Enter The Updated Salary:");
					sal=sc.nextInt();
					obj.get(id).setSalary(sal);
					break;
									
				
				case 4:return;
				
				default:System.out.println("Wrong Choice");
					
				}
			}
		}
		else {
			System.out.println("Employee Not Found");
		}
		
	}

}
