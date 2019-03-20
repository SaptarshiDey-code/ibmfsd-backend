package Day3_collections;
import java.util.*;
public class EmployeeHash {
	String name;
	int id;
	String location;
	 int Salary;
	public EmployeeHash(String name,int id,String location,int Salary) {
		this.name=name;
		this.id=id;
		this.location=location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	return this.getId() + " " + this.getName() + " " + this.getLocation() + " " + this.getSalary();
}
}
