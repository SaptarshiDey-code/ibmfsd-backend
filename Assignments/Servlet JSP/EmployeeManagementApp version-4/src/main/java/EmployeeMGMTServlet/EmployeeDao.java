package EmployeeMGMTServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

public class EmployeeDao {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/employeejspdb";

	// Database credentials
	static final String USER = "root"; // root
	static final String PASS = ""; 
	Scanner sc=new Scanner(System.in);
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public EmployeeDao() throws SQLException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connection estabilished: " + conn);
		//System.out.println("Creating statement...");
		stmt = conn.createStatement();
		
		
		

	}
	
	public void InsertDb(Employee we) {
					
		
		
		try {
			/*Class.forName("com.mysql.jdbc.Driver");
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection estabilished: " + conn);
			System.out.println("Creating statement...");
			stmt = conn.createStatement();*/
			
			
		String queryInsert="INSERT INTO employee VALUES(?,?,?,?,?,?,?)";
		pstmt=conn.prepareStatement(queryInsert);
		pstmt.setInt(1, we.getId());
		pstmt.setString(2, we.getName());
		pstmt.setInt(3, we.getAge());
		pstmt.setString(4, we.getDepartment());
		pstmt.setString(5, we.getGender());
		pstmt.setString(6, we.getAddress());
		pstmt.setInt(7, we.getSalary());
		int count=pstmt.executeUpdate();
		//stmt.execute(queryInsert);
		System.out.println(count+" Employees Added");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se2) {
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se2) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		}
		
	
	public List<Employee> fetchAll(){
		List <Employee> A=new ArrayList<Employee>();
		try {
			/*Class.forName("com.mysql.jdbc.Driver");
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection estabilished: " + conn);
			System.out.println("Creating statement...");
			stmt = conn.createStatement();*/
			
			
			String queryRetreive="Select * from employee";
			pstmt=conn.prepareStatement(queryRetreive);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				A.add(new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		finally {
			
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		
			return A;
		}
	
public void UpdateEmployee(Employee we,int id) {
		
		try {
			String updateNameQuery="UPDATE employee SET name=?,age=?,department=?,gender=?,address=?,salary=? WHERE id=?";
			pstmt=conn.prepareStatement(updateNameQuery);
			pstmt.setString(1, we.getName());
			pstmt.setInt(2, we.getAge());
			pstmt.setString(3,we.getDepartment());
			pstmt.setString(4, we.getGender());
			pstmt.setString(5, we.getAddress());
			pstmt.setInt(6, we.getSalary());
			pstmt.setInt(7, id);
			pstmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if(pstmt!=null) {
				pstmt.close();
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

public void deleteEmp(int id) 
{
	try {
	String deleteQuery="Delete from employee where id=?";
	pstmt=conn.prepareStatement(deleteQuery);
	pstmt.setInt(1, id);
	
	pstmt.executeUpdate();
}
catch(SQLException e) {
	e.printStackTrace();
}
catch(Exception e) {
	e.printStackTrace();
}
finally {
	try {
	if(pstmt!=null) {
		pstmt.close();
	}
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	try {
		if(conn!=null) {
			conn.close();
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
}
}

public Employee FindEmp(int id) {
	Employee emp=null;
	try {
		String queryRetreive="Select * from employee where id=?";
		pstmt=conn.prepareStatement(queryRetreive);
		pstmt.setInt(1,id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
		emp=new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
		if(pstmt!=null) {
			pstmt.close();
		}
	}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			if(conn!=null) {
				conn.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return emp;
	
}
	
}