package Day4_Generics;
import java.util.*;

public class  EmployeeGenerics <T extends Number> implements Comparable<EmployeeGenerics<?>>{
	
		String name;
		int id;
		String location;
		String department;
		 T Salary;
		public EmployeeGenerics(String name,int id,String location,String Department,T Salary) {
			this.name=name;
			this.id=id;
			this.location=location;
			this.department=Department;
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
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public T getSalary() {
			return Salary;
		}
		public void setSalary(T salary) {
			Salary = salary;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId() + " " + this.getName() + " " + this.getLocation() + " " +this.getDepartment()+" "+ this.getSalary();
	}
	@Override
	public int compareTo(EmployeeGenerics<?> ob) {
	// TODO Auto-generated method stub
		return ob.getName().compareTo(this.getName());
		
	}
	}



