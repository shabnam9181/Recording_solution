package car_project.model;

import java.sql.*;

public class DB_con {
public Connection con;
public Connection establishcon() {
	try {
		System.out.println("establish connection");
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardetails1","root","mysql");
		 System.out.println("con created");
		 return con;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return con;
}
}
