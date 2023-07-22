<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 8:22 PM
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
<div style="display: flex; justify-content: space-between;">
    <div>
        <h1><c:out value="${category.name}"/></h1>
    </div>
    <div>
        <h4><a href="/home">Home</a></h4>
    </div>
</div>
<hr>
<h1>Products:</h1>
<ul>
    <c:forEach var="product" items="${assignedProducts}">
        <li><c:out value="${product.name}"/></li>
    </c:forEach>
</ul>
<br> <br>
<hr>

<form action="/addProductToCategory/${id}" method="post">
    <label>Add Product:</label>
    <select name="productId">
        <c:forEach var="product" items="${unassignedProducts}">
            <option value="${product.id}">${product.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="Add" class="create">
</form>


</body>
</html>
