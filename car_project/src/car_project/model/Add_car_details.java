package car_project.model;

import java.sql.*;

public class Add_car_details {
	int i;
	public int add_detail(String Company, String Model, String Color, String Date_of_purchase, int Price,
			String Engine_capacity, String Licence_plate_number, int Seating_capacity, Connection con) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmnt = con.createStatement();
			 i = stmnt.executeUpdate("insert into car values('" + Company + "','" + Model + "','" + Color + "','"
					+ Date_of_purchase + "','" + Price + "','" + Engine_capacity + "','" + Licence_plate_number + "','"
					+ Seating_capacity + "')");
			return i;
		} catch (Exception e) {
			// TODO: handle exception
		}
	return 0;
	}
}
