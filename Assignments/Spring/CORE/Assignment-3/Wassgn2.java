package JDBC_Assignment;

import org.springframework.stereotype.Component;

@Component
public class Wassgn2 {
	int id;
	String name;
	int age;
	String department;
	String city;
	int salary;
	
	public Wassgn2() {
		
	}
	/*public Wassgn2(int id,String name,int age, String department,String city,int salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.department=department;
		this.city=city;
		this.salary=salary;
	}*/

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
