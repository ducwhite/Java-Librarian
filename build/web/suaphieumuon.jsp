<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa phiếu mượn</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updatePM" method="post">
  <div class="col-md-12">
    <label for="validationDefault01" class="form-label">Mã phiếu mượn</label>
    <input name="mapm" readonly type="text" class="form-control" id="validationDefault01" value="${pm.MAPM}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefault05" class="form-label">Ngày mượn</label>
    <input name="ngaymuon" type="date" class="form-control" id="validationDefault02" value="${pm.NGAYMUON}" required>
  </div>
    <div class="col-md-12">
    <label for="validationDefault05" class="form-label">Ngày trả</label>
    <input name="ngaytra" type="date" class="form-control" id="validationDefault03" value="${pm.NGAYTRA}" required>
  </div>
    <div class="col-md-12">
    <label for="validationDefault06" class="form-label">Nhân viên</label>
    <select name="nhanvien" class="form-select" id="validationDefault04" required>
      <c:forEach var="x" items="${listNV}">
        <option value="${x.MANV}" ${x.MANV == pm.MANV? "selected":""} >${x.MANV}:${x.TENNV}</option>
      </c:forEach>
    </select>
  </div>
      <div class="col-md-12">
    <label for="validationDefault06" class="form-label">Thẻ đọc giả</label>
    <select name="thedg" class="form-select" id="validationDefault04" required>
      <c:forEach var="x" items="${listTDG}">
        <option value="${x.MATHE}" ${x.MATHE == pm.MATHE? "selected":""} >${x.MATHE}:${x.TENDG}</option>
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
