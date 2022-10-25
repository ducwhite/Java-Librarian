<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
  <div class="container-fluid px-4">
    <center><h1 class="mt-4">Sửa phiếu trả</h1></center>
    <hr>
    <div class="card">
      <div class="card-body">
          <form class="row g-3" action="updatePT" method="post">
          <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Mã phiếu trả</label>
            <input name="mapt" readonly type="text" class="form-control" id="validationDefault01" value="${pt.MAPT}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault06" class="form-label">Nhân viên</label>
            <select name="manv" class="form-select" id="validationDefault04" required>
                <option selected disabled value="">Chọn</option>
                <c:forEach var="x" items="${listNV}">
                    <option value="${x.MANV}" ${x.MANV == pt.MANV?"selected":""} >${x.MANV}:${x.TENNV}</option>
                </c:forEach>
            </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault06" class="form-label">Mã phiếu mượn:Sách</label>
            <select name="mapm" class="form-select" id="validationDefault04" required>
              <option selected disabled value="">Chọn</option>
                <c:forEach var="x" items="${listCTPM}">
                    <option value="${x.MAPM}:${x.MASACH}" ${x.MAPM == pt.MAPM && x.MASACH==pt.MASACH?"selected":""} >${x.MAPM}:${x.TENSACH}</option>
                </c:forEach>
            </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault05" class="form-label">Ngày trả</label>
            <input name="ngaytra" type="date" class="form-control" id="validationDefault03" value="${pt.NGAYTRA}" required>
          </div>
          <div class="mb-12">
            <label for="validationDefault02" class="form-label">Ghi chú</label>
            <input name="ghichu" class="form-control" id="validationDefault02" placeholder="${pt.GHICHU}" maxlength="70">
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
