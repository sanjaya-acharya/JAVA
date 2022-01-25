import java.sql.*;

public class PrepareSql {
	Statement stmt;
	boolean prepare() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student_management","root","");
		stmt = conn.createStatement();
		return true;
	}
}