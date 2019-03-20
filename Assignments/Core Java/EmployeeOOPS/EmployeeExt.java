package Day2;

public class EmployeeExt extends Person{
	private int Salary;
	int id;
	String dept;
	EmployeeExt(String name,int age,String city,int id,String dept,int Salary){
		super(name,age,city);
		this.id=id;
		this.dept=dept;
		this.Salary=Salary;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDept(){
		return this.dept;
	}
	public int getSalary() {
		return this.Salary;
	}
	
	
	public void DispEmployee() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getCity());
		System.out.println(getId());
		System.out.println(getDept());
		System.out.println(getSalary());
		

	}
	public static void main(String args[]) {
		EmployeeExt ob=new EmployeeExt("Ajay",52,"Delhi",1,"IT",54000);
		ob.DispEmployee();
	}

}
