package Controllers;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.TennisDAO;

import Models.Tennis;

/**
 * Servlet implementation class showFilmsController
 */
@WebServlet("/showResultPlayers")
public class showResultPlayersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// Post method to send teams entered and get corresponding information to populate tables
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String team1 = request.getParameter("team1");
	    String team2 = request.getParameter("team2");

	    // TODO: Perform any necessary validation on the input values

	    TennisDAO dao = new TennisDAO();
	    List<Tennis> clubs = dao.getClubsByNames(team1, team2);
	    if (clubs.size() < 2) {
	        // Handle error case where one or both clubs were not found
	    }
	    Tennis club1 = clubs.get(0);
	    Tennis club2 = clubs.get(1);

	    request.setAttribute("club1", club1);
	    request.setAttribute("club2", club2);
	    
	    

	    RequestDispatcher dispatcher = request.getRequestDispatcher("ResultsForm.jsp");
	    dispatcher.forward(request, response);
	}

	
}