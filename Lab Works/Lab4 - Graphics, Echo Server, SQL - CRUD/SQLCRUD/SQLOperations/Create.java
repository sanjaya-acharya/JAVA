package SQLOperations;

public class Create {
	ProvideConnection SQL = new ProvideConnection();

	public int insert(String fname, String lname, String email) throws Exception {
		String query = "INSERT INTO Details (`first_name`,`last_name`,`email`) VALUES (?, ?, ?);";

		SQL.connect();
		SQL.p = SQL.c.prepareStatement(query);

		SQL.p.setString(1, fname);
		SQL.p.setString(2, lname);
		SQL.p.setString(3, email);

		return SQL.p.executeUpdate();
	}

	public void closeAllConnections() {
		try {
			SQL.p.close();
			SQL.c.close();
		} catch (Exception e) {

		}
	}
}