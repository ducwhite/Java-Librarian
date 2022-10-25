<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Lập phiếu phạt</h1></center>
        <hr>
        <form class="row g-3">
            <div class="col-md-4">
              <label for="validationDefault01" class="form-label">Mã phiếu phạt</label>
              <input type="text" class="form-control" id="validationDefault01" value="PP" required>
            </div>
            <div class="col-md-3">
                <label for="validationDefault04" class="form-label">Hình thức phạt</label>
                <select class="form-select" id="validationDefault04" required>
                  <option selected disabled value="">Chọn</option>
                  <option>Phạt tiền</option>
                  <option>Khác</option>
                </select>
              </div>
              <div class="col-md-3">
                <label for="validationDefault04" class="form-label">Nhân viên</label>
                <select class="form-select" id="validationDefault04" required>
                  <option selected disabled value="">Chọn</option>
                  <option>Đào Nguyễn Ngọc Đức</option>
                  <option>Đặng Minh Đức</option>
                </select>
              </div>
            <div class="col-md-3">
              <label for="validationDefault02" class="form-label">Ngày phạt</label>
              <input type="date" class="form-control" id="validationDefault02" value="" required>
            </div>
            
            <div class="col-md-3">
              <label for="validationDefault03" class="form-label">Lý do</label>
              <input type="text" class="form-control" id="validationDefault03" required>
            </div>

            <div class="col-md-3">
                <label for="validationDefault03" class="form-label">Phí phạt</label>
                <input type="number" class="form-control" id="validationDefault03" required>
              </div>
        
              
            <div class="col-1"> 
            </div>
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Lập phiếu phạt</button>
            </div>
          </form>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>

<%@include file="inc/footer.jsp" %>
 
