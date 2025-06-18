package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deletedata {
	public static void deletevalues(int data) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/class";
		String username = "root";
		String password = "Kgisl@123";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		String Query = "delete from student where id=" + data;
		stmt.executeUpdate(Query);
		System.out.println("Values Deleted suceessfully");
	}
}