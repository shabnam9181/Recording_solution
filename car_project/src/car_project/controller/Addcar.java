package car_project.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import car_project.model.Add_car_details;
import car_project.model.DB_con;

/**
 * Servlet implementation class Addcar
 */
@WebServlet("/Addcar")
public class Addcar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addcar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/addcar.jsp");
		rd.forward(request, response);}
		else {
			request.setAttribute("logout", "Login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null) {
		String Company = request.getParameter("Company");
		String Model = request.getParameter("Model");
		String Color = request.getParameter("Color");
		String Date_of_purchase = request.getParameter("Date_of_purchase");
		int Price = Integer.parseInt(request.getParameter("Price"));
		String Engine_capacity = request.getParameter("Engine_capacity");
		String Licence_plate_number = request.getParameter("Licence_plate_number");
		int Seating_capacity = Integer.parseInt(request.getParameter("Seating_capacity"));
		DB_con db=new DB_con();
		Connection con = db.establishcon();
		Add_car_details add=new Add_car_details();
		int i=add.add_detail(Company, Model, Color, Date_of_purchase, Price, Engine_capacity, Licence_plate_number, Seating_capacity, con);
	    if(i==1) {
	    	request.setAttribute("msg", "Record saved");
	    	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/addcar.jsp");
	    	rd.forward(request, response);
	    }
		}else {
			request.setAttribute("logout", "Login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	    
	}

}
