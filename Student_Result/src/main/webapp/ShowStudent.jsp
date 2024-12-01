<%@page import="com.swapnil.web.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	Student Data</title>
</head>
<body bgcolor="Gainsboro">

  <!-- 
  In Show Student Data-->
  <%//It is an Scriptlet Tag
   //  Student S1 =(Student)request.getAttribute("Student");
  Student S1 =(Student)session.getAttribute("Student");

     out.print(S1);
  %>
</body>
</html>