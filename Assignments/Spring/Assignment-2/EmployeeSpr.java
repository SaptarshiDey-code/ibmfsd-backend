package SpringIntro;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
//import java.util.Period;
import java.util.List;
//import java.util.collections;

public class EmployeeSpr {

int id;	
String name;
LocalDate dob;
String designation;
double salary;
List skills;
Address address;
boolean fulltime;

public EmployeeSpr(int id,String name,Address address) {
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
public List getSkills() {
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


public LocalDate getDob() {
	return dob;
}


public void setDob(LocalDate dob) {
	this.dob = dob;
}

public int getAge() {
	LocalDate D=LocalDate.now();
	
	Period P=Period.between(D, this.getDob());
	return P.getYears();
}
	
}
