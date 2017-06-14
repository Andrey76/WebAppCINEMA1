<%--
  Created by IntelliJ IDEA.
  User: andr_
  Date: 29.05.2017
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form name = "StartPage" method="post" action="${pageContext.servletContext.contextPath}/start">
    <div id="header">
        <div id="nav"><a href="loginform.jsp">Login</a> | <a href="registrationform.jsp">Registration</a></div>
        <div id="bg"></div>
    </div>


<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <!--Sidebar content-->
        </div>
        <div class="span10">
            <!--Body content-->
        </div>
    </div>
</div>
<p><b>Note:</b> If a !DOCTYPE is not specified, floating items can produce unexpected results.</p>
<p>A background color is added to the links to show the link area. The whole link area is clickable, not just the text.</p>
<p><b>Note:</b> overflow:hidden is added to the ul element to prevent li elements from going outside of the list.</p>
</form>
</body>
</html>

</body>
</html>
