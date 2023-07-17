<%--
  Created by IntelliJ IDEA.
  User: yazan
  Date: 7/17/2023
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Books</title>
</head>
<body>
<h1>Hello</h1>

<table>
  <tr>
    <th>ID</th>
    <th>Title</th>
    <th>Language</th>
    <th>Description</th>
  </tr>

<c:forEach var="specificbook" items="${allbooks}">
  <tr>

    <td>Description: <c:out value="${specificbook.id}"/></td>
    <td ><c:out value="${specificbook.title}"/></td>
    <td>Language: <c:out value="${specificbook.language}"/></td>
    <td>Number of Pages: <c:out value="${specificbook.numberOfPages}"/></td>
  </tr>
</c:forEach>
</table>




</body>
</html>
