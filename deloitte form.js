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
        document.getElementById("selectError").innerHTML="Please select a city";
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
        document.getElementById("radioError").innerHTML="Please select gender";
        return false;
    }
    else{
        document.getElementById("radioError").innerHTML="";  
        return true;  
    }
 }
