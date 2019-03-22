package Day2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
//import java.util.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import java.util.collections;
//@Component
public class Employee2 {
	
	

	

	int id;
	//@Value(value="1")
	String name;
	LocalDate dob;
	int age;
	String designation;
	double salary;
	List<String> skills;
	//@Autowired
	Address2 address;
	boolean fulltime;

	
	public Employee2() {}
	public Employee2(Address2 add) {
		this.address=add;
	}
	
	public Employee2(int id,String name,Address2 address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}


	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String desigantion) {
		this.designation = desigantion;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}

	public boolean isFulltime() {
		return fulltime;
	}
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}

	public void getMessage() {

		System.out.println("Employee Is: " + this.id+" "+this.name+" "+this.getAge()+"  "+this.getDesignation()+" "+this.getSalary()+" "+this.getSkills()+" "+this.isFulltime()+"\n"+this.address.city+" "+this.address.country+" "+this.address.pin);
	}


	/*public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}*/


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getAge() {
		LocalDate D=LocalDate.now();
		
		Period P=Period.between(this.getDob(),D);
		return P.getYears();
	}
		
	}




