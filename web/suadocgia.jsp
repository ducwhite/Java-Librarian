<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa đọc giả</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateDG" method="post">
  <div class="col-md-12">
    <label for="validationDefault01" class="form-label">Mã đọc giả</label>
    <input name="madg" readonly type="text" class="form-control" id="validationDefault01" value="${dg.MADOCGIA}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefault02" class="form-label">Tên đọc giả</label>
    <input name="tendg" type="text" class="form-control" id="validationDefault02" value="${dg.TENDOCGIA}" required>
  </div>
    <div class="col-md-12">
    <label for="validationDefault03" class="form-label">Địa chỉ</label>
    <input name="diachi" type="text" class="form-control" id="validationDefault03" value="${dg.DIACHI}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefaultUsername" class="form-label">Email</label>
    <div class="input-group">
      <span class="input-group-text" id="inputGroupPrepend2">@</span>
      <input name="email" type="email" class="form-control" id="validationDefaultUsername" value="${dg.EMAIL}" aria-describedby="inputGroupPrepend2" required>
    </div>
  </div>
  <div class="col-md-12">
    <label for="validationDefault03" class="form-label">Số điện thoại</label>
    <input name="sdt" type="text" class="form-control" id="validationDefault04" value="${dg.SDT}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefault05" class="form-label">Ngày sinh</label>
    <input name="ngaysinh" type="date" class="form-control" id="validationDefault05" value="${dg.NGAYSINH}" required>
  </div>
    <div class="col-md-12">
    <label for="validationDefault06" class="form-label">Giới tính</label>
    <select name="gioitinh" class="form-select" id="validationDefault04" required>
        <option ${dg.GIOITINH == "nam"?"selected":""}>Nam</option>
      <option ${dg.GIOITINH == "nữ"?"selected":""}>Nữ</option>
    </select>
  </div>
    <div class="col-md-12">
    <label for="validationDefault03" class="form-label">CCCD</label>
    <input name="cccd" type="text" class="form-control" id="validationDefault04" value="${dg.CCCD}" required>
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
