package car_project.model;

import java.sql.*;

public class Show_car {
	public Connection con;
	public ResultSet set;

	public ResultSet show(Connection con) {
		try {
			Statement stmnt = con.createStatement();
			set = stmnt.executeQuery("select * from car");
			return set;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
}
