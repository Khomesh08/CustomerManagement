<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Login</title>
</head>
<body style="background-color:#ccffff">
<form action ="logCustomer" method ="post">
	<br><br><br>
<div align="center"><h1>Enter Details</h1></div>
<div align="center">
<table>
<tr>
<td align="right"> <label>Email :</label> </td>
<td><input type="email" name="tbEmail" id ="tbMail"
value ="<%=request.getParameter("tbMail") %>"/></td> 

</tr>
<tr>
<td align="right"><label>Password :</label>  </td> 
<td><input type="password" name="tbPwd" id ="tbPsd"
value ="<%=request.getParameter("tbPsd") %>"/></td>
</tr>

</table>
<br>


<div align="center"><button>Login</button></div>
</div>
</form>
</body>
</html>