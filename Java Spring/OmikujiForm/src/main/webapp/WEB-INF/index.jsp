<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Omikuji</title>
</head>
<body>
   <h1>Send an Omikuji!</h1>
<!--   ...   -->
    
    <form action="/login" method="post">
     <label>Pick a number between 5 and 25: <input type="number" name="number"> </label>
   <label>Enter a name of a City: <input type="text" name="city"> </label>
        	<br><br>
        <label>Enter a name of a real Person: <input type="text" name="person">  </label><br><br>
         <label>Enter professional endeover or hobby: <input type="text" name="hobby"> </label><br><br>
          <label>Enter any type of living thing: <input type="text" name="thing"> </label><br><br>
          <label>Say something nice to someone: <input type="text" name="nice"> </label><br><br>
        <h3>Send and show a friend</h3><br><br>
        <input type="submit" value="Send">
    </form>
     
<!--   ...   -->


</body>
</html>
