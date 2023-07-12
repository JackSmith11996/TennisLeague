function Results() {
  console.log("start");
  var club1name = document.getElementById("club1name").value;
  var club2name = document.getElementById("club2name").value;
  var club1Wins = parseInt(document.getElementById("club1wins").value);
  var club2Wins = parseInt(document.getElementById("club2wins").value);
  var club2Losses = parseInt(document.getElementById("club2losses").value);
  var club1Losses = parseInt(document.getElementById("club1losses").value);
  var club1Draws = parseInt(document.getElementById("club1draws").value);
  var club2Draws = parseInt(document.getElementById("club2draws").value);
  var club1played = parseInt(document.getElementById("club1played").value);
  var club1playedNum = club1played + 1;
  var club2played = parseInt(document.getElementById("club2played").value);
  var club2playedNum = club2played + 1;

  var HTtotalElement = parseInt(document.getElementById("HTtotal").value);
  var HTtotalValue = HTtotalElement;
  var HTtotalPoints = HTtotalValue * 2;

  var ATtotalElement = parseInt(document.getElementById("ATtotal").value);
  var ATtotalValue = ATtotalElement;  
  var ATtotalPoints = ATtotalValue *2;
 
  console.log("woop");
  
  var club1winsadd = 0;
  var club1lossadd = 0;
  var club2winsadd = 0;
  var club2lossadd = 0;
  var club1drawsadd = 0;
  var club2drawsadd = 0;

  if (!isNaN(HTtotalPoints) && !isNaN(ATtotalPoints)) {
    if(HTtotalPoints > ATtotalPoints){
      club1winsadd = club1Wins + 1;
      club2lossadd = club2Losses + 1;
    }
    else if (ATtotalPoints > HTtotalPoints){
      club2winsadd = club2Wins + 1;
      club1lossadd = club1Losses + 1;
    }
    else if (ATtotalPoints == HTtotalPoints){
      club1drawsadd = club1Draws + 1;
      club2drawsadd = club2Draws + 1;
     }
      
  console.log("still working");
  
  var data = JSON.stringify({
    club1name: club1name,
    club2name: club2name,
    club1playedNum: club1playedNum,
    club2playedNum: club2playedNum,
    club1winsadd: club1winsadd,
    club1lossadd: club1lossadd,
    club2winsadd: club2winsadd,
    club2lossadd: club2lossadd,
    club1drawsadd: club1drawsadd,
    club2drawsadd: club2drawsadd,
    HTtotalPoints: HTtotalPoints,
    ATtotalPoints: ATtotalPoints
  });

  console.log("working");

  var xhr = new XMLHttpRequest();
  xhr.open("POST", "./AddResults", true);
  xhr.setRequestHeader('Content-Type', 'application/json');
  xhr.send(data);
  xhr.onerror = function() {
  console.error("An error occurred while sending the data to the server.");
}
}}