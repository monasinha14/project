<%@ include file="header.jsp" %>

<table border="1" align="center">
<h1 align="center">Product View</h1>
<tr>
  <th>Product ID</th>
  <th>Product Name</th>
  <th> Description</th>
  <th>Product Price</th>
  <th> Quantity</th>
  <th>Edit</th>
  <th>Delete</th>
</tr>


  <c:forEach var="product" items="${productList}">
  <tr>
  <td>${product.prodId}</td>
<td>${product.prodName}</td>
<td>${product.prodDescp}</td>
<td>${product.prodCategory}</td>
<td>${product.prodPrice}</td>
 <td><a href="addProduct">Add</a></td>
 <td> <a href="editProduct/${product.prodId}">Edit</a>|<a href="delete_product/${product.prodId}">Delete</a>
  </td>
  </tr>
  </c:forEach>

</table>

 

</body>
</html>