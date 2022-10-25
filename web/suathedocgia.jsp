<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
  <div class="container-fluid px-4">
    <center><h1 class="mt-4">Sửa thẻ đọc giả</h1></center>
    <hr>
    <div class="card">
      <div class="card-body">
          <form class="row g-3" action="updateTDG" method="post">
          <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Mã thẻ đọc giả</label>
            <input name="matdg" readonly type="text" class="form-control" id="validationDefault01" value="${tdg.MATHE}" required>
          </div>
          <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Tên độc giả</label>
                <select name="tendg" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listDG}">
                      <option value="${x.MADOCGIA}" ${x.MADOCGIA == tdg.MADG? "selected":""} >${x.MADOCGIA}:${x.TENDOCGIA}</option>
                    </c:forEach>
              </select>
          </div>
          <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Nhân viên</label>
                <select name="manv" class="form-select" id="validationDefault04" required>
                    <c:forEach var="x" items="${listNV}">
                      <option value="${x.MANV}" ${x.MANV == tdg.MANV? "selected":""} >${x.MANV}:${x.TENNV}</option>
                    </c:forEach>
              </select>
          </div>
          <div class="col-md-12">
            <label for="validationDefault05" class="form-label">Ngày cấp</label>
            <input name="ngaycap" type="date" class="form-control" id="validationDefault05" value="${tdg.ngaycap}" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault05" class="form-label">Hạn sử dụng</label>
            <input type="number" readonly class="form-control" id="validationDefault05" value="4" required>
          </div>
          <div class="col-md-12">
            <label for="validationDefault06" class="form-label">Tình trạng</label>
            <select name="tinhtrang" class="form-select" id="validationDefault04" required>
              <option value="1" ${tdg.TINHTRANG == "1"?"selected":""}  >Kích hoạt</option>
              <option value="0" ${tdg.TINHTRANG == "0"?"selected":""}>Chưa kích hoạt</option>
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
