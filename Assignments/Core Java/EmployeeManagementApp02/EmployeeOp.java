package Weekend2;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

//import Day4_Generics.AgeExc;
//import Day4_Generics.NegId;

import java.sql.ResultSet;
import java.io.*;

class NegId extends Exception {
	static int c = 0;

	public NegId(int n) {

		if (n <= 0) {
			NegId.c += 1;
			System.out.println("Please Enter A Valid Id");

		} else {
			NegId.c = 0;
		}

	}
}

class AgeExc extends Exception {
	static int t = 0;

	public AgeExc(int n) {

		if (n < 21 || n > 60) {
			AgeExc.t += 1;
			System.out.println("Please Enter A Valid Id");

		} else {
			AgeExc.t = 0;
		}

	}
}

class SalChk extends Exception {
	static int s = 0;

	public SalChk(int n) {

		if (n < 26000) {
			SalChk.s += 1;
			System.out.println("Please Enter A Valid Salary");

		} else {
			SalChk.s = 0;
		}

	}
}

public class Wassgn2Op {
Scanner sc=new Scanner(System.in);
List <Wassgn2> A=new ArrayList<>();
	public void AddEmpl() {
		try {
		Wassgn2dao db=new Wassgn2dao();
		Wassgn2 ob;
		int id;
		String name;
		int age;
		String dept;
		String city;
		int sal;
		System.out.println("Enter Id:");
		id=sc.nextInt();
		while (true) {
			try {

				// if()
				throw new NegId(id);

			}

			catch (NegId e) {

				if (NegId.c == 0)
					break;

				System.out.println("Enter The Employee Id:");
				id = sc.nextInt();

			}

		}
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		while(true) {
			try {
				throw new AgeExc(age);
			}
			
			catch(AgeExc e) {
				if(AgeExc.t==0)
					break;
				System.out.println("Enter Age:");
				age=sc.nextInt();
			}
		}
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter City:");
		city=sc.next();
		System.out.println("Enter Salary:");
		sal=sc.nextInt();
		while(true) {
			try {
				throw new SalChk(sal);
			}
			catch(SalChk e) {
				if(SalChk.s==0)
					break;
				System.out.println("Enter Salary:");
				sal=sc.nextInt();
			}
		}
		ob=new Wassgn2(id,name,age,dept,city,sal);
		db.InsertDb(ob);
		System.out.println("Employee Added Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Edit() throws ClassNotFoundException, SQLException,NullPointerException {
		int ch;int id;
		List <Wassgn2> A=new ArrayList<Wassgn2>();
		Wassgn2dao db=new Wassgn2dao();
		System.out.println("Enter The Id:");
		id=sc.nextInt();
		A=db.findEmpl(id);
		if(A.size()!=0) {
		while(true) {
			
		System.out.println("1.Edit Employee Name");
		System.out.println("2.Edit Employee Age");
		System.out.println("3.Edit Employee Department");
		System.out.println("4.Edit Employee City");
		System.out.println("5.Edit Employee Salary");
		System.out.println("6.Back To Previous Menu");
		System.out.println("Enter Your Choice 1,2,3,4,5,6:");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
		try {
			
		///Wassgn2dao db=new Wassgn2dao();
		
		String name;
		
		
		System.out.println("Enter The Updated Name:");
		name=sc.next();
		db.UpdateName(id, name);
		System.out.println("Employee's Name Updated Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		break;
		
		case 2:
			try {
				
				//Wassgn2dao db=new Wassgn2dao();
				
				int age;
				
				
				System.out.println("Enter The Updated Age:");
				age=sc.nextInt();
				db.UpdateAge(id, age);
				System.out.println("Employee's Age Updated Successfully");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
				
		case 3:
			try {
				
				//Wassgn2dao db=new Wassgn2dao();
				
				String dept;
				
				
				System.out.println("Enter The Updated Department:");
				dept=sc.next();
				db.UpdateDept(id, dept);
				System.out.println("Employee's Department Updated Successfully");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
		case 4:
			try {
				
				//Wassgn2dao db=new Wassgn2dao();
				
				String city;
				
				
				System.out.println("Enter The Updated City:");
				city=sc.next();
				db.UpdateCity(id, city);
				System.out.println("Employee's City Updated Successfully");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
		case 5:
			try {
				
				//Wassgn2dao db=new Wassgn2dao();
				
				int Salary;
				
				
				System.out.println("Enter The Updated Salary:");
				Salary=sc.nextInt();
				db.UpdateSal(id,Salary);
				System.out.println("Employee's Salary Updated Successfully");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				break;
				
		case 6: return;
				
		
		default: System.out.println("Wrong Choice");
		}
		}
		}
		else {
			System.out.println("Employee Not Found");
		}
	}
	
	public void DeleteEmpl() throws NullPointerException {
		try {
		int id;
		System.out.println("Enter The Id Of The Employee Which You Want To Delete:");
		id=sc.nextInt();
		List <Wassgn2> A=new ArrayList<Wassgn2>();
		Wassgn2dao db=new Wassgn2dao();
		A=db.findEmpl(id);
		if(A.size()!=0) {
		//System.out.println(status);
		db.DelEmpl(id);
		System.out.println("Employee Deleted Successfully");
		}
		else {
			//System.out.println(status);
			System.out.println("Employee Not Found");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void displayEmpl() {
		try {
			
			Wassgn2dao db=new Wassgn2dao();
			//db.fetchAll();
			A=db.fetchAll();
			System.out.println("\t    #######################################################################################################");
			System.out.printf("\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\n","Id:","Name:","Age:","Department:","City:","Salary:");
			System.out.println("\t    #######################################################################################################");
			for(Wassgn2 w:A) {
				System.out.printf("\t\t  %d\t\t  %s\t\t  %d\t\t  %s\t\t\t  %s\t\t  %d\n",w.getId(),w.getName(),w.getAge(),w.getDepartment(),w.getCity(),w.getSalary());
				System.out.println("\t    --------------------------------------------------------------------------------------------------------");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void statisticsStream() {
		int ch;
		try {
			List <Wassgn2> B=new ArrayList<>();
		Wassgn2dao db=new Wassgn2dao();
		B=db.fetchAll();
		while(true) {
			System.out.println("1.Display The Number Of The Employees Having Age Greater Than 30 ");
			System.out.println("2.Display The Name Of The Employees Having Age Greater Than 30");
			System.out.println("3.Display Count Of The Employees By Department");
			System.out.println("4. Display Total Salary Of All The Employees");
			System.out.println("5. Display Average Salary Department Wise");
			System.out.println("6. Display The Employee List In Ascending Orer By Name");
			System.out.println("7. Display The Department Names Having Count Greater Than 2");
			System.out.println("8. Display The Employee Names Starting with S");
			System.out.println("9. Back To The Main Menu");
			System.out.println("Enter Your Choice 1,2,3,4,5,6,7,8,9:");
			ch=sc.nextInt();
			switch(ch) {
			case 1: long count;
			count=B.stream().filter(w->w.getAge()>30).count();
			System.out.println("Employees Having Age Greater Than 30: "+count);
			break;
			
			case 2: List <String> N=new ArrayList <String> ();
			N=B.stream().filter(w->w.getAge()>30).map(w->w.getName()).collect(Collectors.toList());
			N.forEach(w->System.out.println(w));
			break;
			
			case 3: Map <String, Long> DC=new TreeMap<String, Long>();
			DC=B.stream().collect(Collectors.groupingBy(Wassgn2::getDepartment,Collectors.counting()));
			System.out.println("##################################################################");
			System.out.printf("\t%s\t\t\t%s\n", "Department Name:","Count:");
			System.out.println("##################################################################");
			for(Object O:DC.keySet()) {
				System.out.printf("\t\t%s\t\t\t\t%d\n",O,DC.get(O));
				
			}
			break;
			
			case 4:
				int sal;
				sal=B.stream().map(Wassgn2::getSalary).reduce(0, (a,b)->a.intValue()+b.intValue()).intValue();
				System.out.println("Total Salaries Of All Employees: "+sal);
				break;
				
			case 5:
				Map<String, Double> DS=new TreeMap <String,Double>();
				DS=B.stream().collect(Collectors.groupingBy(Wassgn2::getDepartment,Collectors.averagingInt(Wassgn2::getSalary)));
				System.out.println("##################################################################");
				System.out.printf("\t\t%s\t\t\t\t%s\n", "Department Name:","Average Salary:");
				System.out.println("##################################################################");
				for(Object O:DS.keySet()) {
					System.out.println("\t\t"+O+"\t\t\t\t"+DS.get(O));
				}
				
				break;
				
			case 6: List<Wassgn2> NS=new ArrayList <Wassgn2>();
			NS=B.stream().sorted(Comparator.comparing(Wassgn2::getName)).collect(Collectors.toList());
			System.out.println("\t    #######################################################################################################");
			System.out.printf("\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\n","Id:","Name:","Age:","Department:","City:","Salary:");
			System.out.println("\t    #######################################################################################################");
			for(Wassgn2 w:NS) {
				System.out.printf("\t\t  %d\t\t  %s\t\t  %d\t\t  %s\t\t\t  %s\t\t  %d\n",w.getId(),w.getName(),w.getAge(),w.getDepartment(),w.getCity(),w.getSalary());
				System.out.println("\t    --------------------------------------------------------------------------------------------------------");
			}
			break;
			
			case 7: List<String> DCG2= new ArrayList<String>();
			DCG2=B.stream().collect(Collectors.groupingBy(Wassgn2::getDepartment,Collectors.counting())).entrySet().stream()
					.filter(w->w.getValue()>2).map(Map.Entry::getKey).collect(Collectors.toList());
			
			DCG2.forEach(w->System.out.println(w));
			break;
			
			case 8:
				List <Wassgn2> NSS=new ArrayList<Wassgn2>();
				NSS=B.stream().filter(w->w.getName().charAt(0)=='S' || w.getName().charAt(0)=='s').collect(Collectors.toList());
				System.out.println("\t    #######################################################################################################");
				System.out.printf("\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\n","Id:","Name:","Age:","Department:","City:","Salary:");
				System.out.println("\t    #######################################################################################################");
				for(Wassgn2 w:NSS) {
					System.out.printf("\t\t  %d\t\t  %s\t\t  %d\t\t  %s\t\t\t  %s\t\t  %d\n",w.getId(),w.getName(),w.getAge(),w.getDepartment(),w.getCity(),w.getSalary());
					System.out.println("\t    --------------------------------------------------------------------------------------------------------");
				}
				break;
					
			case 9: 
				return;
			
			default: System.out.println("Wrong Choice");
				
			}
	}
}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Import() throws IOException {
		String O;int ctr=0;
		try {
		BufferedReader br=new BufferedReader(new FileReader("D:\\File-Java\\WAssgnImport.txt"));
		while((O=br.readLine())!=null) {
			ctr++;
			String[] W=O.split(",");
			Wassgn2dao db=new Wassgn2dao();
			
			db.InsertDb(new Wassgn2(Integer.parseInt(W[0]),W[1],Integer.parseInt(W[2]),W[3],W[4],Integer.parseInt(W[5])));
			
		}
		br.close();
		System.out.println(ctr+" Employees Imported Successfully");
		
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Export()throws IOException {
		List <Wassgn2> B=new ArrayList<Wassgn2>();
		try {
			Wassgn2dao db=new Wassgn2dao();
			B=db.fetchAll();
			BufferedWriter br=new BufferedWriter(new FileWriter("D:\\File-Java\\WAssgnExport.txt"));
			br.write("\t    #######################################################################################################\n");
			
			br.write("\tId: \t\t Name: \t\t Age: \t\t Department: \t\t  City: \t\t  Salary:\n");
			br.write("\t    #######################################################################################################\n");
			for(Wassgn2 w:B) { 
				br.write("\t"+w.getId()+"\t\t\t"+w.getName()+"\t\t\t"+w.getAge()+"\t\t\t"+w.getDepartment()+"\t\t"+w.getCity()+"\t\t"+w.getSalary()+"\n");
				br.write("\t    --------------------------------------------------------------------------------------------------------\n");
			
		}
		br.close();
		
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Export Successful");
}
	
	public void OtherDbOps() {
		int ch;
		while(true) {
			
		
		System.out.println("1. Group By Department Name");
		System.out.println("2. Department Wise Count Of Employees");
		System.out.println("3. List Of All The Employees Having Salary Greater Than Average Salary");
		System.out.println("4. Employee Name Starting With S");
		System.out.println("5.Back To Main Menu");
		System.out.println("Enter Your Choice 1,2,3,4,5:");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			try {
			List <String> D=new ArrayList<String>();
			Wassgn2dao db=new Wassgn2dao();
			D=db.GrByDept();
			System.out.println("###################################################################");
			System.out.printf("\t\t%s\t\t%s\n", "Name:","Department:");
			System.out.println("###################################################################");
			for(Object O:D) {
				System.out.println(O);
				System.out.println("--------------------------------------------------------------------");
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			break;
			
		case 2:
			try {
				List <String> DC=new ArrayList<String>();
				Wassgn2dao db=new Wassgn2dao();
				DC=db.DwCount();
				System.out.println("###################################################################");
				System.out.printf("\t\t\t%s\t\t%s\n", "Department:","Count:");
				System.out.println("###################################################################");
				for(Object O:DC) {
					System.out.println(O);
					System.out.println("--------------------------------------------------------------------");
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
				break;
				
		case 3:
			try {
				List <String> EGA=new ArrayList<String>();
				Wassgn2dao db=new Wassgn2dao();
				EGA=db.GtAvS();
				System.out.println("###################################################################");
				System.out.printf("\t\t\t%s\t\t%s\n", "Name:","Salary");
				System.out.println("###################################################################");
				for(Object O:EGA) {
					System.out.println(O);
					System.out.println("--------------------------------------------------------------------");
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
				break;
				
		case 4:
			try {
				List <String> ENS=new ArrayList<String>();
				Wassgn2dao db=new Wassgn2dao();
				ENS=db.NstS();
				System.out.println("\t    #######################################################################################################");
				System.out.printf("\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\t\t|%s|\n","Id:","Name:","Age:","Department:","City:","Salary:");
				System.out.println("\t    #######################################################################################################");
				for(Object O:ENS) {
					System.out.println(O);
					System.out.println("--------------------------------------------------------------------");
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
				break;
				
				
		case 5: return;
		
		default: System.out.println("Wrong Choice");
		}
	}
	}
}
