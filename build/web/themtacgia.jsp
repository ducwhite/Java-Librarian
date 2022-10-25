<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Thêm tác giả mới</h1></center>
        <hr>
        <form class="row g-3">
            <div class="col-md-4">
              <label for="validationDefault01" class="form-label">Mã tác giả</label>
              <input type="text" class="form-control" id="validationDefault01" value="TG" required>
            </div>
            <div class="col-md-4">
              <label for="validationDefault02" class="form-label">Tên tác giả</label>
              <input type="text" class="form-control" id="validationDefault02" value="" required>
            </div>

            <div class="col-md-5">
              <label for="validationDefault03" class="form-label">Địa chỉ</label>
              <input type="text" class="form-control" id="validationDefault03" required>
            </div>
            <div class="col-md-3">
                <label for="validationDefaultUsername" class="form-label">Email</label>
                <div class="input-group">
                  <span class="input-group-text" id="inputGroupPrepend2">@</span>
                  <input type="email" class="form-control" id="validationDefaultUsername"  aria-describedby="inputGroupPrepend2" required>
                </div>
              </div>
            
            <div class="col-1">
            </div>
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Thêm tác giả</button>
            </div>
          </form>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>
<%@include file="inc/footer.jsp" %>
