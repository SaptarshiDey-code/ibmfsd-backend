package Day2;
import java.util.*;
public class EmployeeMgrOp {
	
	int c=0;
	EmployeeMgr ob[]=new EmployeeMgr[100];
	Scanner sc=new Scanner(System.in);
	public void AddEmpl(String n,int id,String loc,String des,int sal) {
		
		ob[c]=new EmployeeMgr(n,id,loc,des,sal);
		
		c+=1;
			
			
		
	}
	public void display() {
		
	System.out.println("\t \t \t----Employee Details---------");
	System.out.println("Id:\t\t Name:\t\t\t location:\t\t\t  Designation:\t\t\tSalary:");
	for(int i=0;i<c;i++) {
		System.out.println(ob[i].getId()+"\t\t\t"+ob[i].getName()+"\t\t\t "+ob[i].getLocation()+"\t\t\t"+ob[i].getDesignation()+"\t\t\t"+ob[i].getSalary());
	}
	}
	
	public void edit(int id) {
		int z=0,ch,x=0;
		String name,loc,dept;
		int sal;
		for(int i=0;i<c;i++) {
			if(ob[i].getId()==id) {
				z+=i;
				x+=1;
				break;
				
			}
		}
			
		if(x==0) {
			System.out.println("Employee Not Found");
			return;
		}
		while(true) {
			System.out.println("1.Edit Name:");
			System.out.println("2. Edit Location:");
			System.out.println("3. Edit Department");
			System.out.println("4. Edit Salary");
			System.out.println("5.Back To The Main Menu");
			System.out.println("Enter Your Choice 1,2,3,4,5:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter The Updated Name:");
				name=sc.next();
				ob[z].setName(name);
				break;
			case 2:
				System.out.println("Enter The Updated Location:");
				loc=sc.next();
				ob[z].setLocation(loc);
				break;
				
			case 3:
				System.out.println("Enter The Updated Department:");
				dept=sc.next();
				ob[z].setDesignation(dept);
				break;
				
			case 4:
				System.out.println("Enter The Updated Salary:");
				sal=sc.nextInt();
				ob[z].setSalary(sal);
				break;
								
			
			case 5:return;
			
			default:System.out.println("Wrong Choice");
				
			}
		}
	}
	
	void delete(int id) {
		int z=0,x=0;
		
		for(int i=0;i<c;i++) {
			if(ob[i].getId()==id) {
				z+=i;
				x+=1;
				break;
			}
			
		}
		if(x==0) {
			System.out.println("Employee Not Found");
			return;
		}
		for(int i=z+1;i<c;i++) {
			ob[i-1]=ob[i];
		}
		c-=1;
		
		
	}
	
	public void sorted() {
		EmployeeMgr temp;
		for(int i=0;i<c;i++) {
			for(int j=0;j<c-1-i;j++) {
				if(ob[j].getName().compareTo(ob[j+1].getName())>0) {
					temp=ob[j];
					ob[j]=ob[j+1];
					ob[j+1]=temp;
				}
			}
		}
	}

}
