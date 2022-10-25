<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
                
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết đọc giả</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã DG: ${dg.MADOCGIA}</h4>
                        <h4>Tên DG: ${dg.TENDOCGIA}</h4>
                        <h4>Địa chỉ: ${dg.DIACHI}</h4>
                        <h4>Email: ${dg.EMAIL}</h4>
                        <h4>SĐT: ${dg.SDT}</h4>
                        <h4>Ngày sinh: ${dg.NGAYSINH}</h4>
                        <h4>Giới tính: ${dg.GIOITINH}</h4>
                        <h4>CCCD: ${dg.CCCD}</h4> 
                    </blockquote>
                  </figure>
            </div>
          </div>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>

<!-- footer -->
<footer class="py-4 bg-light mt-auto">
    <div class="container-fluid px-4">
    <div class="d-flex align-items-center justify-content-between small">
    <div class="text-muted">Copyright &copy; D2Lib 2022</div>
    <div>
    <a href="#">Privacy Policy</a>
    &middot;
    <a href="#">Terms &amp; Conditions</a>
    </div>
    </div>
    </div>
</footer>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="js/scripts.js"></script>
</body>
</html>

<%@include file="include/footer.jsp" %>