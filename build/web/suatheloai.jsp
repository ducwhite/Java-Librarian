<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Sửa thể loại</h1></center>
        <hr>
        <div class="card">
          <div class="card-body">
              <form class="row g-3" action="updateTL" method="post">
                <div class="col-md-12">
                    <label for="validationDefault01" class="form-label">Mã thể loại</label>
                    <input name="matl" readonly type="text" class="form-control" id="validationDefault01" value="${tl.MATL}" required>
                </div>

                <div class="col-md-12">
                    <label for="validationDefault02" class="form-label">Tên thể loại</label>
                    <input name="tentl" type="text" class="form-control" id="validationDefault02" value="${tl.TENTL}" required>
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
