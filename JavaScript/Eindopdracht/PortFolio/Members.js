

function enterData(){

        let firstName = document.getElementById('fname').value;
        let lastName = document.getElementById('lname').value;
        let age = document.getElementById('age').value;
        let company = document.getElementById('company').value;
        let email = document.getElementById('email').value;
        let adress = document.getElementById('adress').value;
        let city = document.getElementById('city').value;
        let postalCode = document.getElementById('pstcode').value;
        let country = document.getElementById('country').value;

        if(!firstName || !lastName || !email){
            alert('Please fill in all the required fields')
        }
        // console.log(firstName);

}

console.log(.document.getElementsByClassName('divTableCell'));