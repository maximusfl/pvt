<jsp:include page="header.jsp"></jsp:include>


<div class="jumbotron text-center" style="height: 550px; margin-top: -50px;" >
<%--    height: 250px;--%>
    <table class="table">
        <thead>

        <tr>
            <th scope="col">your current glucose level: ${currentParam.glucosaValue}  mmol/L</th>
            <th scope="col">meashured: ${currentParam.analyseTime}</th>
        </tr>

        </thead>

    </table>
    <p class="fig"> <img src="resources/pic.png" ></p>

</div>





<jsp:include page="footer.jsp"></jsp:include>