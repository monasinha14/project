<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>  
       <form:form  action="updateProduct" commandName="product" method="post">    
        <table  >    
         <tr>    
          <td>product Id : </td>   
          <td><input type="text" value="${product.prodId }" disabled="disabled"></td>  
         </tr>    
         <tr>    
          <td>Product Name :</td>    
          <td><input type="text" value="${product.prodName}"></td>   
         </tr>   
         <tr>    
          <td>Product Description :</td>    
         <td><input type="text" value="${product.prodDescp}"></td>   
         </tr>   
         <tr>    
         <tr>    
          <td>Product Price :</td>    
         <td><input type="text" value="${product.prodPrice}"></td>   
         </tr>   
         <tr>
         <tr>    
          <td>Product Category :</td>    
        <td><input type="text" value="${product.prodCategory}"></td>     
         </tr>   
         <tr>
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr>    
        </table>    
       </form:form>

</body>
</html>