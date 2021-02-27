package car_project.model;

import java.sql.*;

public class Deletecar {
public Connection con;
public void delete(String Model,Connection con) {
try {
	System.out.println("delete method");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Statement stmnt = con.createStatement();
	stmnt.executeUpdate("delete from car where Model='"+Model+"'");
	System.out.println("delete method completed");
} catch (Exception e) {
	// TODO: handle exception
}	
}
}
