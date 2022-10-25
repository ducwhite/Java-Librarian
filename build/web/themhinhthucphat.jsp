<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Thêm hình thức phạt</h1></center>
        <hr>
        <form class="row g-3">
            <div class="col-md-3 w-100">
              <label for="validationDefault01" class="form-label">Mã hình thức phạt</label>
              <input type="text" class="form-control" id="validationDefault01" value="HTP" required>
            </div>

            <div class="col-md-3 w-100">
              <label for="validationDefault02" class="form-label">Tên hình thức phạt</label>
              <input type="text" class="form-control" id="validationDefault02" value="" required>
            </div>
            
            <div class="col-md-3 w-100">
                <label for="validationDefault02" class="form-label">Cách phạt</label>
                <input type="text" class="form-control" id="validationDefault02" value="" required>
              </div>
                            
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Thêm hình thức phạt</button>
            </div>
          </form>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>
<%@include file="inc/footer.jsp" %>
