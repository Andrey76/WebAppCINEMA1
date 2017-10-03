<%--
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andr_
  Date: 06.07.2017
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Generic Page - Massively by HTML5 UP</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="../assets/css/main.css" />
    <noscript><link rel="stylesheet" href="../assets/css/noscript.css" /></noscript>
</head>
<body class="is-loading">
<!-- Wrapper -->
<div id="wrapper">

    <!-- Header -->
    <header id="header">
        <a href="<c:url value="/start"/>" class="logo">Kinoworld</a>
    </header>

    <!-- Nav -->
    <nav id="nav">
        <ul class="links">
            <li><a href="<c:url value="/start"/>">Kinoworld</a></li>
        </ul>
        <ul class="icons">
            <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
            <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
            <li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
            <li><a href="#" class="icon fa-github"><span class="label">GitHub</span></a></li>
        </ul>
    </nav>

    <!-- Main -->
    <!-- Footer -->
    <%--<form name="Login", action="/login" METHOD="post"/>--%>

    <form method="post" action="/addMovie">
        <footer id="footer">
            <section>
                <div class="field">
                    <label for="AddMovieName">Title</label>
                    <input type="text"
                           name="movie_title"
                           id="AddMovieName"
                           placeholder="AddMovieName">
                </div>
                <div class="field">
                    <label for="description">Description</label>
                    <input type="text"
                           name="description"
                           id="description"
                           placeholder="Description">

                </div>
                <div class="field">
                    <label for="duration">Duration</label>
                    <input type="text"
                           name="duration"
                           id="duration"
                           placeholder="Duration">
                </div>
                <div class="field">
                    <label for="rent_start">rentStart</label>
                    <input type="text"
                           name="rent_start"
                           id="rent_start"
                           placeholder="Rent_start">
                </div>
                <div class="field">
                    <label for="rent_end">rentEnd</label>
                    <input type="text"
                           name="rent_end"
                           id="rent_end"
                           placeholder="Rent_End">
                </div>
                <div class="field">
                    <label for="genre">Genre</label>
                    <input type="text"
                           name="genre"
                           id="genre"
                           placeholder="Genre">
                </div>
                <div class="field">
                    <label for="rating">Rating</label>
                    <input type="text"
                           name="rating"
                           id="rating"
                           placeholder="Rating">
                </div>
                <div class="field">
                    <label for="pict_url">PictureUrl</label>
                    <input type="text"
                           name="pict_url"
                           id="pict_url"
                           placeholder="pict_url">
                </div>
                <div class="field">
                    <label for="treiler_url">PictureUrl</label>
                    <input type="text"
                           name="treiler_url"
                           id="treiler_url"
                           placeholder="treiler_url">
                </div>
                <ul class="actions">
                    <li><input type="submit" value="Submit" /></li>
                </ul>
            </section>
        </footer>
    </form>
    <!-- Copyright -->
    <div id="copyright">
        <ul><li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li></ul>
    </div>



    <!-- Scripts -->
    <script src="../assets/js/jquery.min.js"></script>
    <script src="../assets/js/jquery.scrollex.min.js"></script>
    <script src="../assets/js/jquery.scrolly.min.js"></script>

    <script src="../assets/js/skel.min.js"></script>
    <script src="../assets/js/util.js"></script>
    <script src="../assets/js/main.js"></script>
    </section>
</div>
</footer>
</body>
</html>
