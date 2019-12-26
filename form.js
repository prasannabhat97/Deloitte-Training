function arraySum(){
var arr=[1,2,3,4,5,6,7,8,9];
var sum=0;
for(i in arr){
sum+=arr[i];
}
console.log(sum);
}
function sum1(){
	var a=document.getElementById("num1").value;
var b=document.getElementById("num2").value;
document.getElementById("s1").innerHTML=parseInt(a)+parseInt(b);
}
function concat(){
		var a=document.getElementById("n1").value;
var b=document.getElementById("n2").value;
document.getElementById("con").value=(a)+(" ")+(b);
}
function image(){
	document.getElementById("change").src="img2.jpg";
}
function nameValidation(){
	var userName=document.getElementById("n1").value;
	var valpattern="^[A-Za-z]+$";
	if(!userName.match(valpattern)){
        document.getElementById("errorName").innerHTML="Name shuld be in alphabets";
	}
	else{
		document.getElementById("errorName").innerHTML="";
	}
}



