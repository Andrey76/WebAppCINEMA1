<%--

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
    <link href="Log.css" rel = "stylesheet" type="text/css">
</head>
<body>
<form class="pos", method="post", action=""${pageContext.servletContext.contextPath}/login">
    <div class="form-group">
        <label for="login">Login:</label>
        <input type="login" name="login" class="form-control" id="login" placeholder="login">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" name="password" class="form-control" id="password" placeholder="password">
    </div>
    <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
    <button type="submit" class="btn btn-default">Submit</button>
    </div>

</form>
</body>
</html>
