<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
  <div class="container-fluid px-4">
    <center><h1 class="mt-4">Sửa nhân viên</h1></center>
    <hr>
    <div class="card">
      <div class="card-body">
          <form class="row g-3" action="updateNV" method="post">
          <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Mã nhân viên</label>
            <input name="manv" readonly type="text" class="form-control" id="validationDefault01" value="${nv.MANV}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Tên nhân viên</label>
            <input name="tennv" type="text" class="form-control" id="validationDefault02" value="${nv.TENNV}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault06" class="form-label">Chức vụ</label>
            <select name="chucvu" class="form-select" id="validationDefault04" required>
              <c:forEach var="x" items="${listCV}">
                <option value="${x.MACV}" ${x.MACV == nv.MACV? "selected":""} >${x.TENCV}</option>
              </c:forEach>
            </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault05" class="form-label">Ngày sinh</label>
            <input name="ngaysinh" type="date" class="form-control" id="validationDefault05" value="${nv.NGAYSINH}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault06" class="form-label">Giới tính</label>
            <select name="gioitinh" class="form-select" id="validationDefault04" required>
              <option ${nv.PHAI == "Nam"?"selected":""}>Nam</option>
              <option ${nv.PHAI == "Nữ"?"selected":""}>Nữ</option>
            </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault03" class="form-label">Số điện thoại</label>
            <input name="sdt" type="text" class="form-control" id="validationDefault04" value="${nv.SDT}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault03" class="form-label">CCCD</label>
            <input name="cccd" type="text" class="form-control" id="validationDefault04" value="${nv.CCCD}" required>
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
