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
    <h1>Add a Category</h1>
  </div>
  <div>
    <h4><a href="/home">Home</a></h4>
  </div>
</div>

<form:form action="/addCategory" method="post" modelAttribute="category">
  <form:label path="name">Name:</form:label>
  <form:input path="name" type="text"/>
  <form:errors path="name"/> <br> <br>

  <input type="submit" class="create" value="Create">
</form:form>

</body>
</html>