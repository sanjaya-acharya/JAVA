import java.sql.*;

public class Create {
	public static void main(String[] args) throws Exception {
		PrepareSql sql = new PrepareSql();
		sql.prepare();

        String query = "INSERT INTO students (`Name`,`Address`,`Phone`) VALUES"
				+ "('Bishal','Bagar','061440011'),('Bibel','Bagar','061441258')";
		int count =  sql.stmt.executeUpdate(query);
		System.out.println(count + " rows inserted.");
	}
}