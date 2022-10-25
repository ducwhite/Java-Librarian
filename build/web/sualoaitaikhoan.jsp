<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa loại tài khoản</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateLTK" method="post">
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Mã loại tài khoản</label>
                    <input name="maltk" readonly type="text" class="form-control" id="validationDefault01" value="${ltk.MALTK}" required>
                </div>

                <div class="col-md-12">
                    <label for="validationDefault02" class="form-label">Tên loại tài khoản</label>
                    <input name="tenltk" type="text" class="form-control" id="validationDefault02" value="${ltk.TENLTK}" required>
                </div>

                <div class="col-12">
                    <button class="btn btn-primary" type="submit">Sửa</button>
                </div>
            </form>
        </div>
    </div>


    <div style="height: 32vh"></div>
    <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
</div>
</main>

<%@include file="include/footer.jsp" %>
