<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa tác giả</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateTG" method="post">
  <div class="col-md-12">
    <label for="validationDefault01" class="form-label">Mã tác giả</label>
    <input name="matg" readonly type="text" class="form-control" id="validationDefault01" value="${tg.MATG}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefault02" class="form-label">Tên tác giả</label>
    <input name="tentg" type="text" class="form-control" id="validationDefault02" value="${tg.TENTG}" required>
  </div>
    <div class="col-md-12">
    <label for="validationDefault03" class="form-label">Địa chỉ</label>
    <input name="diachi" type="text" class="form-control" id="validationDefault03" value="${tg.DIACHI}" required>
  </div>
  <div class="col-md-12">
    <label for="validationDefaultUsername" class="form-label">Email</label>
    <div class="input-group">
      <span class="input-group-text" id="inputGroupPrepend2">@</span>
      <input name="email" type="email" class="form-control" id="validationDefaultUsername" aria-describedby="inputGroupPrepend2" value="${tg.EMAIL}" required>
    </div>
  </div>
    <div class="col-md-12">
    <label for="validationDefault03" class="form-label">CCCD</label>
    <input name="cccd" type="text" class="form-control" id="validationDefault04" value="${tg.CCCD}" required>
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
