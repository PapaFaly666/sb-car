let getfirstname = document.getElementById("getfirstname");
function affichage_owner(){
    let url = "http://localhost:8080/api/owners";
    fetch(url).then(response =>
        response.json()
        .then(data => {
            console.log(data.firstname);
        })
        )
}

function ok(){
    alert("ok");
}