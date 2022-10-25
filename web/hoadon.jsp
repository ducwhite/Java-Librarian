<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Quản lý hoá đơn</h1></center>
        <ol class="breadcrumb mb-4">
            <li class="breadcrumb-item"><a href="index.jsp">Trang chủ</a></li>
            <li class="breadcrumb-item active">Quản lý hoá đơn</li>
        </ol>

        <!-- Button trigger modal -->
        <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
          <i class="fa-solid fa-user-plus"></i> Thêm hoá đơn
      </button>

      <!-- Create Modal -->
      <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Thêm hoá đơn</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form class="row g-3" action="inserthd" method="post">
           <div class="col-md-12">
            <label for="validationDefault04" class="form-label">Tên nhân viên</label>
            <select name="nhanvien" class="form-select" id="validationDefault04" required>
                <option selected disabled value="">Chọn</option>
                <c:forEach var="x" items="${listNV}">
                    <option value="${x.MANV}">${x.MANV}:${x.TENNV}</option>
                </c:forEach>
            </select>
            </div>
            <div class="col-md-12">
            <label for="validationDefault04" class="form-label">Tên độc giả</label>
            <select name="tendg" class="form-select" id="validationDefault04" required>
                <option selected disabled value="">Chọn</option>
                <c:forEach var="x" items="${listTDG}">
                    <option value="${x.MATHE}">${x.MATHE}:${x.TENDG}</option>
                </c:forEach>
            </select>
            </div>
          <div class="col-md-12">
              <label for="validationDefault02" class="form-label">Ngày lập</label>
              <input name="ngaylap" type="date" class="form-control" id="validationDefault02" required>
          </div>
           <div class="col-md-12">
              <label for="validationDefault02" class="form-label">Tổng tiền</label>
              <input name="tongtien" readonly type="number" class="form-control" value="0" id="validationDefault02" required>
          </div>
          <div class="mb-12">
                <label for="validationDefault02" class="form-label">Ghi chú</label>
                <input name="ghichu" class="form-control" id="validationDefault02" value="" required maxlength="100">
            </div>
       

        <div class="col-1">

        </div>
        <div class="col-12">
          <button class="btn btn-primary" type="submit">Thêm hoá đơn</button>
      </div>
  </form>      </div>
  <div class="modal-footer">
    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
    
</div>
</div>
</div>
</div>

<button type="button" class="btn btn-primary float-end" onclick="print()"><i class="fa-solid fa-print"></i> In danh sách</button> 
<form action="searchHD" method="post" class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0 float-end">
    <div class="input-group">
        <input name="search" value="${searchHD}" class="form-control" type="text" placeholder="Tìm kiếm ..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
        <button class="btn btn-primary" id="btnNavbarSearch" type="submit"><i class="fas fa-search"></i></button>
    </div>
</form>
<br><br> 
<div class="card mb-4">
    <div class="card-body">
        <table class="table">
            <thead class="table-dark">
              <tr>
                <th scope="col">Mã hoá đơn</th>
                <th scope="col">Nhân viên</th>
                <th scope="col">Độc giả</th>
                <th scope="col">Ngày lập</th>
                <th scope="col">Tổng tiền</th>
                <th scope="col">Ghi chú</th>
                <th colspan="3"><center>Thao tác</center></th>
            </tr>


        </thead>
        <tbody>
          <c:forEach items="${listHD}" var ="o">    
            <tr>
              <td>${o.MAHD}</td>
              <td>${o.TENNV}</td>
              <td>${o.TENDG}</td>
              <td>${o.NGAYLAP}</td>
              <td>${o.TONGTIEN}</td>
              <td>${o.GHICHU}</td>
              <td><a href="chitiethoadon?sid=${o.MAHD}" target="_blank" style="color: black"><i class="fa-solid fa-eye"></i></a></td>
              <td><a title="Sửa" href="updateHD?sid=${o.MAHD}" type="button" style="border: none; background: #fff; color: #0d6efd;" >
                  <i class="fa-solid fa-pen-to-square"></i>
                  </a>
              </td>
              <td><a title="Xóa" href="#" onclick="showMess(${o.MAHD})" style="color:red"><i class="fa-solid fa-trash"></i></a></td>
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
<div class="card mb-4"></div>
</div>
</main>
<script type="text/javascript">
    function showMess(id){
        var option = confirm("Bạn có chắc muốn xóa không?");
        if(option === true){
            window.location.href = "deleteHD?sid=" + id ;
        }
    }
</script>
<%@include file="include/footer.jsp" %>

