<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>New Ninja</title>
</head>
<body>
      <h1>New Ninja</h1>
      <form:form action="/createninja" method="post" modelAttribute="ninja">
          <div class="form-group">
              <label>Dojo</label>

              <br>
              <form:select path="dojo" class="form-control">
                  <c:forEach var="dojo" items="${alldojos}">
                      <option value="${dojo.id}">${dojo.name}</option>
                  </c:forEach>

              </form:select>

          </div>
          <div class="form-group">
              <label>First Name</label>
              <form:input path="firstName"  type="text" class="form-control"/>
              <br>
              <form:errors path="firstName"/>
          </div


          <div class="form-group">
              <label>Last Name</label>
              <form:input path="lastName"  type="text" class="form-control"/>
              <br>
              <form:errors path="lastName"/>
          </div

          <br>
          <div class="form-group">
              <label>Age</label>
              <form:input path="age"  type="number" class="form-control"/>

              <br>
              <form:errors path="age"/>

          </div>
          <button type="submit" class="btn btn-primary">Create</button>
      </form:form>
</body>
</html>
