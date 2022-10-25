<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa chi tiết phiếu mượn</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
                <form class="row g-3" action="updateCTPM" method="post">
                    <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Mã phiếu mượn</label>
                    <input readonly type="text" name="mapm" class="form-control" id="validationDefault01" value="${ct.MAPM}">
                    </div>
                    <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Tên sách</label>
                    <input readonly type="text" name="masach" class="form-control" id="validationDefault01" value="${ct.MASACH}">
                    </div>
                    <div class="col-md-12">
                        <label for="validationDefault01" class="form-label">Ghi chú</label>
                        <input type="text" name="ghichu" class="form-control" id="validationDefault01" value="${ct.ghichu}" maxlength="100">
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
