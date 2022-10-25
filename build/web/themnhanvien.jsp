<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Thêm nhân viên mới</h1></center>
        <hr>
        <form class="row g-3">
            <div class="col-md-4">
              <label for="validationDefault01" class="form-label">Mã nhân viên</label>
              <input type="text" class="form-control" id="validationDefault01" value="NV" required>
            </div>
            <div class="col-md-4">
              <label for="validationDefault02" class="form-label">Tên nhân viên</label>
              <input type="text" class="form-control" id="validationDefault02" value="" required>
            </div>


            <div class="col-md-4">
              <label for="validationDefault03" class="form-label">Ngày sinh</label>
              <input type="date" class="form-control" id="validationDefault03" required>
            </div>
            <div class="col-md-3">
                <label for="validationDefault04" class="form-label">Giới tính</label>
                <select class="form-select" id="validationDefault04" required>
                  <option selected disabled value="">Giới tính</option>
                  <option>Nam</option>
                  <option>Nữ</option>
                </select>
              </div>
              <div class="col-md-3">
                <label for="validationDefault04" class="form-label">Chức vụ</label>
                <select class="form-select" id="validationDefault04" required>
                  <option selected disabled value="">Chức vụ</option>
                  <option>Tiếp tân</option>
                  <option>Thủ thư</option>
                </select>
              </div>
              <div class="col-md-3">
                <label for="validationDefault05" class="form-label">Số điện thoại</label>
                <input type="text" class="form-control" id="validationDefault05" required>
              </div>
        
            <div class="col-1"> 
            </div>
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Thêm nhân viên</button>
            </div>
          </form>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>
<%@include file="inc/footer.jsp" %>
