<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa chi tiết sách</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
                <form class="row g-3" action="updateCTV" method="post">
                    <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Tên sách</label>
                    <select disabled class="form-select" id="validationDefault04" required>
                      <option selected disabled value="">Chọn</option>
                      <c:forEach var="x" items="${listS}">
                          <option value="${x.MASACH}" ${x.MASACH == ct.MASACH?"selected":""}>${x.TENSACH}</option>
                      </c:forEach>
                    </select>
                    <input type="hidden" name="tens" value="${ct.MASACH}">
                    </div>  
                    <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Tên tác giả</label>
                    <select disabled class="form-select" id="validationDefault04" required>
                      <option selected disabled value="">Chọn</option>
                      <c:forEach var="x" items="${listTG}">
                          <option value="${x.MATG}" ${x.MATG == ct.MATG?"selected":""}>${x.TENTG}</option>
                      </c:forEach>
                    </select>
                    <input type="hidden" name="tentg" value="${ct.MATG}">
                    </div>
                    <div class="col-md-12">
                        <label for="validationDefault01" class="form-label">Vai trò</label>
                        <input type="text" name="vaitro" class="form-control" id="validationDefault01" value="${ct.VAITRO}" required>
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
