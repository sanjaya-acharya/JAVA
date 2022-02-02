package SQLOperations;

import java.sql.*;

class ProvideConnection {
	static final String driver = "com.mysql.cj.jdbc.Driver";
	static final String dbUrl = "jdbc:mysql://localhost/College_Java";
	static final String dbUsername = "root";
	static final String dbPassword = "root";

	public Connection c;
	public PreparedStatement p;

	public void connect() throws Exception {
		// Loading driver...
		Class.forName(driver);

		// creating connection...
		c = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		// Creating preparedStatement
		p = c.prepareStatement("sql");
	}
}