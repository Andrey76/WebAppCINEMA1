<%--
  Created by IntelliJ IDEA.
  User: andr_
  Date: 25.05.2017
  Time: 19:37  Date: 25.05.2017

  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="Log.css" rel = "stylesheet" type="text/css">
</head>
<body>
<form class="pos">
    <div class="form-group">
        <label for="login">Login:</label>
        <input type="login" class="form-control" id="login" placeholder="login">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" id="password" placeholder="password">
    </div>
    <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
    <button type="submit" class="btn btn-default">Submit</button>
    </div>
</form>
</body>
</html>
