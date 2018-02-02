<%--@elvariable id="pict" type=""--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<!--
	Massively by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Kinoworld</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-loading">

		<!-- Wrapper -->
			<div id="wrapper" class="fade-in">

				<!-- Intro -->
					<div id="intro">
						<h1>Добро пожаловать на  <br />
							Kinoworld</h1>

						<p>Смотрите лучшие новинки кино в сети кинотеатров Kinoworld!</p>
						<ul class="actions">
							<li><a href="#header" class="button icon solo fa-arrow-down scrolly">Continue</a></li>
						</ul>
					</div>

				<!-- Header -->
					<header id="header">
						<a href="<c:url value="/start"/>" class="logo">Kinoworld</a>
					</header>

				<!-- Nav -->
					<nav id="nav">
						<ul class="links">
							<li class="active"><a href="<c:url value="/start"/>" c+lass="brand">Kinoworld</a></li>
							<li><a href="<c:url value="/login"/>">Login</a></li>
							<li><a href="<c:url value="/reg"/>">Registration</a></li>
						</ul>
						<ul class="icons">
							<li><a href="https://www.twitter.com/" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="https://www.facebook.com/" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="https://www.instagram.com" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
						</ul>
					</nav>

				<!-- Main -->
					<div id="main">

						<!-- Featured Post -->
							<article class="post featured">
								<header class="major">
									<h3 style="margin: 0;padding: 0;color: #dd1144">Премьера недели!</h3>
									<p><a href="/moviePage?id=${id}"/>${film}</p>
								</header>
								<a href="/moviePage?id=${id}" class="image main"><img src="${pict}" alt="" style="height: 10%;width: 50%; margin-left: 25%"/></a>
								<ul class="actions">
									<li><a href="#" class="button big">Купить билет</a></li>
								</ul>
							</article>

						<!-- Posts -->
							<section class="posts">
								<c:forEach items="${movies}" var="item">
									<c:if test = "${items != movies[0]}">
									<article>
										<header>
											<span class="date" pattern = ("dd-mm-yyyy") >Начало проката с ${item.rent_start}</span>
											<h2><a href="/moviePage?id=${item.id}">${item.title}</a></h2>
										</header>
										<a href="/moviePage?id=${item.id}" class="image fit"><img src="${item.pict_url}" alt="" style="height: 500px; width: 400px%" /></a>
										<p style="font-size:70%"></p>
										<ul class="actions">
											<li><a href="#" class="button" style="position: static">Buy a ticket</a></li>
										</ul>
									</article>
									</c:if>
								</c:forEach>
							</section>
					</div>
				<!-- Footer -->
				<!-- Copyright -->
					<div id="copyright">
						<ul><li>&copy; Untitled</li><li>Design: <a href="https://html5up.net">HTML5 UP</a></li></ul>
					</div>
			</div>
		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
	</body>
</html>