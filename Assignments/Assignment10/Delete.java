import java.sql.*;

public class Delete {
	public static void main(String[] args) throws Exception {
		PrepareSQL sql = new PrepareSQL();
		sql.prepare();

        String query = "DELETE FROM students WHERE NAME = 'John Eoe'";
		int result = sql.stmt.executeUpdate(query);
		System.out.println(result + " row deleted");
	}
}