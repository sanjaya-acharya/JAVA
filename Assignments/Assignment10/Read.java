import java.sql.*;

public class Read {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		PrepareSQL sql = new PrepareSQL();
		sql.prepare();

        String query = "SELECT * FROM students";

        ResultSet results = sql.stmt.executeQuery(query);

        while(results.next()) {
			System.out.print(results.getString("Name")+", ");
			System.out.print(results.getString("Address")+", ");
			System.out.print(results.getLong("Phone") + "\n");
		}
	}
}