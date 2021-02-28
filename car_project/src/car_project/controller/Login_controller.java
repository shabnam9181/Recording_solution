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

import car_project.model.DB_con;
import car_project.model.Login_verification;

/**
 * Servlet implementation class Login_controller
 */
@WebServlet("/Login")
public class Login_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login_controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		DB_con db = new DB_con();
		Connection con = db.establishcon();
		Login_verification log = new Login_verification();
		boolean result = log.login(username, password, con);
		HttpSession session = request.getSession(true);
		if (result == true) {
			session.setAttribute("username", session);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/details.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "invalid credential");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
	}

}
