var baseurl = "http://localhost:8080/inventory";

function updateRow(id){

  var xmlhttp = new XMLHttpRequest();
  xmlhttp.open("GET",baseurl + "",true);

  xmlhttp.onreadystatechange = function() {

    if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
      var inventory = JSON.parse(xmlhttp.responseText);
      console.log(inventory);
      let brand = inventory[id].brand;
      let model = inventory[id].model;
      let price = inventory[id].price;

      var tbltop = "";

      //main table content we fill from data from the rest call
      var main ="<h1>Update Data:</h1>";
      // for (i = 0; i < inventory.length; i++){
        main +=

             "<form>" +
            "<div>"+
               "<span style='display:inline-block'>"+
                    "<label for=brand style='display:block'>Brand:</label>"+
                   " <input type=text name=brandid=brand placeholder='Brand' required value="+ brand +" onChange={dataUpdate()}/>"+
               "</span>"+
                
                "<span style='display:inline-block'>"+
                   "<label for=model style='display:block'>Model:</label>"+
                    "<input type=text name=model id=model placeholder='Model' required  value="+ model +" onChange={dataUpdate()}/>"+
                "</span>"+
                "<span style='display:inline-block'>"+
                    "<label for=price style='display:block'>Price:</label>"+
                    "<input type=text name=price id=price placeholder='Price' required value="+ price +" onChange={dataUpdate()}/>"+
                "</span>"+
          "</div>"+
          "</form>";


      var tblbottom = "<div><button id='saveData' onclick='saveData("+ id, brand, model, price +')>Save</button></div>";
      var tbl = tbltop + main + tblbottom;
      document.getElementsByClassName('updateRow')[0].innerHTML += tbl;
    }
  };
  xmlhttp.send();

}


function saveData(itemNr, brand, model, price){

  fetch('http://localhost:8080/inventory/'+itemNr, {
    method: 'POST',
    headers: {
      'content-type': 'application/json'
    },
    body: {
      id: itemNr,
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
