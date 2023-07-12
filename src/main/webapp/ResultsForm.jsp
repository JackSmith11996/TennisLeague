<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.3/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.3/css/dataTables.bootstrap5.min.css">
<script src="Scripts/Results.js"></script>

<link href="CSS/TennisTable.css" rel="stylesheet">


<title>Result Form</title>
</head>
<body>

<h1>Middlesex Tennis League</h1>


<div class="navBar">
  <a href="/TennisLeagueTable/showTeams">Home</a>
  <a href ="/TennisLeagueTable/showPlayers">Teams</a>
  <a href="#about">About</a>
  <a href="#contact">Contact</a>
  <a href="#Login" class="split">Login</a>
</div>
<body>
<h1>Results Form</h1>
<h1>${club1.club} VS ${club2.club}</h1>
<form action = "/TennisLeagueTable/AddResults" method = "POST">
 <!-- Table to get results-->
<table class="RF">
<thead>
  <tr>
    <td>Home Team Player 1</td>
    <td>Home Team Player 2</td>
    <td>BTM Numbers</td>
    <td>Away Team Player 1</td>
    <td>Away Team Player 2</td>
    <td>BTM Numbers</td>
  </tr>
  </thead>
  <tbody>
  <tr>
   <!-- select and options to populate them with player names to make it easier for user -->
    <td>
      <select name="htP1" id="htP1">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
    <td>
      <select name="htP1" id="htP1">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
    <td> 
    <input type="text">
    <input type="text">
    </td>
    <td>
      <select name="atP1" id="atP1">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
     <td>
      <select name="atP1" id="atP1">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
    
    <td> 
    <input type="text">
    <input type="text">
    </td>
  </tr>
<tr>
    <td>
      <select name="htP2" id="htP2">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
     <td>
      <select name="htP2" id="htP2">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
    <td> 
    <input type="text">
    <input type="text">
    </td>
    <td>
      <select name="atP2" id="atP2">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
    <td>
      <select name="atP2" id="atP2">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
    <td> 
    <input type="text">
    <input type="text">
    </td>
  </tr>
<tr>
    <td>
      <select name="htP3" id="htP3">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
    <td>
      <select name="htP3" id="htP3">
        <option value="HTplayer1">${club1.player1}</option>
        <option value="HTplayer2">${club1.player2}</option>
        <option value="HTplayer3">${club1.player3}</option>
        <option value="HTplayer4">${club1.player4}</option>
        <option value="HTplayer5">${club1.player5}</option>
        <option value="HTplayer6">${club1.player6}</option>
        <option value="HTplayer7">${club1.player7}</option>
      </select>
    </td>
    <td> 
    <input type="text">
    <input type="text">
    </td>
    <td>
      <select name="atP3" id="atP3">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
    <td>
      <select name="atP3" id="atP3">
        <option value="ATplayer1">${club2.player1}</option>
        <option value="ATplayer2">${club2.player2}</option>
        <option value="ATplayer3">${club2.player3}</option>
        <option value="ATplayer4">${club2.player4}</option>
        <option value="ATplayer5">${club2.player5}</option>
        <option value="ATplayer6">${club2.player6}</option>
        <option value="ATplayer7">${club2.player7}</option>
      </select>
    </td>
    <td> 
    <input type="text">
    <input type="text">
    </td>
  </tr>
</tbody>
</table>
<br>
<br>
<table class="RF1">
<thead>
<tr>
    <td>Round 1</td>
    <td>Score</td>
    <td>Home Points</td>
    <td>Away Points</td>
  </tr>
</thead>

<tbody>
<tr>
<td>Home 2 v Away 1</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 3 v Away 2</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 1 v Away 3</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
</tbody>
</table>
<br>
<table class="RF1">
<thead>
<tr>
    <td>Round 2</td>
    <td>Score</td>
    <td>Home Points</td>
    <td>Away Points</td>
  </tr>
</thead>

<tbody>
<tr>
<td>Home 3 v Away 1</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 1 v Away 2</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 2 v Away 3</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
</tbody>
</table>
<br>
<table class="RF1">
<thead>
<tr>
    <td>Round 3</td>
    <td>Score</td>
    <td>Home Points</td>
    <td>Away Points</td>
  </tr>
</thead>

<tbody>
<tr>
<td>Home 1 v Away 1</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 2 v Away 2</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
<tr>
<td>Home 3 v Away 3</td>
<td><input type="text" required></td>
<td><input type="number" min="0" max="4" required></td>
<td><input type="number" min="0" max="4" required></td>
</tr>
</tbody>
</table>


<br>
<table class="RF1">

<thead>
<tr>
<td>Home Total</td>
<td>Away Total</td>
<tr>
</thead>
<tbody>
<tr>
<td><input type="number" name = "HTtotal" value="HTtotal" id="HTtotal" min="0" max="12" required></td>
<td><input type="number" name = "ATtotal" value="ATtotal"id="ATtotal" min="0" max="12" required></td>

</tbody>


</table>

 <input type="hidden" name="club1name" value="${club1.club}">
 <input type="hidden" name="club1played" value="${club1.played}">
 <input type="hidden" name="club1wins" value="${club1.wins}">
 <input type="hidden" name="club1losses" value="${club1.losses}">
 <input type="hidden" name="club1draws" value="${club1.draws}">
 <input type="hidden" name="club1points" value="${club1.points}">
 

 <input type="hidden" name="club2name" value="${club2.club}">
 <input type="hidden" name="club2played" value="${club2.played}">
 <input type="hidden" name="club2wins" value="${club2.wins}">
 <input type="hidden" name="club2losses" value="${club2.losses}">
 <input type="hidden" name="club2draws" value="${club2.draws}">
 <input type="hidden" name="club2points" value="${club2.points}">

<button type="submit">Add Result</button>




</form>

</body>
</html>
