
// datatables for each table shown on pages   
let table = new DataTable('#clubsInfo', {
    paging: false,
    searching: false,
     "language": {
            "info": "",
            "infoFiltered": "",
            "infoEmpty": ""
        }
    
});

let leagueTable = new DataTable('#leagueTable', {
	"rowCallback": function( row, data, index ) {
            $('td:eq(0)', row).html(index+1);
        },
         "language": {
            "info": "",
            "infoFiltered": "",
            "infoEmpty": ""
        },
    paging: false,
    order: [[6, 'desc']],
    searching: false,
    
});


// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
