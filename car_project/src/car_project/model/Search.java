package car_project.model;

import java.sql.*;

public class Search {
	public Connection con;
	public ResultSet set;

	public ResultSet search_res(String Model, String Date_of_purchase, String Color, int Price, Connection con) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery("select * from car where  Date_of_purchase ='" + Date_of_purchase
					+ "' or Model='" + Model + "'  or Price='" + Price + "' or Color='" + Color + "'");
			return set;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}
}
