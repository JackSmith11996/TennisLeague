package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import Models.Tennis;


public class TennisDAO {
	
	Tennis oneTeam = null;
	Connection conn = null;
    Statement stmt = null;
	String user = "smithjac";
    String password = "stigwomP6";
    // Note none default port used, 6306 not 3306
    String url = "jdbc:mysql://mudfoot.doc.stu.mmu.ac.uk:6306/"+user;

	public TennisDAO() {}

	
	@SuppressWarnings("deprecation")
	private void openConnection(){
		// loading jdbc driver for mysql
		try{
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception e) { System.out.println(e); }

		// connecting to database
		try{
			// connection string for demos database, username demos, password demos
 			conn = DriverManager.getConnection(url, user, password);
		    stmt = conn.createStatement();
		} catch(SQLException se) { System.out.println(se); }	   
    }
	private void closeConnection(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Tennis getNextClub(ResultSet rs){
    	Tennis thisClub=null;
		try {
			thisClub = new Tennis(
					rs.getString("Club"),
					rs.getString("Player1"),
					rs.getString("Player2"),
					rs.getString("Player3"),
					rs.getString("Player4"),
					rs.getString("Player5"),
					rs.getString("Player6"),
					rs.getString("Player7"),
					rs.getInt("Wins"),
					rs.getInt("Losses"),
					rs.getInt("Draws"),
					rs.getInt("Played"),
					rs.getInt("Points")	);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return thisClub;		
	}
	
	
	
   public ArrayList<Tennis> getAllTeams(){
	   
		ArrayList<Tennis> allClubs = new ArrayList<Tennis>();
		openConnection();
		
	    // Create select statement and execute it
		try{
		    String selectSQL = "select * from Teams";
		    ResultSet rs1 = stmt.executeQuery(selectSQL);
	    // Retrieve the results
		    while(rs1.next()){
		    	oneTeam = getNextClub(rs1);
		    	allClubs.add(oneTeam);
		   }

		    stmt.close();
		    closeConnection();
		} catch(SQLException se) { System.out.println(se); }

	   return allClubs;
   }

   public List<Tennis> getClubsByNames(String team1, String team2) {
	    openConnection();
	    List<Tennis> clubs = new ArrayList<>();

	    try {
	        String selectSQL = "SELECT * FROM Teams WHERE club = ? OR club = ?";
	        PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
	        preparedStatement.setString(1, team1);
	        preparedStatement.setString(2, team2);
	        ResultSet rs1 = preparedStatement.executeQuery();
	        
	        // Retrieve the results
	        while (rs1.next()) {
	            Tennis oneTeam = getNextClub(rs1);
	            clubs.add(oneTeam);
	        }

	        preparedStatement.close();
	        closeConnection();
	    } catch (SQLException se) {
	        System.out.println(se);
	    }

	    return clubs;
	}
   
   public void updateTables(Tennis f) throws SQLException{
	   
	   openConnection();
	   try {
	       String updateSQL = "UPDATE Teams SET Wins=?, Losses=?, Draws=?, Played=?, Points= Points + ? WHERE Club=?";

	       // Update the first club
	       PreparedStatement pstmt = conn.prepareStatement(updateSQL);
	  
	       int club1winsadd = f.getClub1winsadd();
	       pstmt.setInt(1, club1winsadd);
	       int club1lossadd = f.getClub1lossadd();
	       pstmt.setInt(2, club1lossadd);
	       int club1drawsadd = f.getClub1drawsadd();
	       pstmt.setInt(3, club1drawsadd);
	       int club1playedNum = f.getClub1playedNum();
	       pstmt.setInt(4, club1playedNum);
	       int HTtotalPoints = f.getHTtotalPoints();
	       pstmt.setInt(5, HTtotalPoints);
	       String club1name = f.getClub1name();
	       pstmt.setString(6, club1name);
	       pstmt.executeUpdate();

	     
	       // Update the second club
	       int club2winsadd = f.getClub2winsadd();
	       pstmt.setInt(1, club2winsadd );
	       int club2lossadd = f.getClub2lossadd();
	       pstmt.setInt(2, club2lossadd );
	       int club2drawsadd = f.getClub2drawsadd();
	       pstmt.setInt(3, club2drawsadd);
	       int club2playedNum = f.getClub2playedNum();
	       pstmt.setInt(4, club2playedNum );
	       String club2name = f.getClub2name();
	       int ATtotalPoints = f.getATtotalPoints();
	       pstmt.setInt(5, ATtotalPoints );
	       pstmt.setString(6, club2name );
	       pstmt.executeUpdate();

	       pstmt.close();
	       closeConnection();
	   } catch(SQLException se) { System.out.println(se); 
	   }
   }
}
