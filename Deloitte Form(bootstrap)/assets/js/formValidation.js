function submitFunction(){
    if(radioValidation() && selectValidation()){
        return true;
    }
    else{
        return false;
    }
}
function selectValidation(){
    var userCity=document.getElementById("city").value;
    if(userCity=="non"){
        document.getElementById("selectError").style.color="red";
        document.getElementById("selectError").innerHTML=" Please select a city";
        return false;
    }
    else{
        document.getElementById("radioError").innerHTML="";
        return true;
    }
 }
 function radioValidation(){
    var elements=document.getElementsByName("gender");
    var count=0;
    for(i in elements){
        if(elements[i].checked){
            count++;
        }
    }
    if(count==0){
        document.getElementById("radioError").style.color="red";
        document.getElementById("radioError").innerHTML=" Please select gender";
        return false;
    }
    else{
        document.getElementById("radioError").innerHTML="";  
        return true;  
    }
 }
 function nameValidation(){
	var userName=document.getElementById("userName1").value;
	var valpattern="^[A-Za-z]+$";
	if(!userName.match(valpattern)){
        document.getElementById("nameError").style.color="red";
        document.getElementById("nameError").innerHTML="Name shuld be in alphabets";
	}
	else{
		document.getElementById("nameError").innerHTML="";
	}
}

function mobValidation(){
var mobno=document.getElementById("mobi").value;
var pattern="^[0-9]{10}$"
if(!mobno.match(pattern)){
    document.getElementById("mobError").style.color="red";
    document.getElementById("mobError").innerHTML=" Please Enter Currect Contact No";
    return false;
}
else{
    document.getElementById("mobError").innerHTML="";
return true;
}
}
function emailValidation(){
    var userEmail=document.getElementById("email").value;
    var pattern="^[A-Za-z0-9_.]+[@]{1}[A-Za-z]+(.com|.co.in|.com)$";
    if(!userEmail.match(pattern)) {
        document.getElementById("emailError").style.color="red";
        document.getElementById("emailError").innerHTML=" Please Enter Currect Email ID";
    return false;
    }
    else{
        document.getElementById("emailError").innerHTML="";
    return true;
    }
}

function mobValidation(){
    var mobno=document.getElementById("mobi").value;
    var pattern="^[0-9]{10}$"
    if(!mobno.match(pattern)){
        document.getElementById("mobError").style.color="red";
        document.getElementById("mobError").innerHTML=" Please Enter Currect Contact No";
        return false;
    }
    else{
        document.getElementById("mobError").innerHTML="";
    return true;
    }
    }
    function pwdValidation(){
        var userpwd=document.getElementById("pwd").value;
        var pattern="^[A-Z]{1}[a-zA-Z0-9*@#%&]{6,}$";
        if(!userEmail.match(pattern)) {
            document.getElementById("pass").style.color="red";
            document.getElementById("pass").innerHTML="Atlist 8 chars And Fist Letter Capital";
        return false;
        }
        else{
            document.getElementById("pass").innerHTML="";
        return true;
        }
    }

