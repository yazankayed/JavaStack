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




            <h1 ><c:out value="${specificbook.title}"/></h1>
            <h2>Description: <c:out value="${specificbook.description}"/></h2>
            <h2>Language: <c:out value="${specificbook.language}"/></h2>
            <h2>Number of Pages: <c:out value="${specificbook.numberOfPages}"/></h2>

</body>
</html>
