<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Burger</title>
  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
  <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>Burger Tracker</h1>
<table>
  <tr>
    <th>Burger Name</th>
    <th>Restaurant Name</th>
    <th>Rating (out of 5)</th>
  </tr>
  <c:forEach var="i" items="${allburgers}">
    <tr>
      <th><c:out value="${i.burgerName}"></c:out></th>
      <th><c:out value="${i.restaurantName}"></c:out></th>
      <th><c:out value="${i.rating}"></c:out></th>
    </tr>
  </c:forEach>
</table>

<form:form action="/createburger" method="post" modelAttribute="burger">
  <div class="form-group">
    <label>Burger Name</label>
    <form:input path="burgerName" type="text" class="form-control"/>
    <br>
    <form:errors path="burgerName"/>
  </div>
  <div class="form-group">
    <label>Restaurant Name</label>
    <form:input path="restaurantName" type="text" class="form-control"/>
    <br>
    <form:errors path="restaurantName"/>
  </div>
  <div class="form-group">
    <label>Rating</label>
    <form:select path="rating" class="form-control">
      <option value="1">0</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
    </form:select>
    <br>
    <form:errors path="rating"/>

  </div>
  <div class="form-group">
    <label>Note</label>
    <form:textarea path="notes" class="form-control"></form:textarea>
    <br>
    <form:errors path="notes"/>
  </div>
  <br>
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>

