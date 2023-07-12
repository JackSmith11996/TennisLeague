package Controllers;


import java.io.IOException;
import java.sql.SQLException;

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
@WebServlet("/AddResults")
public class AddResultsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	// servlet to get the players for the table on teams.jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
	   //get Parameters for the data that has been inputted
		String club1name = request.getParameter("club1name");
		System.out.print(club1name);
		String club2name = request.getParameter("club2name");
		int club1playedNumber = 0;
		int club2playedNumber = 0;
		int club1winsadds = 0;
		int club1lossadds = 0;
		int club2winsadds = 0;
		int club2lossadds = 0;
		int club1drawsadds = 0;
		int club2drawsadds = 0;
		int HTtotalPointss = 0;
		int ATtotalPointss = 0;

		String parameter = request.getParameter("club1played");
		if (parameter != null && !parameter.isEmpty()) {
		    club1playedNumber = Integer.parseInt(parameter);
		    System.out.println(club1playedNumber);
		}

		parameter = request.getParameter("club2played");
		if (parameter != null && !parameter.isEmpty()) {
		    club2playedNumber = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club1wins");
		if (parameter != null && !parameter.isEmpty()) {
		    club1winsadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club1loss");
		if (parameter != null && !parameter.isEmpty()) {
		    club1lossadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club2wins");
		if (parameter != null && !parameter.isEmpty()) {
		    club2winsadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club2loss");
		if (parameter != null && !parameter.isEmpty()) {
		    club2lossadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club1draws");
		if (parameter != null && !parameter.isEmpty()) {
		    club1drawsadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("club2draws");
		if (parameter != null && !parameter.isEmpty()) {
		    club2drawsadds = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("HTtotal");
		if (parameter != null && !parameter.isEmpty()) {
		    HTtotalPointss = Integer.parseInt(parameter);
		}

		parameter = request.getParameter("ATtotal");
		if (parameter != null && !parameter.isEmpty()) {
		    ATtotalPointss = Integer.parseInt(parameter);
		}
	    
		//Double the score to get the points
	    int ATtotalPoints = ATtotalPointss * 2;
	    int HTtotalPoints = HTtotalPointss * 2;
	    
	    int club1playedNum = club1playedNumber +1;
	    int club2playedNum = club2playedNumber +1;
	    int club1winsadd = club1winsadds;
	    int club2lossadd = club2lossadds;
	    int club2winsadd = club2winsadds;
	    int club1lossadd = club1lossadds;
	    int club1drawsadd = club1drawsadds;
	    int club2drawsadd = club2drawsadds;

	    //Check whether its a win/loss/draw for the clubs and pop it into the database
	    if (HTtotalPoints > ATtotalPoints) {
	        club1winsadd++;
	        club2lossadd++;
	    } else if (HTtotalPoints < ATtotalPoints) {
	        club2winsadd++;
	        club1lossadd++;
	    } else if (HTtotalPoints == ATtotalPoints) {
	        club1drawsadd++;
	        club2drawsadd++;
	    }

	    Tennis f = new Tennis(club1name, club2name, club1playedNum, club2playedNum, club1winsadd, club2winsadd, club1lossadd, club2lossadd,club1drawsadd,club2drawsadd, HTtotalPoints, ATtotalPoints);
	    
	    
	    TennisDAO dao = new TennisDAO();

	    try {
	        dao.updateTables(f);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    response.sendRedirect("./showTeams");
	}
}
