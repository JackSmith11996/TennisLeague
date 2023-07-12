package Controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.TennisDAO;
import Models.Tennis;

/**
 * Servlet implementation class showTeamsController
 */
@WebServlet("/showTeams")
public class showTeamsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// do get method to retrieve all the clubs and display on the homepage.jsp
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TennisDAO dao = new TennisDAO();
		ArrayList<Tennis> allClubs = dao.getAllTeams();
		request.setAttribute("Tennis", allClubs);
		RequestDispatcher red = request.getRequestDispatcher("HomePage.jsp");
		red.include(request, response);
		
		
		
		
		
	}

	
}
