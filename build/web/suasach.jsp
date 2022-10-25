<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa sách</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateSach" method="post">
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Mã sách</label>
                    <input name="masach" readonly type="text" class="form-control" id="validationDefault01" value="${s.MASACH}" required>
                </div>
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Tên sách</label>
                    <input name="tensach" type="text" class="form-control" id="validationDefault01" value="${s.TENSACH}" required>
                </div>
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Năm xuất bản</label>
                    <input name="namxb" type="text" class="form-control" id="validationDefault01" value="${s.NAMXB}" required>
                </div>
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Số lượng</label>
                    <input name="sl" type="number" class="form-control" id="validationDefault01" value="${s.SL}" required>
                </div>
              <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Thể loại</label>
                <select name="theloai" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listTL}">
                      <option value="${x.MATL}" ${x.MATL == s.MATL? "selected":""} >${x.TENTL}</option>
                    </c:forEach>
              </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault04" class="form-label">Nhà xuất bản</label>
            <select name="nhaxb" class="form-select" id="validationDefault04" required>
              <c:forEach var="x" items="${listNXB}">
                <option value="${x.MAXB}" ${x.MAXB == s.MAXB?"selected":""}>${x.NXB}</option>
              </c:forEach>
         
          </select>
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
