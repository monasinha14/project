<%@ include file="header.jsp" %>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<table border="1" class="table">
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
<td>${product.prodPrice}</td>
<td>${product.prodCategory}</td>


 <td><a type="button" class="btn btn-warning" href="editProduct/${product.prodId}">Edit</a> 
 </td>
 <td>     <a type="button" class="btn btn-danger" href="delete_product/${product.prodId}">Delete</a>
  </td>
  </tr>
  </c:forEach>
</table>
<div align="center"><a type="button" class="btn btn-success" href="addproduct">Add Product</a>
 </div>


</body>
</html>