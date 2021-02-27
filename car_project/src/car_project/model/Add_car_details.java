package car_project.model;

import java.sql.*;

public class Add_car_details {
	int i;
	public int add_detail(String Company, String Model, String Color, String Date_of_purchase, int Price,
			String Engine_capacity, String Licence_plate_number, int Seating_capacity, Connection con) {
		try {
			System.out.println(Company);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmnt = con.createStatement();
			 i = stmnt.executeUpdate("insert into car values('" + Company + "','" + Model + "','" + Color + "','"
					+ Date_of_purchase + "','" + Price + "','" + Engine_capacity + "','" + Licence_plate_number + "','"
					+ Seating_capacity + "')");
			System.out.println("after executeupdate statement");
			System.out.println(i);
			return i;
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end add");
	return 0;
	}
}
