package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
	public static void createTable() throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/class";
		String username="root";
		String password ="Kgisl@123";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		String Query="create table student(id int,name varchar(20),age int)";
		stmt.executeUpdate(Query);
		System.out.println("Table Create suceessfully");
	}
}