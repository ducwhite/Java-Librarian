<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa tài khoản</h1></center>
        <hr>
        <div class="card">
  <div class="card-body">
      <form class="row g-3" action="updateTK" method="post">
            <div class="col-md-12">
                <label for="validationDefault01" class="form-label">Mã tài khoản</label>
                <input name="matk" readonly type="text" class="form-control" id="validationDefault01" value="${tk.MATK}" required>
            </div>
            <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Loại tài khoản</label>
                <select name="ltk" class="form-select" id="validationDefault04" required>
                  <c:forEach var="x" items="${listLTK}">
                      <option value="${x.MALTK}" ${x.MALTK == tk.MALTK? "selected":""} >${x.TENLTK}</option>
                  </c:forEach>
              </select>
          </div>
          <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Tên nhân viên</label>
                <select name="nhanvien" class="form-select" id="validationDefault04" required>
                  <c:forEach var="x" items="${listNV}">
                      <option value="${x.MANV}" ${x.MANV == tk.MANV? "selected":""} >${x.MANV}:${x.TENNV}</option>
                  </c:forEach>
              </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Tên tài khoản</label>
            <input name="tentk" type="text" class="form-control" id="validationDefault02" value="${tk.TENTK}" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Mật khẩu</label>
            <input name="matkhau" type="text" class="form-control" id="validationDefault02" value="${tk.MATKHAU}" required>
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
