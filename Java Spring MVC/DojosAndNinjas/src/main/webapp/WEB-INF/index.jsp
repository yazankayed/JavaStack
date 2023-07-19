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
    <title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<form:form action="/createdojo" method="post" modelAttribute="dojo">
    <div class="form-group">
        <label>Name</label>
        <form:input path="name" type="text" class="form-control"/>
        <br>
        <form:errors path="name"/>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>
