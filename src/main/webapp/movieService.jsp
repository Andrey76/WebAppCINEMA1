<%--
  Created by IntelliJ IDEA.
  User: andr_
  Date: 12.06.2017
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="Reg.css" rel = "stylesheet" type="text/css">++++++++++++
<head class="control-group">
    <title class="control-group">Registration</title>
</head>
<body>
<p style="color:#080808 ">Registration:</p>
<div class="control-group">
    <form name="RegistrationForm" method="post" action="/movser"
          class="form-inline; vertical-align: html-editor-align-center">
        <div class="control-group">
            <label class="control-label" for = "AddMovieName">AddMovie:</label>
            <div class="controls">
                <input type="text" size="" id="AddMovieName" name = "movie_title" placeholder="AddMovieName">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for = "Description">Decription</label>
                <textarea name="description",  id="description" required autofocus  cols="100"></textarea>
        </div>
        <div class="control-group">
            <label class="control-label" for = "Duration">Duration</label>
            <div class="controls">
                <input type="text" id="duration" name="duration" placeholder="Duration">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for = "RentStart">RentStart</label>
            <div class="controls">
                <input type="text" id="rentStart" name = "rent_start" placeholder="rent_start">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for = "RentEnd">RentEnd</label>
            <div class="controls">
                <input type="text" id="rentEnd" name = "rent_end" placeholder="rent_end">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for = "genre">Genre</label>
            <div class="controls">
                <input type="text" id="genre" name = "genre" placeholder="genre">
            </div>
        </div>
        <div class="control-group">
            <label class="control-label" for = "rating">Rating</label>
            <div class="controls">
                <input type="text" id="rating" name = "rating" placeholder="rating">
            </div>
        </div>
        <div class="button">
        <a href="/movser"> <input type="submit" value="Submit"></input></a>>
        </div>
    </form>
</div>
</body>
</html>
