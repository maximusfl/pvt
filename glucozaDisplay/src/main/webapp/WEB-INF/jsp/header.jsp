<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap 4 Website Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <style>
        .fig {
            text-align: center; /* Выравнивание по центру */ margin-top: 10%;
        }
    </style>



    <div class="jumbotron text-center" style="margin-bottom:0">
        <h1>GluCompas</h1>
        <p>Online tracking glucose level</p>
    </div>



    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">GluCompas</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/current">Current level</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/history">Last critical values</a>
                </li>

            </ul>
            <sec:authorize access="!isAuthenticated()">

                    <a class="nav-link" href="${pageContext.request.contextPath}/register">Register</a>


                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Login</a>

            </sec:authorize>
            <sec:authorize access="isAuthenticated()">

                    <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>

            </sec:authorize>


        </div>
    </nav>






</head>
<body>

