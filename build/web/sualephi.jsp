<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa lệ phí</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateLP" method="post">
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Mã lệ phí</label>
                    <input name="malp" readonly type="text" class="form-control" id="validationDefault01" value="${lp.MALP}" required>
                </div>

                <div class="col-md-12">
                    <label for="validationDefault02" class="form-label">Tên lệ phí</label>
                    <input name="tenlp" type="text" class="form-control" id="validationDefault02" value="${lp.TENLP}" required>
                </div>  
                <div class="col-md-12">
                    <label for="validationDefault03" class="form-label">Số tiền</label>
                    <input name="sotien" type="number" class="form-control" id="validationDefault03" value="${lp.SOTIEN}" required>
                </div>
                <div class="col-12">
                    <button class="btn btn-primary" type="submit">Sửa</button>
                </div>
            </form>
        </div>
    </div>


    <div style="height: 32vh"></div>
    <div class="card mb-4"></div>
</div>
</main>

<%@include file="include/footer.jsp" %>
