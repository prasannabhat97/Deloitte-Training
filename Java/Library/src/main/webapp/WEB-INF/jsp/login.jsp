<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center>Login Form</center></h1>
${msg}
<form action=/welcome>
<center>
<label>Enter Your UserName :</label>
<input type=text name=bookId id=bookId onblur="validateName()"><span id=errorName></span><br>
<br>
<label>Enter Your Password :</label>
<input type=password name=bookName id=bookName onblur="validatePassword()"><span id=passwordError></span><br>
<br>
<input type=submit value=submit>
<input type=reset value=reset>
</center>
</form>

<script type="text/javascript">

function validateName(){
	var username=document.getElementById("bookId").value;
	var namepattern="^[0-9]+$";
	if(!username.match(namepattern)){
		 document.getElementById("errorName").innerHTML="Name shuld be in alphabets";
		}
	else{
		 document.getElementById("errorName").innerHTML="";
		}
}

function validatePassword(){
	var pwdpattern="^[a-zA-Z0-9]+$";
	var password=document.getElementById("bookName").value;
	if(!password.match(pwdpattern)){
		document.getElementById("passwordError").innerHTML="Name shuld match the pattern";
		}
	else{
		document.getElementById("passwordError").innerHTML="";
		}
}

</script>
</body>
</html>