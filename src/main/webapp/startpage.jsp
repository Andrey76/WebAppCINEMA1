<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Title</title>
    <link href="startp.css" rel = "stylesheet" type="text/css">
</head>
<body>
<form name="startpage", method="post", action="${pageContext.servletContext.contextPath}/start" >
<div class="headbar">
    <div class="innerheadbar">
        <button class="logreg", name="login">Login</button> |  <button class="logreg", name="registration">Registration</button>



         <c:if test="${sessionScope.user.getRole().getRoleCode() == 0}">
                    <button class="logreg">Admin Action</button>
                </c:if>


<%--<c:if test="${not empty pageContext.request.userPrincipal}">
    <c:if test="${pageContext.request.isUserInRole('ADMIN')}">
        <button class="logreg">Admin Action</button>
    </c:if>
</c:if>--%>
    </div>
</div>
<div class="wrapper">
    <div class="container row">
        <div class="sidebar">
            <div class="innersidebar">Сайдбаh</div>
        </div>

        <div class="maincontent">
            <div class="innercontent">Контент
                <div class = "premTitle">Горячая премьера этой недели!</div>
                <div class="imagepos">
                    <img src="images/${pict}" alt="Pirates of the caribian" style="width:70%;height:70%;">
                </div>
                <div class="titlepos">${film}</div>
            </div>
        </div>

        <div class="sidebar2">
            <div class="innersidebar2">Сайдбаh</div>
        </div>
    </div>
    <div class="footer">
        <div class="innerfooter">Фут</div>
    </div>
</div>
</form>
</body>
</html>
