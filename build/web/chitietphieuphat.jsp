<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết phiếu phạt</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã phiếu phạt: ${pp.MAPP}</h4>
                        <h4>Nhân viên: ${pp.MANV}</h4>
                        <h4>Mã phiếu mượn: ${pp.MAPM}</h4>
                        <h4>Sách: ${pp.TENSACH}</h4>
                        <h4>Lệ phí: ${pp.TENLP}</h4>
                        <h4>Ngày phạt: ${pp.NGAYPHAT}</h4>
                        <h4>Phí phạt: ${pp.PHIPHAT}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        
        <div style="height: 32vh"></div>
        <div class="card mb-4"></div>
    </div>
</main>
<%@include file="include/footer.jsp" %>

