<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h1>Add New Product</h1>  
       <form:form method="post" action="saveProduct" commandName="product">    
        <table  align="center">       
         <tr>    
          <td>Product Name :</td>    
          <td><input type="text" name="prodName"></td> 
         </tr>   
         <tr>    
          <td>Product Description :</td>    
       <td><input type="text" name="prodDescp"></td>   
         </tr>   
         <tr>    
         <tr>    
          <td>Product Price :</td>    
         <td><input type="text" name="prodPrice"></td>
         </tr>   
         <tr>
         <tr>    
          <td>Product Category :</td>    
        <td><input type="text" name="prodCategory"></td>
         </tr>   
         <tr>
          <td> </td>    
          <td><input type="submit" value="Add" /></td>    
         </tr>    
        </table>    
       </form:form>
       
</body>
</html>