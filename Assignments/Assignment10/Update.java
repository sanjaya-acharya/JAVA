import java.sql.*;

public class Update {
	public static void main(String[] args) throws Exception{
		PrepareSql sql = new PrepareSql();
		sql.prepare();

        String query = "UPDATE students SET rollNo = '15' where Name='ABC'";
		int result = sql.stmt.executeUpdate(query);
		System.out.println(result + " row updated.");
	}
}