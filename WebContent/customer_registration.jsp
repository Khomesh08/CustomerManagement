<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<body style="Background-color:#ccffff">

<form action="regCustomer" method ="post"><br><br><br>
<br>


<div align="center"><h1>SIGN UP PAGE</h1></div>
<div align="center">
<table>

<tr>
<td>  Name : </td>
<td align="right"><input type="text" name="tbName" placeholder ="Enter Your  Name"/></td>
</tr>
<tr>
<td> Email : </td>
<td align="right"><input type="email" name="tbMail" placeholder ="Enter Your  Email"/></td> 
</tr>
<tr>
<td> Mobile : </td>
<td align="right"><input type="tel" name="tbTel" placeholder ="Enter Your Number"/></td>
</tr>
<tr>
<td> State : </td>
<td align="right"><select name ="ddlStates">
				<option >--Select--</option>
				<option value="Maharastra">MH</option>
				<option value="Karnataka">KR</option>
				<option value="Tamil Nadu">TN</option>
				<option value="Telgana">TL</option>
				<option value="Delhi">DL</option>
				<option value="Uttarkand">UK</option>
				<option value="Uttar Pradesh">UP</option>
				<option value="Gujarat">GJ</option>
				</select></td>
</tr>
<tr>
<td> Password : </td>
<td align="right"><input type="password" name="tbPsd" placeholder ="Enter Your  Password"/></td>
</tr>
<tr>
<td align="right"> <button>Sign Up</button></td>
</tr>
</table>
</div>


</form>

</body>
</html>