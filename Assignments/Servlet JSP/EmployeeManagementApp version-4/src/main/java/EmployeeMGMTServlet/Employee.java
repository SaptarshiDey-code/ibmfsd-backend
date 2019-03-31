package EmployeeMGMTServlet;
import java.util.*;
public class Employee {
	int id;
	String name;
	int age;
	String department;
	String address;
	int salary;
	String gender;
	public Employee(int id,String name,int age, String department,String gender,String address,int salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=department;
		this.address=address;
		this.salary=salary;
		this.gender=gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/*public Employee getEmpl(List <Employee> e,int id) {
		Employee z = null;
		for(Employee obj:e) {
			if(obj.getId()==id) {
				z=obj;
				break;
			}
		}
		return z;
	}*/

}




