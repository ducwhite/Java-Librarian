<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết phiếu trả</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã phiếu trả: ${pt.MAPT}</h4>
                        <h4>Nhân viên: ${pt.TENNV}</h4>
                        <h4>Mã phiếu mượn: ${pt.MAPM}</h4>
                        <h4>Tên sách: ${pt.TENSACH}</h4>
                        <h4>Ngày trả: ${pt.NGAYTRA}</h4>
                        <h4>Ghi chú: ${pt.GHICHU}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        
        <div style="height: 32vh"></div>
        <div class="card mb-4"></div>
    </div>
</main>
<%@include file="include/footer.jsp" %>


