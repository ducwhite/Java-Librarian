<%@ page import="java.util.LinkedList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Quản lý nhân viên</h1></center>
        <ol class="breadcrumb mb-4">
            <li class="breadcrumb-item"><a href="index.html">Trang chủ</a></li>
            <li class="breadcrumb-item active">Quản lý nhân viên</li>
        </ol>

        <!-- Button trigger modal -->
        <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
          <i class="fa-solid fa-user-plus"></i> Thêm nhân viên
      </button>

      <!-- Create Modal -->
      <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Thêm nhân viên</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form class="row g-3" action="insertnv" method="post">
                  <div class="col-md-12">
                      <label for="validationDefault02" class="form-label">Tên nhân viên</label>
                      <input name="tennv" type="text" class="form-control" id="validationDefault02" value="" required maxlength="40">
                  </div>


                  <div class="col-md-12">
                      <label for="validationDefault03" class="form-label">Ngày sinh</label>
                      <input name="ngaysinh" type="date" class="form-control" id="validationDefault03" required>
                  </div>
                  <div class="col-md-12">
                    <label for="validationDefault04" class="form-label">Giới tính</label>
                    <select name="gioitinh" class="form-select" id="validationDefault04" required>
                      <option selected disabled value="">Chọn</option>
                      <option>Nam</option>
                      <option>Nữ</option>
                  </select>
                  </div>
              <div class="col-md-12">
                <label for="validationDefault04" class="form-label">Chức vụ</label>
                <select name="chucvu" class="form-select" id="validationDefault04" required>
                  <option selected disabled value="">Chọn</option>
                  <c:forEach var="x" items="${listCV}">
                    <option value="${x.MACV}">${x.TENCV}</option>
                  </c:forEach>
                  
              </select>
                </div>
          <div class="col-md-12">
            <label for="validationDefault05" class="form-label">Số điện thoại</label>
            <input name="sdt" type="text" class="form-control" id="validationDefault05" required maxlength="10">
            </div>
           <div class="col-md-12">
            <label for="validationDefault05" class="form-label">CCCD</label>
            <input name="cccd" type="text" class="form-control" id="validationDefault05" required maxlength="12">
            </div>

        <div class="col-1"> 
        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit">Thêm nhân viên</button>
      </div>
  </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>

</div>
</div>
</div>
</div>


<button type="button" class="btn btn-primary float-end" onclick="print()"><i class="fa-solid fa-print"></i> In danh sách</button>
<form action="searchNV" method="post" class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0 float-end">
    <div class="input-group">
        <input name="search" value="${searchNV}" class="form-control" type="text" placeholder="Tìm kiếm ..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
        <button class="btn btn-primary" id="btnNavbarSearch" type="submit"><i class="fas fa-search"></i></button>
    </div>
</form>
<br><br> 
<div class="card mb-4">
    <div class="card-body">
        <table class="table">
            <thead class="table-dark">
              <tr>
                <th scope="col">Mã nhân viên</th>
                <th scope="col">Tên nhân viên</th>
                <th scope="col">Chức vụ</th>
                <th scope="col">Số điện thoại</th>
                <th colspan="3"><center>Thao tác</center></th>
            </tr>


        </thead>
        <tbody>
          <c:forEach items="${listNV}" var ="o">    
            <tr>
              <td>${o.MANV}</td>
              <td>${o.TENNV}</td>
              <td>${o.TENCV}</td>
              <td>${o.SDT}</td>
              <td><a href="chitietnv?sid=${o.MANV}" style="color: black"><i class="fa-solid fa-eye"></i></a></td>
              <td><a title="Sửa" href="updateNV?sid=${o.MANV}" style="border: none; background: #fff; color: #0d6efd;">
                  <i class="fa-solid fa-pen-to-square"></i>
                  </a>
              </td>
              <td><a title="Xóa" href="#" onclick="showMess(${o.MANV})" style="color:red"><i class="fa-solid fa-trash"></i></a></td>
            </tr>
          </c:forEach>
        </tbody>
        </table>
</div>
</div>

<!-- pagination -->
<nav aria-label="...">
    <ul class="pagination justify-content-center">
      <li class="page-item disabled">
        <a class="page-link" href="#" tabindex="-1">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item active">
        <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
    </li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
        <a class="page-link" href="#">Next</a>
    </li>
</ul>
</nav>   

<div style="height: 32vh"></div>
</div>
</main>
<script type="text/javascript">
    function showMess(id){
        var option = confirm("Bạn có chắc muốn xóa không?");
        if(option === true){
            window.location.href = "deletenv?sid=" + id ;
        }
    }
</script>
<%@include file="include/footer.jsp" %>