var baseurl = "http://localhost:8080/inventory";

function updateRow(itemNr){

  var xmlhttp = new XMLHttpRequest();
  xmlhttp.open("GET",baseurl + "",true);

  xmlhttp.onreadystatechange = function() {

    if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
      var inventory = JSON.parse(xmlhttp.responseText);
      console.log(inventory);
      var tbltop = "";

      //main table content we fill from data from the rest call
      var main ="<h1>Update Data:</h1>";
      // for (i = 0; i < inventory.length; i++){
        main +=

             "<form>" +
            "<div>"+
               "<span style='display:inline-block'>"+
                    "<label for=brand style='display:block'>Brand:</label>"+
                   " <input type=text name=brandid=brand placeholder='Brand' required value="+inventory[itemNr].brand+" onChange={dataUpdate()}/>"+
               "</span>"+
                
                "<span style='display:inline-block'>"+
                   "<label for=model style='display:block'>Model:</label>"+
                    "<input type=text name=model id=model placeholder='Model' required  value="+inventory[itemNr].model+" onChange={dataUpdate()}/>"+
                "</span>"+
                "<span style='display:inline-block'>"+
                    "<label for=price style='display:block'>Price:</label>"+
                    "<input type=text name=price id=price placeholder='Price' required value="+inventory[itemNr].price+" onChange={dataUpdate()}/>"+
                "</span>"+
          "</div>"+
          "</form>";


      var tblbottom = "<div><button id='saveData' onclick='saveRow("+[itemNr]+")'>Save</button></div>";
      var tbl = tbltop + main + tblbottom;
      document.getElementsByClassName('updateRow')[0].innerHTML += tbl;
    }
  };
  xmlhttp.send();

}


function saveRow(itemNr){

  fetch('http://localhost:8080/inventory/', {
    method: 'POST',
    headers: {
      'content-type': 'application/json'
      // ,
      // authorization: 'Bearer 123abc456def'
    },
    body: {
      id: 2,
      brand: 'Dell',
      model: "XZZ-850",
      price: 1500,
    }
  })
    .then(response => {
      console.log(response)
    })
    .catch(err => {
      console.log(err)
    })


}
