<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 12/9/21
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="WEB-INF/partials/head.jsp"%>
    <title>Home</title>
</head>
<body>
    <%@ include file="WEB-INF/partials/navbar.jsp"%>
    <div class="w-100">
        <img src="https://images.unsplash.com/photo-1567306295427-94503f8300d7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZmFybWVycyUyMG1hcmtldHxlbnwwfHwwfHw%3D&w=1000&q=80" class="img-fluid" style="margin-left: 19%" alt="Farmers Market">
    </div>

    <form class="form-inline d-flex mx-auto">
        <input class="form-control mx-auto" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>

</body>
</html>
