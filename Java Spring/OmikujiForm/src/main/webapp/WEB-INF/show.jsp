<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Omikuji</title>
</head>
<body>
   <h1>Here's Your Omikuji!</h1>
   <h1>In <c:out value="${number}"></c:out> years, you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your roommate, <c:out value="${hobby}"></c:out> for a living.<br>
   The next time you see a <c:out value="${thing}"></c:out>, you will have good luck.<br>Also, 
   <c:out value="${nice}"></c:out>
   </h1>

</body>
</html>
