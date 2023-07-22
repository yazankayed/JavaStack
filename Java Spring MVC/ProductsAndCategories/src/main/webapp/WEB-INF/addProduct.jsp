<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 7:56 PM
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
      <h1>Add a Product</h1>
    </div>
    <div>
      <h4><a href="/home">Home</a></h4>
    </div>
  </div>

  <form:form action="/addProduct" method="post" modelAttribute="product">
    <form:label path="name">Name:</form:label>
    <form:input path="name" type="text"/>
    <form:errors path="name"/> <br> <br>

    <form:label path="description">Description:</form:label>
    <form:input path="description" type="text"/>
    <form:errors path="description"/> <br> <br>

    <form:label path="price">Price:</form:label>
    <form:input path="price" type="number" step="0.01"/>
    <form:errors path="price"/> <br> <br>
    

    <input type="submit" class="create" value="Create">
  </form:form>

</body>
</html>


