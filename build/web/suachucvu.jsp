<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa chức vụ</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateCV" method="post">
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Mã chức vụ</label>
                    <input readonly name="macv" type="text" class="form-control" id="validationDefault01" value="${cv.MACV}" required>
                </div>

                <div class="col-md-12">
                    <label for="validationDefault02" class="form-label">Tên chức vụ</label>
                    <input name="tencv" type="text" class="form-control" id="validationDefault02" value="${cv.TENCV}" required>
                </div>  
                <div class="col-md-12">
                    <label for="validationDefault03" class="form-label">Lương</label>
                    <input name="luong" type="number" class="form-control" id="validationDefault03" value="${cv.LUONG}" required>
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
