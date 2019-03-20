package Day2;

/**
 * @author jibm04
 *
 */
public class EmployeeMgr {
	String name;
	private int id;
	String location;
	String designation;
	private int salary;

	
	EmployeeMgr(String name,int id,String location,String designation,int salary){
		this.name=name;
		this.id=id;
		this.location=location;
		this.designation=designation;
		this.salary=salary;
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


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
