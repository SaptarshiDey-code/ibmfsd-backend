package JDBC_Assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
@Component
public class Wassgn2dao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/employeedb";

	// Database credentials
	static final String USER = "root"; // root
	static final String PASS = ""; 
	Scanner sc=new Scanner(System.in);
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public Wassgn2dao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		// STEP 3: Open a connection
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		System.out.println("Connection estabilished: " + conn);
		//System.out.println("Creating statement...");
		stmt = conn.createStatement();
		
		
		

	}
	@Bean
	public void InsertDb(Wassgn2 we) {
					
		
		
		try {
			/*Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection estabilished: " + conn);
			System.out.println("Creating statement...");
			stmt = conn.createStatement();*/
			
			
		String queryInsert="INSERT INTO emp1 VALUES(?,?,?,?,?,?)";
		pstmt=conn.prepareStatement(queryInsert);
		pstmt.setInt(1, we.getId());
		pstmt.setString(2, we.getName());
		pstmt.setInt(3, we.getAge());
		pstmt.setString(4, we.getDepartment());
		pstmt.setString(5, we.getCity());
		pstmt.setInt(6, we.getSalary());
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
		
	@Bean
	public List<List> fetchAll(){
		List <List> A=new ArrayList<List>();
		
		try {
			/*Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connection estabilished: " + conn);
			System.out.println("Creating statement...");
			stmt = conn.createStatement();*/
			
			
			String queryRetreive="Select * from emp1";
			pstmt=conn.prepareStatement(queryRetreive);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				List B=new ArrayList ();
				B.add(rs.getInt(1));
				B.add(rs.getString(2));
				B.add(rs.getInt(3));
				B.add(rs.getString(4));
				B.add(rs.getString(5));
				B.add(rs.getInt(6));
				A.add(B);
				/*B.remove(1);
				B.remove(2);
				B.remove(3);
				B.remove(4);
				B.remove(5);
				B.remove(6);*/
				//B.clear();
				
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
	@Bean
	public void UpdateName(int id,String nm) {
		
		try {
			String updateNameQuery="UPDATE emp1 SET name=? WHERE id=?";
			pstmt=conn.prepareStatement(updateNameQuery);
			pstmt.setString(1, nm);
			pstmt.setInt(2, id);
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
		@Bean
		public void UpdateAge(int id,int age) {
			
			try {
				String updateNameQuery="UPDATE emp1 SET age=? WHERE id=?";
				pstmt=conn.prepareStatement(updateNameQuery);
				pstmt.setInt(1, age);
				pstmt.setInt(2, id);
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
		@Bean
		public void UpdateDept(int id,String dept) {
			
			try {
				String updateNameQuery="UPDATE emp1 SET department=? WHERE id=?";
				pstmt=conn.prepareStatement(updateNameQuery);
				pstmt.setString(1, dept);
				pstmt.setInt(2, id);
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
		@Bean
		public void UpdateCity(int id,String cty) {
			
			try {
				String updateNameQuery="UPDATE emp1 SET city=? WHERE id=?";
				pstmt=conn.prepareStatement(updateNameQuery);
				pstmt.setString(1, cty);
				pstmt.setInt(2, id);
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
		@Bean
		public void UpdateSal(int id,int sal) {
			
			try {
				String updateNameQuery="UPDATE emp1 SET salary=? WHERE id=?";
				pstmt=conn.prepareStatement(updateNameQuery);
				pstmt.setInt(1, sal);
				pstmt.setInt(2, id);
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
		
		@Bean
		public void DelEmpl(int id) {
			
			try {
				String delQuery="DELETE FROM emp1 WHERE id=?";
				pstmt=conn.prepareStatement(delQuery);
				pstmt.setInt(1,id);
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
		@Bean
		public List<List> findEmpl(int id1)throws NullPointerException {
			//ResultSet status=null;
			List <List> A=new ArrayList<List>();
			List B=new ArrayList<List>();
			try {
				
				String findQuery="SELECT * FROM emp1 WHERE id=?";
				pstmt=conn.prepareStatement(findQuery);
				pstmt.setInt(1, id1);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					B.add(rs.getInt(1));
					B.add(rs.getString(2));
					B.add(rs.getInt(3));
					B.add(rs.getString(4));
					B.add(rs.getString(5));
					B.add(rs.getInt(6));
					A.add(B);
					B.clear();
				}
			}
			catch(SQLException e) {
				
				e.printStackTrace();
				//status=false;
			}
			catch(Exception e) {
				e.printStackTrace();
				//status=false;
			}
			
			
			finally {
				try {
					if(rs !=null) {
						rs.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				try {
					if(pstmt!=null) {
						pstmt.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
				/*try {
					if(conn!=null) {
						conn.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}*/
				
			}
			return A;
		}
		
		public List <String> GrByDept() {
			List <String> GN=new ArrayList<String>();
			
			ResultSet rs1=null;
			try {
				
				
				String groupdQuery="SELECT name,department FROM emp1 GROUP BY name,department ORDER BY department";
				pstmt=conn.prepareStatement(groupdQuery);
				rs1=pstmt.executeQuery();
				while(rs1.next()) {
					
					GN.add("\t\t"+rs1.getString(1)+"\t\t"+rs1.getString(2));
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
					if(rs1!=null) {
						rs1.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
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
			return GN;
		}
		
		public List<String> DwCount(){
			List <String> DC=new ArrayList<String>();
			try {
				String gbcQuery="Select department,count(*) from emp1 group by department";
				pstmt=conn.prepareStatement(gbcQuery);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					DC.add("\t\t\t"+rs.getString(1)+"\t\t\t"+rs.getInt(2));
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
					if(rs!=null) {
						rs.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
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
			return DC;
		}
		public List<String> GtAvS(){
			List <String> DC=new ArrayList<String>();
			try {
				String gtAsQuery="Select name,salary from emp1 where salary > (Select avg(salary) from emp1)";
				pstmt=conn.prepareStatement(gtAsQuery);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					DC.add("\t\t\t"+rs.getString(1)+"\t\t\t"+rs.getInt(2));
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
					if(rs!=null) {
						rs.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
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
			return DC;
		}
		
		public List<String> NstS(){
			List <String> Ns=new ArrayList<String>();
			try {
				String swSQuery="Select * from emp1 where name like 'S%'";
				pstmt=conn.prepareStatement(swSQuery);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					Ns.add(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+ rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getInt(6));
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
					if(rs!=null) {
						rs.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
				
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
			return Ns;
		}
}
