let tableBody = document.getElementsByClassName('divTableBody')[0];

let firstNameInput = document.getElementById('fname');
let lastNameInput = document.getElementById('lname');
let ageInput = document.getElementById('age');
let companyInput = document.getElementById('company');
let usernameInput = document.getElementById('username');
let emailInput = document.getElementById('email');
let adressInput = document.getElementById('adress');
let cityInput = document.getElementById('city');
let postalCodeInput = document.getElementById('pstcode');
let countryInput = document.getElementById('country');

function enterData(){

    firstName = firstNameInput.value;
    lastName = lastNameInput.value;
    age = ageInput.value;
    company = companyInput.value;
    username = usernameInput.value;
    email = emailInput.value;
    adress = adressInput.value;
    city = cityInput.value;
    postalCode = postalCodeInput.value;
    country = countryInput.value;

    let newDivTableRow = `<div class="divTableRow">
                        <div class="divTableCell">${firstName}</div>
                        <div class="divTableCell">${lastName}</div>
                        <div class="divTableCell">${age}</div>
                        <div class="divTableCell">${company}</div>
                        <div class="divTableCell">${username}</div>
                        <div class="divTableCell">${email}</div>
                        <div class="divTableCell">${adress}</div>
                        <div class="divTableCell">${city}</div>
                        <div class="divTableCell">${postalCode}</div>
                        <div class="divTableCell">${country}</div>
                    </div>`;


 
    if(!firstName || !lastName || !email){
        firstNameInput.style.backgroundColor = 'Tomato'
        lastNameInput.style.backgroundColor = 'Tomato'
        emailInput.style.backgroundColor = 'Tomato'
        alert('Please fill in all the required fields: \n \n First name, Surname, Email')
        
    } else{
        tableBody.innerHTML += newDivTableRow;

    }


}


function deleteRow(){

    if (tableBody.childElementCount >2) {

        tableBody.removeChild(tableBody.lastChild);
        
    }
}


