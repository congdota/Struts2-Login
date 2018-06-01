<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<html>
<head>
<title>User Info</title>
</head>
  
<body>
    <h2>Hello, ${loginedUsername}...!</h2>
    <p><a href='<s:url action="edit" />' >Edit your information</a></p>
    
</body>
</html>