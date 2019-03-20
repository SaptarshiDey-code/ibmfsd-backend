package Day4_Generics;

import java.io.*;
import java.util.*;

//import com.sun.corba.se.impl.io.TypeMismatchException;
//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TypeCheckError;

import Day3_collections.EmployeeHash;
//import sun.security.util.Length;

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

public class WeekendAssgn_EmployeeOp  {
	TreeMap<Integer, WeekendAssgn_Employee> obj = new <Integer, WeekendAssgn_Employee>TreeMap();
	TreeSet<WeekendAssgn_Employee> Ts;
	Scanner sc = new Scanner(System.in);
	DataInputStream ds = new DataInputStream(System.in);

	public void AddEmployee() {

		String name, loc, dept;
		int id, age;
		int Salary;

		System.out.println("Enter The Employee Name:");
		name = sc.next();
		System.out.println("Enter The Employee Id:");
		id = sc.nextInt();
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

		System.out.println("Enter The Employee Location:");
		loc = sc.next();

		System.out.println("Enter The Employee Department:");
		dept = sc.next();
		System.out.println("Enter The Employee Age:");
		age = sc.nextInt();
		while (true) {
			try {

				throw new AgeExc(age);

			}

			catch (AgeExc e) {

				if (AgeExc.t == 0)
					break;

				System.out.println("Enter The Employee Age:");
				age = sc.nextInt();

			}
		}
		System.out.println("Enter The Employee Salary:");
		Salary = sc.nextInt();
		obj.put(id, new WeekendAssgn_Employee(name, id, age, loc, dept, Salary));
		System.out.println("Employee Added Successfully");
	}

	public boolean SearchEmpl(int id) {
		if (obj.containsKey(id)) {
			return true;
		}
		return false;
	}

	public void DeleteEmployee(int id) {
		if (SearchEmpl(id)) {
			System.out.println("Employee Deleted:" + obj.remove(id));
		} else {
			System.out.println("Employee Not Found");
		}
	}

	public void display() {

		// TreeSet TS=(TreeSet) (obj.entrySet());
		System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
		for (Object O : obj.keySet()) {
			System.out.printf("%d\t\t %s\t\t %s\t\t %d", obj.get(O).getId(), obj.get(O).getName(),
					obj.get(O).getLocation(), obj.get(O).getSalary());
			System.out.println();
		}
	}

