<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Products and Categories</title>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <h1 style="text-align: center;">Home Page</h1>
  <div style="display: flex; justify-content: space-between;">
    <div>
      <h1>Welcome, <c:out value="${currentUser.userName}"/> !</h1>
      <h4><a href="/products/new">Add a Product</a></h4>
      <h4><a href="/categories/new">Add a Category</a></h4>
    </div>
    <div>
      <h4><a href="/logout">logout</a></h4>

    </div>
  </div>

<div style="text-align: center; display: flex; justify-content: space-evenly; align-items: center; font-size: x-large;">
    <table>
      <tr>
        <th>Products</th>
      </tr>
        <c:forEach var="product" items="${products}">
      <tr>
        <td><a href="/products/${product.id}"><c:out value="${product.name}"/></a></td>
      </tr>
      </c:forEach>
    </table>
  <table>
    <tr>
      <th>Categories</th>
    </tr>
    <c:forEach var="category" items="${categories}">
      <tr>
        <td><a href="/categories/${category.id}"><c:out value="${category.name}"/></a></td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>