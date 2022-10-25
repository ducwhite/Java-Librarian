<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>

<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa phiếu phạt</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updatePP" method="post">
                <div class="col-md-12">
                  <label for="validationDefault01" class="form-label">Mã phiếu phạt</label>
                  <input name="mapp" readonly type="text" class="form-control" id="validationDefault01" value="${pp.MAPP}" required>
                </div>
                <div class="col-md-12">
                  <label for="validationDefault02" class="form-label">Ngày phạt</label>
                  <input name="ngayphat" type="date" class="form-control" id="validationDefault02" value="${pp.NGAYPHAT}" required>
                </div>
                  <div class="col-md-12">
                  <label for="validationDefault03" class="form-label">Phí phạt</label>
                  <input name="phiphat" readonly type="number" class="form-control" id="validationDefault03" value="${pp.PHIPHAT}" required>
                </div>
                <div class="col-md-12">
                  <label for="validationDefault06" class="form-label">Nhân viên</label>
                  <select name="manv" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listNV}">
                      <option value="${x.MANV}" ${x.MANV == pp.MANV? "selected":""} >${x.MANV}:${x.TENNV}</option>
                    </c:forEach>
                  </select>
                </div>
                <div class="col-md-12">
                  <label for="validationDefault06" class="form-label">Mã phiếu mượn</label>
                  <select name="mapm" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listCTPM}">
                      <option value="${x.MAPM}:${x.MASACH}" ${x.MAPM == pp.MAPM && x.MASACH==pp.MASACH? "selected":""} >${x.MAPM}:${x.TENSACH}</option>
                    </c:forEach>
                  </select>
                </div>
                <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Lệ phí</label>
                    <select onchange="PhiPhat()" name="malp" class="form-select" id="validationDefault05" required>
                    <option selected disabled value="">Chọn</option>
                      <c:forEach var="x" items="${listLP}">
                          <option value="${x.MALP},${x.SOTIEN}" ${x.MALP == pp.MALP?"selected":""}>${x.TENLP}:${x.SOTIEN}</option>  
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
