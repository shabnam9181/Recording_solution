package car_project.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car_project.model.DB_con;
import car_project.model.Updatecar;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Date_of_purchase = request.getParameter("Date_of_purchase");
		String Licence_plate_number = request.getParameter("Licence_plate_number");
		request.setAttribute("Date_of_purchase", Date_of_purchase);
		request.setAttribute("Licence_plate_number", Licence_plate_number);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/update.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Color = request.getParameter("Color");
		String Date_of_purchase = request.getParameter("Date_of_purchase");
		String Licence_plate_number = request.getParameter("Licence_plate_number");
		DB_con db=new DB_con();
		Connection con = db.establishcon();
		Updatecar up=new Updatecar();
		int i = up.update(Color, con, Licence_plate_number, Date_of_purchase);
		if(i==1) {
		request.setAttribute("update", "Data updated");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/update.jsp");
		rd.forward(request, response);
		}
	}

}
