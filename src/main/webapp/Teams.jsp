<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.3/css/dataTables.bootstrap5.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.13.3/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.13.3/js/dataTables.bootstrap5.min.js"></script>
<link href="CSS/TennisTable.css" rel="stylesheet">


<title>Home</title>
</head>
<body>

<h1>Middlesex Tennis League</h1>

 <!-- NavBar to different pages -->

<div class="navBar">
  <a href="/TennisLeagueTable/showTeams">Home</a>
  <a href ="/TennisLeagueTable/showPlayers">Teams</a>
  <!-- Trigger/Open The Modal -->
<button id="myBtn">Add Result</button>

<!-- The Modal for choosing teams-->
<div id="myModal" class="modal">
  <!-- Inputs for teams -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <form action="/TennisLeagueTable/showResultPlayers" method="post">
      <label for="team1">Home Team:</label>
      <input type="text" id="team1" name="team1">
      <label for="team2">Away Team:</label>
      <input type="text" id="team2" name="team2">
      <br><br>
      <input type="submit" value="Continue">
    </form>
  </div>
</div>
  <a href="#about">About</a>
  <a href="#contact">Contact</a>
  <a href="#Login" class="split">Login</a>
</div>


<table id="clubsInfo" class="table table-striped">
<thead>
			<tr>
				<th>Club</th>
				<th>Player 1</th>
				<th>Player 2</th>
				<th>Player 3</th>
				<th>Player 4</th>
				<th>Player 5</th>
				<th>Player 6</th>
				<th>Player 7</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${Tennis}" var="team">
				<tr>
					<td>${team.club}</td>
					<td>${team.player1}</td>
					<td>${team.player2}</td>
					<td>${team.player3}</td>
					<td>${team.player4}</td>
					<td>${team.player5}</td>
					<td>${team.player6}</td>
					<td>${team.player7}</td>
				</tr>
			</c:forEach>
		</tbody>
</table>
<script src="Scripts/datatables.js"></script>
</body>

</html>