<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa hoá đơn</h1></center>
        <hr>
        <div class="card">
  <div class="card-body">
      <form class="row g-3" action="updateHD" method="post">
            <div class="col-md-12">
                <label for="validationDefault01" class="form-label">Mã hoá đơn</label>
                <input name="mahd" readonly type="text" class="form-control" id="validationDefault01" value="${hd.MAHD}" required>
            </div>
            <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Nhân viên</label>
                <select name="nhanvien" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listNV}">
                      <option value="${x.MANV}" ${x.MANV == hd.MANV? "selected":""} >${x.TENNV}</option>
                    </c:forEach>
              </select>
            </div>
            <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Độc giả</label>
                <select name="tendg" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listTDG}">
                      <option value="${x.MATHE}" ${x.MATHE == hd.MATDG? "selected":""} >${x.TENDG}</option>
                    </c:forEach>
              </select>
            </div>
          <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Ngày lập</label>
            <input name="ngaylap" type="date" class="form-control" id="validationDefault02" value="${hd.NGAYLAP}" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Tổng tiền</label>
            <input name="tongtien" readonly type="text" class="form-control" id="validationDefault02" value="${hd.TONGTIEN}" required>
        </div>
        <div class="mb-12">
            <label for="validationDefault02" class="form-label">Ghi chú</label>
            <input name="ghichu" type="text" class="form-control" id="validationDefault02" value="${hd.GHICHU}" required>
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
