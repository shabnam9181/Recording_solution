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
import car_project.model.Show_car;

/**
 * Servlet implementation class Showcar
 */
@WebServlet("/Showcar")
public class Showcar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showcar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("username") != null) {
		DB_con db=new DB_con();
		Connection con = db.establishcon();
		Show_car car=new Show_car();
		ResultSet result = car.show(con);
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/showcar.jsp");
		rd.forward(request, response);
		}
		else {
			request.setAttribute("logout", "Login again");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
