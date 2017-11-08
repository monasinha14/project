<%@ include file="header.jsp" %>
<head>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New category</title>
</head>
<body>
<h1>Add category</h1>  
       <form:form  action="savecategory" commandName="category" method="post">    
        <table align="center" >    
          
         <tr>    
          <td>Category Description :</td>    
          <td><input type="text" name="catDescp"></td>   
         </tr>   
         <tr>    
          <td>Category Name :</td>    
         <td><input type="text" name="catName"></td>   
        <tr>    
        <tr>
          <td> </td>    
          <td><input type="submit" value="Add" /></td>    
         </tr>
        </table>    
       </form:form>

</body>
</html>
