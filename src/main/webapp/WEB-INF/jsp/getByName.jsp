<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get employee by name</title>
</head>
<body>
    <form id="form2" action="showByName.html" method="post">
    <div>                
    </div>
    <p>${message}</p>      
    <h2 align="center"> Enter employee name:</h2><hr>  
    <table id="table1"; cellspacing="5px" cellpadding="5%"; align="center">  
       <tr>  
              <td  align="right" class="style1">Employee Name:</td>  
              <td class="style1"><input type="text" name="fullName" /></td>  
       </tr>  
        <tr>  
        <td> <input type="submit" value="Submit" align="right"/>  
        <td> <input type="reset" value="Reset" />         
        </td>  
        </tr>  
</table>   
    </form>  
</body>  

</html>