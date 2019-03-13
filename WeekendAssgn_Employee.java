package Day4_Generics;
import java.util.*;
public class WeekendAssgn_Employee  {
	String name;
	private int id;
	int age;
	String Location;
	String department;
	private int Salary;
	
	public WeekendAssgn_Employee() {
		// TODO Auto-generated constructor stub
	}
	public WeekendAssgn_Employee(String name,int id,int age,String Location,String department,int Salary) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.Location=Location;
		this.department=department;
		this.Salary=Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return (this.getId()+"\t\t"+  this.getName()+ "\t \t"+ this.getLocation()+"\t \t"+this.getSalary());
	
}

	
}
