<%--
  Created by IntelliJ IDEA.
  User: damionbrown
  Date: 12/19/17
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile Page"/>
    </jsp:include>

</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<h1>Hello, ${param.username}! Welcome to your profile page</h1>

</body>
</html>
