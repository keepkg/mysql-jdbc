import java.sql.*;
import java.util.Properties;

public class MysqlDbDemo
{
	// The JDBC Connector Class.
	private static final String dbClassName = "com.mysql.jdbc.Driver";

	// Connection string. simpleAppDB is the database the program
	// is connecting to. You can include user and password after this
	// by adding (say) ?user=mysql&password=mysql. Not recommended!

	private static final String CONNECTION =
		"jdbc:mysql://127.0.0.1/simpleAppDB";

	public static void main(String[] args) throws
	ClassNotFoundException,SQLException
	{
		System.out.println(dbClassName);
		// Class.forName(xxx) loads the jdbc classes and
		// creates a drivermanager class factory
		Class.forName(dbClassName);

		// Properties for user and password. Here the user and password are both 'mysql'
		Properties p = new Properties();
		p.put("user","mysql");
		p.put("password","mysql");

		// Now try to connect
		Connection c = DriverManager.getConnection(CONNECTION,p);

		System.out.println("It works!");
		c.close();
	}
}
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//class JDBCTest {
//
//	private static final String url = "jdbc:mysql://localhost";
//
//	private static final String user = "username";
//
//	private static final String password = "password";
//
//	public static void main(String args[]) {
//		try {
//			Connection con = DriverManager.getConnection(url, user, password);
//			System.out.println("Success");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}