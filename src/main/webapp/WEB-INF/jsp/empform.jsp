<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form to add employee</title>
</head>
<body>
	<p align="center">${message}</p>
    <form id="form1" action="addEmp.html" method="post" modelAttribute="emp">
    <div>                
    </div>      
    <h2 align="center"> Enter employee details:</h2><hr>  
    <table id="table1"; cellspacing="5px" cellpadding="5%"; align="center">  
       <tr>  
              <td  align="right" class="style1">Username:</td>  
              <td class="style1"><input type="text" name="username" /></td>  
       </tr>  
       <tr>  
              <td  align="right" class="style1">Password:</td>  
              <td class="style1"><input type="password" name="password" /></td>  
       </tr>  
       <tr>  
              <td align="right">Full Name:</td>  
              <td><input type="text" name="fullName" /></td>  
       </tr>  
       <tr>  
              <td align="right">Email:</td>  
              <td><input type="text" name="email" /></td>  
       </tr>  
       <tr>  
              <td align="right">Date of Birth:</td>  
              <td><input type="text" name="dob" /></td>  
       </tr>  
       <tr>  
              <td valign="top" align="right">Gender:</td>  
              <td><input type="text" name="gender" /></td>  
       </tr>
       <tr>  
              <td valign="top" align="right">Security Question:</td>  
              <td><input type="text" name="secQuestion" /></td>  
       </tr>    
         
       <tr>  
              <td align="right">Answer:</td>  
              <td><input type="text" name="secAnswer" /></td>  
       </tr></br>  
              
        <tr>  
        <td> <input type="submit" value="Submit" align="right"/>  
        <td> <input type="reset" value="Reset" />         
        </td>  
        </tr>  
</table>   
    </form>  
</body>  

</html>