	public void EditEmployee(int id) {

		if (SearchEmpl(id)) {
			int ch;
			while (true) {
				System.out.println("1.Edit Name:");
				System.out.println("2.Edit Location:");

				System.out.println("3. Edit Salary");
				System.out.println("4. Edit Department");
				System.out.println("5.Back To The Main Menu");
				System.out.println("Enter Your Choice 1,2,3,4,5:");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					String name;
					System.out.println("Enter The Updated Name:");
					name = sc.next();
					obj.get(id).setName(name);
					break;
				case 2:
					String loc;
					System.out.println("Enter The Updated Location:");
					loc = sc.next();
					obj.get(id).setLocation(loc);
					break;

				case 3:
					int sal;
					System.out.println("Enter The Updated Salary:");
					sal = sc.nextInt();
					obj.get(id).setSalary(sal);
					break;
					
				case 4:	String dep;
						System.out.println("Enter The Updated Department:");
						dep = sc.next();
						obj.get(id).setDepartment(dep);
						break;
					
				case 5:
					return;

				default:
					System.out.println("Wrong Choice");

				}
				System.out.println("Employee Updated Successfully...!!!");
			}
			
		} 
		else {
			System.out.println("Employee Not Found");
		}
		
	}
	
	Comparator AgeSort=new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			if(o1 instanceof WeekendAssgn_Employee && o2 instanceof WeekendAssgn_Employee) {
				return ((WeekendAssgn_Employee) o1).getAge()-((WeekendAssgn_Employee)o2).getAge();
			}
			return 0;
		}


		};	
		
		Comparator NameSort=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				if(o1 instanceof WeekendAssgn_Employee && o2 instanceof WeekendAssgn_Employee) {
					return ((WeekendAssgn_Employee) o1).getName().compareTo(((WeekendAssgn_Employee)o2).getName());
				}
				return 0;
			}


			};	
			
			Comparator SalSort=new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					// TODO Auto-generated method stub
					if(o1 instanceof WeekendAssgn_Employee && o2 instanceof WeekendAssgn_Employee) {
						return ((WeekendAssgn_Employee) o1).getSalary()-((WeekendAssgn_Employee)o2).getSalary();
					}
					return 0;
				}


				};	
		
		

	public void sort() {
		int ch;
		while(true) {
		System.out.println("1.Sort By Age");
		System.out.println("2. Sort By Name");
		System.out.println("3. Sort By Salary");
		System.out.println("4. Return To Previous Menu");
		System.out.println("Enter Your Choice 1,2,3,4:");
		
		
		ch=sc.nextInt();
		switch(ch) {
		case 1:
		Ts = new <WeekendAssgn_Employee>TreeSet(AgeSort);
		for(Object O: obj.keySet()) {
			Ts.add(obj.get(O));
		}
		
		//Collections.sort(Ts, AgeSort);
		for(Object O: Ts) {
			System.out.println(O);
		}
		break;
		
		case 2:
			Ts = new <WeekendAssgn_Employee>TreeSet(NameSort);
			for(Object O: obj.keySet()) {
				Ts.add(obj.get(O));
			}
			
			//Collections.sort(Ts, AgeSort);
			for(Object O: Ts) {
				System.out.println(O);
			}
			break;
			
		case 3:
			Ts = new <WeekendAssgn_Employee>TreeSet(SalSort);
			for(Object O: obj.keySet()) {
				Ts.add(obj.get(O));
			}
			
			//Collections.sort(Ts, AgeSort);
			for(Object O: Ts) {
				System.out.println(O);
			}
			break;
		case 4:return;
		
		default: System.out.println("Wrong Choice:");
		}
		}
	}
	
	public void statistics() {
		TreeMap <String,Integer> ct=new TreeMap<String,Integer>();
		String k;int v;
		Ts=new <WeekendAssgn_Employee> TreeSet(SalSort);
		TreeMap <String,Integer> AvS=new TreeMap<String,Integer>();
		for(Object O:obj.keySet()) {
			Ts.add(obj.get(O));
		}
		
		System.out.println("---------------------------Highest Salary Details----------------------------------------");
		System.out.println("Name:\t\t Department:\t\t Salary:");
		System.out.println(Ts.last().getName()+"\t\t  "+Ts.last().getDepartment()+"\t\t\t"+Ts.last().getSalary());
		System.out.println("---------------------------Lowest Salary Details----------------------------------------");
		System.out.println("Name:\t\t Department:\t\t Salary:");
		System.out.println(Ts.first().getName()+"\t\t  "+Ts.first().getDepartment()+"\t\t\t"+Ts.first().getSalary());
		
		
		
		for(Object O:obj.keySet()) {
			int sum=0;
			k=obj.get(O).getDepartment();
			sum=obj.get(O).getSalary();
			if(! ct.containsKey(k)) {
				v=1;
				ct.put(k, v);
				sum=sum/v;
				AvS.put(k, sum);
			}
			else {
				v=ct.get(k)+1;
				ct.replace(k, v);
				sum=(AvS.get(k)+obj.get(O).getSalary())/v;
				AvS.put(k, sum);
			}
		}
		System.out.println("-------------------------------Department Statistics-----------------------------------------");
		System.out.println("-------------------------------Department Count-----------------------------------------");
		System.out.println("Department:\t\t"+"Number Of Employees:");
		for(Object O:ct.keySet()) {
			System.out.printf("%s\t\t\t%d",O,ct.get(O));
			System.out.println();
		}
		System.out.println("-------------------------------Department Average Salary-----------------------------------------");
		System.out.println("Department:"+"\t\t"+"Average Salary:");
		for(Object O:AvS.keySet()) {
			System.out.printf("%s\t\t\t%d",O,AvS.get(O));
			System.out.println();
		}
	}
		

	public void filter() {
		int ch;

		while (true) {
			System.out.println("1.Show By Department");
			System.out.println("2. Show By Location");

			System.out.println("3.Search Employee Having Salary Less Than 50000");
			System.out.println("4.Search Employee Having Salary Greater Than 50000");
			System.out.println("5.Back To Main Menu");
			System.out.println("Enter Your Choice 1,2,3,4,5:");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter The Department:");
				String dep = sc.next();
				// TreeMap <Integer,WeekendAssgn_Employee> D=new
				// <Integer,WeekendAssgn_Employee>TreeMap();
				TreeMap<Integer, WeekendAssgn_Employee> D = new <Integer, WeekendAssgn_Employee>TreeMap();
				for (Object o : obj.keySet()) {
					if (obj.get(o).getDepartment().equals(dep)) {
						D.put(obj.get(o).getId(), obj.get(o));
					}
				}
				System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
				for (Object O : D.keySet()) {
					System.out.printf("%d\t\t %s\t\t %s\t\t %d", obj.get(O).getId(), obj.get(O).getName(),
							obj.get(O).getLocation(), obj.get(O).getSalary());
					System.out.println();
				}
				// System.out.println(D);
				break;

			case 2:
				System.out.println("Enter The Location:");
				String loc = sc.next();
				TreeMap<Integer, WeekendAssgn_Employee> L = new <Integer, WeekendAssgn_Employee>TreeMap();

				for (Object o : obj.keySet()) {
					if (obj.get(o).getLocation().equals(loc)) {
						L.put(obj.get(o).getId(), obj.get(o));
					}
				}

				System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
				for (Object O : L.keySet()) {
					System.out.printf("%d\t\t %s\t\t %s\t\t %d", obj.get(O).getId(), obj.get(O).getName(),
							obj.get(O).getLocation(), obj.get(O).getSalary());
					System.out.println();
				}
				break;

			case 3:
				TreeMap<Integer, WeekendAssgn_Employee> LTS = new <Integer, WeekendAssgn_Employee>TreeMap();
				for (Object o : obj.keySet()) {
					if (obj.get(o).getSalary() < 50000) {
						LTS.put(obj.get(o).getId(), obj.get(o));
					}
				}
				System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
				for (Object O : LTS.keySet()) {
					System.out.printf("%d\t\t %s\t\t %s\t\t %d", obj.get(O).getId(), obj.get(O).getName(),
							obj.get(O).getLocation(), obj.get(O).getSalary());
					System.out.println();
				}
				break;

			case 4:
				TreeMap<Integer, WeekendAssgn_Employee> GTS = new <Integer, WeekendAssgn_Employee>TreeMap();
				for (Object o : obj.keySet()) {
					if (obj.get(o).getSalary() > 50000) {
						GTS.put(obj.get(o).getId(), obj.get(o));
					}
				}
				System.out.println("Id:\t\t Name:\t\t Location:\t\t Salary:");
				for (Object O : GTS.keySet()) {
					System.out.printf("%d\t\t %s\t\t %s\t\t %d", obj.get(O).getId(), obj.get(O).getName(),
							obj.get(O).getLocation(), obj.get(O).getSalary());
					System.out.println();
				}
				break;

			case 5:
				return;

			default:
				System.out.println("Wrong Choice");
			}

		}

	}

}
