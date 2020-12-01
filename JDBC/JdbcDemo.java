
package JDBC;
import java.sql.*;


public class JdbcDemo {
	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:mysql://localhost/sathe";
		String username="root";
		String password="root5";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=	DriverManager.getConnection(url, username, password);
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select stud_name from students where marks=78.0");
			while(rs.next())
			{
				String name=rs.getString(1);
				System.out.println(name);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}