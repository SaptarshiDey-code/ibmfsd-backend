package Day3_collections;
import java.util.*;
public class EmployeeHashMain {
	public static void main(String args[]) {
		String ch;
		String n,l;
		Scanner sc=new Scanner(System.in);
		int sl,Id,ctr=1;
		
		HashSet <EmployeeHash> ob=new <EmployeeHash> HashSet();
		while(ctr!=0) {
			
			System.out.println("Enter Y for Insert");
			System.out.println("Enter N for Exit");
			System.out.println("Do You Want To Add:");
			ch=sc.next();
			switch(ch) {
			case "Y":
				
				n=sc.next();
				
				Id=sc.nextInt();
				
				l=sc.next();
				
				sl=sc.nextInt();
				
				
				ob.add(new EmployeeHash(n,Id,l,sl));
				ctr+=1;
				break;
				
			case "N":ctr=0;
				break;
			default:System.out.println("Wrong Choice");
				
			}
		}
		
		
		
		
		for(Object emp:ob) {
			System.out.println(emp);
		}
	}

}
