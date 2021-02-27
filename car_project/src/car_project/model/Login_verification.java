package car_project.model;

import java.sql.*;

public class Login_verification {
	private ResultSet result;
	private Statement stmnt;

	public boolean login(String username, String password, Connection con) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			stmnt = con.createStatement();
			result = stmnt.executeQuery(
					"select * from login where username='" + username + "' and password='" + password + "'");
			System.out.println("login verification");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
