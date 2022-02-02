package SQLOperations;

public class Delete {
    ProvideConnection SQL = new ProvideConnection();

    public int delete(String fname, String lname, String email) throws Exception {
        SQL.connect();

        String query = "DELETE FROM Details";
        String match1 = "first_name = ?";
        String match2 = "last_name = ?";
        String match3 = "email = ?";

        if (!fname.equals("") || !lname.equals("") || !email.equals("")) {
            query += " WHERE ";
        }

        if (!fname.equals("")) {
            query += match1;
        }

        if (!lname.equals("")) {
            if (!fname.equals("")) {
                query += " AND ";
            }

            query += match2;
        }

        if (!email.equals("")) {
            if (!fname.equals("") || !lname.equals("")) {
                query += " AND ";
            }

            query += match3;
        }

        query += ";";

        SQL.p = SQL.c.prepareStatement(query);

        int i = 0;
        if (!fname.equals("")) {
            i++;
            SQL.p.setString(i, fname);
        }
        if (!lname.equals("")) {
            i++;
            SQL.p.setString(i, lname);
        }
        if (!email.equals("")) {
            i++;
            SQL.p.setString(i, email);
        }

        return SQL.p.executeUpdate();
    }
}
