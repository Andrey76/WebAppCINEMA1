<%--
  Created by IntelliJ IDEA.
  User: andr_
  Date: 13.06.2017
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="registrform.css" rel = "stylesheet" type="text/css">
</head>
<body>-
<div  class="form">
    <form id="contactform" method="post" action="${pageContext.servletContext.contextPath}/reg">
        <p class="contact"><label for="user_name">Name:</label></p>
        <input id="user_name" name="user_name" placeholder="First name" required="" tabindex="1" type="text">
        <p class="contact"><label for="user_surname">Last name:</label></p>
        <input id="user_surname" name="user_surname" placeholder="Last name" required="" tabindex="1" type="text">
        <p class="contact"><label for="user_mail">Email:</label></p>
        <input id="user_mail" name="user_mail" placeholder="example@domain.com" required="" type="email">
        <p class="contact"><label for="login">Create a username:</label></p>
        <input id="login" name="login" placeholder="login" required="" tabindex="2" type="text">
        <p class="contact"><label for="password">Create a password:</label></p>
        <input type="password" id="password" name="password" required="" type="text">
        <fieldset>
            <label>Birthday</label>
            <label class="month">
                <select class="select-style" name="BirthMonth">
                    <option value="">Month</option>
                    <option  value="01">January</option>
                    <option value="02">February</option>
                    <option value="03" >March</option>
                    <option value="04">April</option>
                    <option value="05">May</option>
                    <option value="06">June</option>
                    <option value="07">July</option>
                    <option value="08">August</option>
                    <option value="09">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12" >December</option>
                </select>
            </label>
            <label>Day<input class="birthday" maxlength="2" name="BirthDay"  placeholder="Day" required=""></label>
            <label>Year <input class="birthyear" maxlength="4" name="BirthYear" placeholder="Year" required=""></label>
        </fieldset>
        <select class="select-style gender" name="gender">
            <option value="select">i am..</option>
            <option value="m">Male</option>
            <option value="f">Female</option>
        </select><br><br>
        <input class="buttom" name="submit" id="submit" tabindex="5" value="Sign me up!" type="submit">
    </form>
</div>
</body>
</html>
