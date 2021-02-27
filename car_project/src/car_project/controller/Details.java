package car_project.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import car_project.model.DB_con;
import car_project.model.Search;

/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/details.jsp");
		rd.forward(request, response);
		}else {
			request.setAttribute("logout", "Login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("username")!=null) {
		String Model = request.getParameter("Model");
		String Date_of_purchase = request.getParameter("Date_of_purchase");
		int Price = Integer.parseInt(request.getParameter("Price"));
		String Color = request.getParameter("Color");
		System.out.println(Model);
		System.out.println(Date_of_purchase);
		System.out.println(Price);
		System.out.println(Color);
		DB_con db=new DB_con();
		Connection con = db.establishcon();
		Search s=new Search();
		ResultSet result = s.search_res(Model, Date_of_purchase, Color, Price, con);
		request.setAttribute("result", result);
		request.setAttribute("msg", "MR.Bean Your Collection.......");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/search.jsp");
		rd.include(request, response);
		}else {
			request.setAttribute("logout", "Login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		}

}
