package car_project.model;

import java.sql.*;

public class Updatecar {
	int i;
	public Connection con;

	public int update(String Color, Connection con, String Licence_plate_number, String Date_of_purchase) {
		try {
			System.out.println("update link");
			Statement stmnt = con.createStatement();
			i = stmnt.executeUpdate("update car set Color='" + Color + "' where Date_of_purchase='" + Date_of_purchase
					+ "' and Licence_plate_number='" + Licence_plate_number + "'");
			System.out.println(i);
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
}
