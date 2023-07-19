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
    <title>Dojo Name</title>
</head>
<body>
                <h1>Burbank Location Ninjas</h1>
                    <table>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Age</th>

                        </tr>


                            <c:forEach var="ninja" items="${specificDojo}">
                                <tr>
                                <td>${ninja.firstName}</td>
                                <td>${ninja.lastName}</td>
                                <td>${ninja.age}</td>
                                </tr>
                            </c:forEach>


                    </table>
</body>
</html>
