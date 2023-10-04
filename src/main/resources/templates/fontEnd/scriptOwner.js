let firstname = document.getElementById("firstname");
let lastname = document.getElementById("lastname");
let getfirstname = document.getElementById("getfirstname");

function ok(){
    alert("ok");
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
            getfirstname.innerHTML = data.firstname;
            
        })
    )
        firstname.value = "";
        lastname.value = "";
    
}

function validate_owner() {
    const requiredFields = document.querySelectorAll('input[required]');

    for (const field of requiredFields) {
        if (!field.value.trim()) {
            return false;
        }
    }
    
    return true;
}

document.getElementById("ownerForm").addEventListener("submit", function(event){
    event.preventDefault();

    if (validate_owner()){
        sendDataToAPiOwner();
    }
})


function affichage_owner(){
    let url = "http://localhost:8080/api/owners";
    fetch(url).then(response =>
        response.json()
        .then(data => {
            var firstnameOnly = data.map(function(personne){
                getfirstname.innerHTML = personne.firstname;
            })
            console.log(firstnameOnly);
        })
        )
}
