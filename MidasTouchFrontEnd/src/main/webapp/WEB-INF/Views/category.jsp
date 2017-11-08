<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
<h1 align="center">View Category</h1>
<tr>
  <th>Category ID</th>
  <th>Category Name</th>
  <th> Category Description</th>
  <th>Edit</th>
  <th>Delete</th>
</tr>


  <c:forEach var="category" items="${categoryList}">
  <tr>
  <td>${category.catId}</td>
<td>${category.catName}</td>
<td>${category.catDescp}</td>
  <td><a href="addCategory">Add</a></td>
  <td><a href="delete_category/${category.catId}">Delete</a></td>
  </tr>
  </c:forEach>

</table>

</body>
</html>