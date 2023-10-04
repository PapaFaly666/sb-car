let brand = document.getElementById("brand");
let model = document.getElementById("model");
let color = document.getElementById("color");
let registreNumber = document.getElementById("registreNumber");
let year = document.getElementById("year");
let price = document.getElementById("price");
let firstname = document.getElementById("firstname");
let lastname = document.getElementById("lastname");


function sendDataToAPiCar(){
    let url = "http://localhost:8080/api/cars/addCar";
    fetch(url, {
        method: "POST",
        body: JSON.stringify({
            brand: brand.value,
            model: model.value,
            color: color.value,
            registerNumber: registreNumber.value,
            year: year.value,
            price: price.value,
        }),
        headers : {
            "Content-type" : "application/json; charsert=UTF-8",
        },
    }).then(response => response.json()
    .then(data => {
        console.log(data);
    })
    )

    brand.value = "";
    model.value = "";
    color.value = "";
    registreNumber.value = "";
    year.value = "";
    price.value = "";
}

function sendDataToAPiOwner(){
    let url = "http://localhost:8080/api/owners/addOwner";
    fetch(url, {
        method: "POST",
        body: JSON.stringify({
            firstname: firstname.value,
            lastname: lastname.value,
        }),
        headers: {
            "Content-Type" : "application/json; charsert=UTF-8",
        },
    }).then(response => response.json()
        .then(data => {
            console.log(data);
            
        })
    )
        firstname.value = "";
        lastname.value = "";
    
}

function validate() {
    const requiredFields = document.querySelectorAll('input[required]');

    for (const field of requiredFields) {
        if (!field.value.trim()) {
            return false;
        }
    }
    
    return true;
}

var car = document.getElementById("CarForm");
console.log(car);
document.getElementById("CarForm").addEventListener("submit", function(event){
    event.preventDefault();

    if (validate()){
        sendDataToAPiCar();
    }
})


document.getElementById("ownerForm").addEventListener("submit", function(event){
    event.preventDefault();

    if (validate()){
        sendDataToAPiOwner();
    }
})

