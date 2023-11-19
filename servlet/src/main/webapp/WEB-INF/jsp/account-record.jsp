<%@ page import="org.example.model.Account" %>
<html>
<head>
    <title>Account Record</title>
</head>
<body>
<%
    if (request.getAttribute("accountRecord") != null) {
        Account account = (Account) request.getAttribute("accountRecord");
%>

<h1>Account Record</h1>
<div>ID: <%= account.getId()%></div>
<div>First Name: <%= account.getFirstName()%></div>
<div>Last Name: <%= account.getLastName()%></div>

<%
} else {
%>

<h1>No Account record found.</h1>

<% } %>
</body>
</html>