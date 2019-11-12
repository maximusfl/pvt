<jsp:include page="header.jsp"></jsp:include>


<div class="jumbotron text-center" style="margin-bottom:0">
    <table class="table">
        <thead>

        <tr>
            <th scope="col">your current glucose level: ${currentParam.glucosaValue}</th>
            <th scope="col">meashured: ${currentParam.analyseTime}</th>
        </tr>

        </thead>

    </table>
</div>
<jsp:include page="footer.jsp"></jsp:include>