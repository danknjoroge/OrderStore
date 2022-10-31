function registerValidation() {
    let fname = document.getElementById("fname").value;
    let lname = document.getElementById("lname").value;
    let email = document.getElementById("email").value;
    let pass = document.getElementById("pass").value;
    let re_pass = document.getElementById("re_pass").value;
    let contact = document.getElementById("contact").value;

    if (fname == "") {
        document.getElementById("fn").innerHTML += "Firstname Required";
    }else if(lname==""){
        document.getElementById("ln").innerHTML += "Lastname Required";
    }else if(email==""){
        document.getElementById("em").innerHTML += "Email Required";
    }else if(pass==""){
        document.getElementById("ps").innerHTML += "Password Required";
    }else if(re_pass==""){
        document.getElementById("rps").innerHTML += "Confirm Password Required";
    }else if(contact==""){
        document.getElementById("con").innerHTML += "Contact Required";
    }

    if (pass != re_pass) {
        alert("Password does not match! Enter a matching password!");
    }
    
}

function loginValidation() {
    let email = document.getElementById("email").value;
    let pass = document.getElementById("password").value;
    if (email == "") {
        document.getElementById("em").innerHTML += "Email Required";
    } else if (pass == "") {
        document.getElementById("ps").innerHTML += "Password Required";

    } 
}
