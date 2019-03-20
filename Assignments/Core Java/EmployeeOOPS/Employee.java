package Day2;

public class Employee {
	int id;
	String name;
	private int age;
	String dept;
	private int Salary;
	
	public Employee(int id,String name,int age,String dept,int Salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
		this.Salary=Salary;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getDept() {
		return this.dept;
	}
	public int getSalary() {
		return this.Salary;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setSalary(int sal) {
		this.Salary=sal;
	}
	public void setId(int id) {
		this.id=id;
		
	}

}
