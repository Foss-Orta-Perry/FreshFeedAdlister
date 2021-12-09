<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Register</h1>
    <form action="/login" method="POST">

        <div class="form-group">
            <label for="firstName">First Name</label>
            <input id="firstName" name="firstName" class="form-control" type="text">
        </div>

        <div class="form-group">
            <label for="lastName">Last Name</label>
            <input id="lastName" name="lastName" class="form-control" type="text">
        </div>

        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="password">
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="email">
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <br>

        <div class="custom-file">
            <label class="custom-file-label" for="profileImage">Upload A Profile Picture</label>
            <input type="file" class="custom-file-input" id="profileImage">
        </div>
        <br>

        <div class="form-check">
            <input class="form-check-input" type="checkbox" value="true" id="isVendor">
            <label class="form-check-label" for="isVendor">
                Are You A Vendor
            </label>
        </div>

        <br>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>
</div>
</body>
</html>