<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="resources/css/header.css">
</head>
<body>
    <header>
        <div class="header-logo">
            <a href="/"><img src="resources/img/logo.png" alt=""></a>
        </div>
        <div class="header-menu">
            <ul class="header-menu-list">
                <a href="">
                    <li class="header-menu-list-item">STYLE</li>
                </a>
                <a href="">
                    <li class="header-menu-list-item">SHOP</li>
                </a>
                <a href="">
                    <li class="header-menu-list-item">ABOUT</li>
                </a>

                <!-- Login Info Check -->
                <c:set var="name" value="${userName}" />
                <c:choose>
                    <c:when test="${empty name}">
                        <a href="/sign-in">
                            <li class="header-menu-list-item">SIGN IN</li>
                        </a>
                    </c:when>
                    <c:when test="${not empty name}">
                        <a href="/logout">
                            <li class="header-menu-list-item">SIGN OUT</li>
                        </a>
                    </c:when>
                </c:choose>
            </ul>
        </div>
    </header>
</body>
</html>