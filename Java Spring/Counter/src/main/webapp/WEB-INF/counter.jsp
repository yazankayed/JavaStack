<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Counter</title>
</head>
<body>
  <p>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a><span> <c:out value="${countToShow}"></c:out></span> times.</p>
	<p><a href="/">Test another visit?</a></p>
</body>
</html>
