<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết tài khoản</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã tài khoản: ${tk.MATK}</h4>
                        <h4>Tên tài khoản: ${tk.TENTK}</h4>
                        <h4>Mật khẩu: ${tk.MATKHAU}</h4>
                        <h4>Tên nhân viên: ${tk.MANV}</h4>
                        <h4>Quyền: ${tk.MALTK}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        
        <div style="height: 32vh"></div>
        <div class="card mb-4"></div>
    </div>
</main>
<%@include file="include/footer.jsp" %>


