package Day5;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class ValidateEmployee {
TreeSet<EmpDet> E=new <EmpDet> TreeSet();
Scanner sc=new Scanner(System.in);
/*interface ValidAge{
	public boolean IsValid(int age);
	public boolean ChkSal(int salary);
}

ValidAge V=new ValidAge() {
	public boolean IsValid(int age) {
		if(age<0 || age>60) 
			return false;
		
		return true;
	}
	
	public boolean ChkSal(int Salary) {
		if(Salary<25000 || Salary>50000)
			return false;
		return true;
	}
	
};*/

/*interface Validity{
	public boolean checks(EmpDet E);
	
}*/

/*Validity V2=new Validity() {
	public boolean checks(EmpDet E) {
		if((E.getAge()<0 || E.getAge()>60) || (E.getSalary()<25000 || E.getSalary()>50000))
			return false;
		
		return true;
	}
	
};*/

public boolean valid(EmpDet E,Predicate<EmpDet> V) {
	return V.test(E);
}

public void AddEmpl() {
	String name;
	//int id;
	String dob; 
	String loc;
	int sal;
	/*System.out.println("Enter Id:");
	id=sc.nextInt();*/
	System.out.println("Enter Name:");
	name=sc.next();
	
	System.out.println("Enter dob:");
	dob=sc.next();
	System.out.println("Enter Salary:");
	sal=sc.nextInt();
	/*while(!V.IsValid(age)) {
		System.out.println("Please Enter a Valid Age...!!!");
		System.out.println("Enter Age:");
		age=sc.nextInt();
	}*/
	
	System.out.println("Enter Department:");
	loc=sc.next();
	
	/*while(!V.ChkSal(sal)) {
		System.out.println("Please Enter a Valid Salary...!!!");
		System.out.println("Enter Salary:");
		sal=sc.nextInt();
	}*/
	
	//System.out.println(!V2.checks(new EmpDet(name, age, loc, sal)));
	/*while(!V2.checks(new EmpDet(name, age, loc, sal)))
	{
		System.out.println("Please Enter The Valid Age And/Or Salary...!!!");
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter The Valid Salary:");
		sal=sc.nextInt();
	}*/
	//EmpDet E;
	/*Validity V3=(E)->{ if((E.getAge()<0 || E.getAge()>60) || (E.getSalary()<25000 || E.getSalary()>50000)) return false;

	return true;};*/
	
	/*boolean status=valid(new EmpDet(name, age, loc,sal),e->e.getAge()>0 && e.getAge()<=60 && e.getSalary()>25000 && e.getSalary()<50000
	);*/

	//while(!V3.checks(new EmpDet(name, age, loc,sal))) {
	//while(!status) {
		/*System.out.println("Please Enter The Valid Age And/Or Salary...!!!");
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter The Valid Salary:");
		sal=sc.nextInt();*/
	 //status=valid(new EmpDet(name, age, loc,sal),e->e.getAge()>0 && e.getAge()<=60 && e.getSalary()>25000 && e.getSalary()<50000
				//);

	//}
	E.add(new EmpDet(name, dob, loc,sal));
	System.out.println("Employee Added At:"+new EmpDet(name, dob, loc,sal).getTS());
}
public void display() {
	for(Object O:E) {
		System.out.println(O);
	}
}

public void stats() {
	long ct;
	ct = E.stream().filter(w->(int)(w.getAge().charAt(0)+w.getAge().charAt(1))>30).count();
	System.out.println("Employees Age Greater Than 30:"+ct);
	List <Integer> IDS=new ArrayList<Integer>();
	System.out.println("Employees ID having Age Greater Than 30:");
	IDS=E.stream().filter(w->(int)(w.getAge().charAt(0)+w.getAge().charAt(1))>30).map(w->w.getId()).collect(Collectors.toList());
	//E.forEach(w->System.out.println(w));
	IDS.forEach(w->System.out.println(w));
	System.out.println("Employees Count By Department:");
	Set <String> D=new HashSet<String>();
	Map <String,Long> ED=new <String,Long> TreeMap();
	
	ED=E.stream().collect(Collectors.groupingBy(EmpDet::getDepartment,Collectors.counting()));
	System.out.println(ED);
	
	int Salary=E.stream().map(EmpDet::getSalary).reduce(0, (a,b)->a.intValue()+b.intValue()).intValue();
	System.out.println("Total Salary Of All The Employees:"+Salary);
	
	System.out.println("Average Salary By Department:");
	Map <String,Double> GBD=new <String,Double> TreeMap();
	GBD=E.stream().collect(Collectors.groupingBy(EmpDet::getDepartment,Collectors.averagingInt(EmpDet::getSalary)));
	for(Object O:GBD.keySet()) {
		System.out.println(O+"\t\t"+GBD.get(O).intValue());
		
	System.out.println("Sorting The Contents In Ascending Order By Name:");
	List <EmpDet> SA=new ArrayList <EmpDet> ();
	SA=E.stream().sorted(Comparator.comparing(EmpDet::getAge)).collect(Collectors.toList());
	SA.forEach(w->System.out.println(w));
	
	
	System.out.println("Display The Department Names Having Number OF Employees Greater Than 3:");
	List <String> CGT=new <String> ArrayList();
	CGT=E.parallelStream().collect(Collectors.groupingBy(EmpDet::getDepartment,Collectors.counting())).
			entrySet().stream().filter(entry -> entry.getValue() >= 2).map(Map.Entry::getKey).collect(Collectors.toList());
			
	CGT.forEach(w->System.out.println(w));
	
		System.out.println("Employees Name Starting With S:");
		List <String> N=new ArrayList<String>();
		N=E.stream().filter(w->w.getName().charAt(0)=='s'||w.getName().charAt(0)=='S').map(w->w.getName()).collect(Collectors.toList());
		System.out.println(N);
	
	}
	
}

public static void main(String args[]) {
	int ch;
	ValidateEmployee V1=new ValidateEmployee();
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("1.Add");
	System.out.println("2.Display");
	System.out.println("3.Stats");
	System.out.println("4.Exit");
	System.out.println("Enter Your Choice 1,2,3,4:");
	ch=sc.nextInt();
	switch(ch) {
	case 1:V1.AddEmpl(); 
	break;
	case 2:V1.display();
	break;
	case 3:V1.stats();
	break;
	case 4:System.exit(0);
	break;
	default: System.out.println("Wrong Choice");
	}
}
}
}

