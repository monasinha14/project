<%@ include file="header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>  
       <c:url var="edit" value="/updateProduct"></c:url>
       <form:form  action="${edit}" commandName="product" method="POST">    
        <table  >    
         <tr>    
          <td>product Id : </td>   
          <td><form:input path="prodId" disabled="disabled" /></td>  
         </tr>    
         <tr>    
          <td>Product Name :</td>    
          <td><form:input path="prodName" /></td>   
         </tr>   
         <tr>    
          <td>Product Description :</td>    
         <td><form:input path="prodDescp" /></td>   
         </tr>   
         <tr>    
         <tr>    
          <td>Product Price :</td>    
         <td><form:input path="prodPrice" /></td>   
         </tr>   
         <tr>
         <tr>    
          <td>Product Category :</td>    
        <td><form:input path="prodCategory" /></td>     
         </tr>   
         <tr>
          <td> </td>    
          <td><input type="submit" value="Update" /></td>    
         </tr>    
        </table>    
       </form:form>

</body>
</html>