<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết hoá đơn</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã hóa đơn: ${hd.MAHD}</h4>
                        <h4>Nhân viên: ${hd.MANV}-${hd.TENNV}</h4>
                        <h4>Độc giả: ${hd.MATDG}-${hd.TENDG}</h4>
                        <h4>Ngày lập: ${hd.NGAYLAP}</h4>
                        <h4>Tổng tiền: ${hd.TONGTIEN}</h4>
                        <h4>Ghi chú: ${hd.GHICHU}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
          <i class="fa-solid fa-plus"></i> Thêm chi tiết
        </button>
        <!-- Create Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Thêm chi tiết</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
    </div>
    <div class="modal-body">
        <form class="row g-3" action="insertCTHD" method="post">
        <input type="hidden" name="mahd" value="${hd.MAHD}">
        <div class="col-md-12">
        <label for="validationDefault04" class="form-label">Tên lệ phí</label>
        <select name="tenlp" class="form-select" id="validationDefault04" required>
          <option selected disabled value="">Chọn</option>
          <c:forEach var="x" items="${listLP}">
              <option value="${x.MALP}">${x.TENLP}</option>
          </c:forEach>
        </select>
        </div>

<div class="col-1">

</div>
<div class="col-12">
    <button class="btn btn-primary" type="submit">Thêm chi tiết</button>
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
                        <th scope="col">Mã hóa đơn</th>
                        <th scope="col">Lệ phí</th>
                        <th scope="col">Số tiền</th>
                        <th colspan="1"><center>Thao tác</center></th>
                    </tr>


                    </thead>
                    <tbody>
                        <c:forEach items="${listCT}" var ="o">    
                          <tr>
                            <td>${o.MAHD}</td>
                            <td>${o.TENLP}</td>
                            <td>${o.SOTIEN}</td>
                            <td><a title="Xóa" href="#" onclick="showMess(${o.MAHD},${o.MALP})" style="color:red"><i class="fa-solid fa-trash"></i></a></td>
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
    window.location.href = "deleteCTHD?sid1=" + id1 +"&sid2=" + id2;
    }
}
</script>
<%@include file="include/footer.jsp" %>


