<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register page </title>
<style >body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
        }
        
</style>
</head>
<body>
<form action="registerform" method = "post">


<label for = "name"> Enter your  Name - </label>
<input type = "text" id = "name" name = "name">
<br><br>
<label for = "username"> Enter your  Username - </label>
<input type = "text" id = "username" name = "username">
<br><br>
<label for = "pass"> Enter your  Password - </label>
<input type = "password" id = "pass" name = "pass">
<br><br>
<label for = "repass"> Enter  ReEnter Password - </label>
<input type = "password" id = "repass" name = "repass">
<br><br>
<button> submit </button>

</form>
</body>
</html>