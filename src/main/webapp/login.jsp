<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: damionbrown
  Date: 12/19/17
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:if test="${param.username.equalsIgnoreCase('admin') && param.password.equalsIgnoreCase('password')}">
<%--//if admin is typed and password is typed run the following code:--%>
    <%response.sendRedirect("profile.jsp?username=" + request.getParameter("username"));%>


</c:if>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please login"/>
    </jsp:include>
</head>
<body>
<form method="POST" action="/login.jsp">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>




</body>
</html>
