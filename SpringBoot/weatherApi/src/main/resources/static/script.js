

function getWeather(){

document.getElementById('results').innerHTML="";
let baseurl = "http://localhost:3000/weather/";
let inputPlace = document.getElementById("inputPlace").value;



let xmlhttp = new XMLHttpRequest();
xmlhttp.open("GET",baseurl + inputPlace,true);

xmlhttp.onreadystatechange = function() {

  if(xmlhttp.readyState ===4 && xmlhttp.status ===200){
    let weather = JSON.parse(xmlhttp.responseText);
    console.log(weather);

    // console.log(Object.values(weather));


    let tbltop = "";

    let main ="";
    // for (let i = 0; i < weather.length; i++){
      main +=

      "Temperatuur in "+ inputPlace +" is momenteel: "+ weather.main.temp+" °C";
      
    // }
    let tblbottom = "";
    let tbl = tbltop + main + tblbottom;

    setTimeout(function(){
          document.getElementById('results').innerHTML="";
          document.getElementById('results').innerHTML += tbl;
    }, 10); 

    
    

  }
};
xmlhttp.send();
}

