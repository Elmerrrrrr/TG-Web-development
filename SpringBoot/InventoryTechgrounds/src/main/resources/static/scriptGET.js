

var baseurl = "http://localhost:8080/inventory";

function loadInventory(){

  var xmlhttp = new XMLHttpRequest();
  xmlhttp.open("GET",baseurl + "",true);

  xmlhttp.onreadystatechange = function() {

    if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
      var inventory = JSON.parse(xmlhttp.responseText);
      console.log(inventory);
      var tbltop = "";

      var main ="";
      for (i = 0; i < inventory.length; i++){
        main +=

        "<div class='divTableRow'><div class='divTableCell'>"+ inventory[i].brand+ "</div><div class='divTableCell'>"+ inventory[i].model + "</div><div class='divTableCell'>"+ inventory[i].price + "</div><div class='divTableCell'><button id='updateData' onclick='updateRow("+[i]+")'>Update Data</button><button id='deleteData' onclick='deleteRow()'>Delete Data</button><button id='viewData' onclick='viewRow()'>View</button></div></div>";

      }
      var tblbottom = "";
      var tbl = tbltop + main + tblbottom;
      document.getElementsByClassName('divTableBody')[0].innerHTML += tbl;
    }
  };
  xmlhttp.send();
}
window.onload = function(){
  loadInventory();
}
