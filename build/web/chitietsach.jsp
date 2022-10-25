<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết sách</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã sách: ${st.MASACH}</h4>
                        <h4>Tên sách: ${st.TENSACH}</h4>
                        <h4>Năm xuất bản: ${st.NAMXB}</h4>
                        <h4>Thể loại: ${st.MATL}</h4>
                        <h4>Nhà xuất bản: ${st.MAXB}</h4>
                        <h4>Số lượng: ${st.SL}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
          <i class="fa-solid fa-plus"></i> Thêm tác giả
        </button>
        <!-- Create Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Thêm tác giả</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
    </div>
    <div class="modal-body">
        <form class="row g-3" action="insertCTV" method="post">
        <div class="col-md-12">
        <label for="validationDefault04" class="form-label">Tên sách</label>
        <select name="tens" class="form-select" id="validationDefault04" required>
          <option selected disabled value="">Chọn</option>
          <option>...</option>
          <c:forEach var="x" items="${listS}">
              <option value="${x.MASACH}" ${x.MASACH == st.MASACH?"selected":""}>${x.TENSACH}</option>
          </c:forEach>
        </select>
        </div>    
        <div class="col-md-12">
        <label for="validationDefault04" class="form-label">Tên tác giả</label>
        <select name="tentg" class="form-select" id="validationDefault04" required>
          <option selected disabled value="">Chọn</option>
          <option>...</option>
          <c:forEach var="x" items="${listTG}">
              <option value="${x.MATG}">${x.TENTG}</option>
          </c:forEach>
        </select>
        </div>
        <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Vai trò</label>
            <input type="text" name="vaitro" class="form-control" id="validationDefault01" value="" required maxlength="30">
        </div>

<div class="col-1">

</div>
<div class="col-12">
    <button class="btn btn-primary" type="submit">Thêm tác giả</button>
</div>
</form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>

</div>
</div>
</div>
</div>
        <div class="card mb-4">
            <div class="card-body">
                <table class="table">
                    <thead class="table-dark">
                      <tr>
                        <th scope="col">Sách</th>
                        <th scope="col">Tác giả</th>
                        <th scope="col">Vai trò</th>
                        <th colspan="2"><center>Thao tác</center></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listCT}" var ="o">    
                <tr>
                  <td>${o.TENSACH}</td>
                  <td>${o.TENTG}</td>
                  <td>${o.VAITRO}</td>
                  <td><a title="Sửa" href="updateCTV?sid1=${o.MASACH}&sid2=${o.MATG}" style="border: none; background: #fff; color: #0d6efd;">
                      <i class="fa-solid fa-pen-to-square"></i>
                      </a>
                  </td>
                  <td><a title="Xóa" href="#" onclick="showMess(${o.MASACH},${o.MATG})" style="color:red"><i class="fa-solid fa-trash"></i></a></td>
                </tr>
              </c:forEach>
                </tbody>
        </table>
    </div>
</div>
        <div style="height: 32vh"></div>
        <div class="card mb-4"></div>
    </div>
</main>
<script type="text/javascript">
    function showMess(id1,id2){
        var option = confirm("Bạn có chắc muốn xóa không?");
        if(option === true){
            window.location.href = "deleteCTV?sid1=" + id1 +"&sid2=" + id2 ;
        }
    }
</script>                       
<%@include file="include/footer.jsp" %>

