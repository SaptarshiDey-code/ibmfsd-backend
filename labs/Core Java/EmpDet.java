package Day5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import Day7.DateTime;

public class EmpDet implements Comparable<EmpDet>{
	static int counter=100;
int id;
String name;
String dob;
String age;
String Department;
int Salary;
public EmpDet(String name,String dob,String Department,int Salary) {
	this.id=counter;
	this.name=name;
	this.dob=dob;
	this.Department=Department;
	this.Salary=Salary;
	EmpDet.counter+=1;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	this.Salary = salary;
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

public long getTS() {
	Instant I=Instant.now();
	return I.getEpochSecond();
}

public String getAge() {
	Period p=Period.between( LocalDate.parse(this.dob),LocalDate.now());
	return p.getYears()+"Y";
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	this.Department = department;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+" "+this.getName()+" "+this.getAge()+" "+this.getDepartment();
	}
@Override
public int compareTo(EmpDet o) {
	// TODO Auto-generated method stub
	return (this.getName().compareTo(o.getName()));
}
}
