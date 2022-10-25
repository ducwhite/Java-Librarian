<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết nhân viên</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã nhân viên: ${nv.MANV}</h4>
                        <h4>Tên nhân viên: ${nv.TENNV}</h4>
                        <h4>Ngày sinh: ${nv.NGAYSINH}</h4>
                        <h4>Giới tính: ${nv.PHAI}</h4>
                        <h4>Chức vụ: ${nv.CHUCVU}</h4>
                        <h4>Số điện thoại: ${nv.SDT}</h4>
                        <h4>CCCD: ${nv.CCCD}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        
        <div style="height: 32vh"></div>
        <div class="card mb-4"></div>
    </div>
</main>

<%@include file="include/footer.jsp" %>
