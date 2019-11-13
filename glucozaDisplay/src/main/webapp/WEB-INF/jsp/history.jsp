<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>


<div class="jumbotron text-center" style="height: 550px; margin-top: -50px;" >
<%--   // height: 250px;--%>

    <table class="table">
        <thead class="thead-light">
        <tr>

            <th scope="col">Glucose level (mmol/L)</th>
            <th scope="col">Time</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="history" items="${glucosaParams}">
            <tr>

                <td>${history.glucosaValue}</td>
                <td>${history.analyseTime}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<%--<p class="fig"> <img src="resources/pic.png" ></p>--%>




<jsp:include page="footer.jsp"></jsp:include>