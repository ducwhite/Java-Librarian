<%@ page import="java.util.LinkedList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Chi tiết phiếu mượn</h1></center>
        <hr>
        <center><h1>Thông tin</h1></center>
        <br><br><br>
        <div class="card">
            <div class="card-body">
                <figure class="text-center">
                    <blockquote class="blockquote">
                        <h4>Mã PMS: ${pm.MAPM}</h4>
                        <h4>Nhân viên lập: ${pm.MANV}</h4>
                        <h4>Người mượn: ${pm.TENDG}</h4>
                        <h4>Ngày mượn: ${pm.NGAYMUON}</h4>
                        <h4>Ngày trả: ${pm.NGAYTRA}</h4>
                    </blockquote>
                </figure>
            </div>
        </div>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#exampleModal">
          <i class="fa-solid fa-plus"></i> Thêm chi tiết phiếu mượn
        </button> 
        <!-- Create Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Thêm chi tiết phiếu mượn</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form class="row g-3" action="insertCTPM" method="post">
                            <div class="col-md-12">
                                <label for="validationDefault01" class="form-label">Mã phiếu mượn</label>
                                <input type="text" readonly name="mapm" class="form-control" id="validationDefault01" value="${pm.MAPM}">
                            </div>
                            <div class="col-md-12">
                                <label for="validationDefault04" class="form-label">Tên sách</label>
                                <select name="masach" class="form-select" id="validationDefault04" required>
                                    <option selected disabled value="">Chọn</option>
                                    <c:forEach var="x" items="${listS}">
                                        <option value="${x.MASACH}">${x.TENSACH}</option>
                                    </c:forEach>
                                </select>
                            </div>                               
                            <div class="col-md-12">
                                <label for="validationDefault01" class="form-label">Ghi chú</label>
                                <input type="text" name="ghichu" class="form-control" id="validationDefault01" value="" maxlength="100">
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
                            <th scope="col">Mã phiếu mượn</th>
                            <th scope="col">Tên sách</th>
                            <th scope="col">Ghi chú</th>
                            <th colspan="2"><center>Thao tác</center></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${listCT}" var ="o">    
                            <tr>
                                <td>${o.MAPM}</td>
                                <td>${o.TENSACH}</td>
                                <td>${o.ghichu}</td>
                                <td><a title="Sửa" href="updateCTPM?sid1=${o.MAPM}&sid2=${o.MASACH}" style="border: none; background: #fff; color: #0d6efd;">
                                    <i class="fa-solid fa-pen-to-square"></i>
                                    </a>
                                </td>
                                <td><a title="Xóa" href="#" onclick="showMess(${o.MAPM},${o.MASACH})" style="color:red"><i class="fa-solid fa-trash"></i></a></td>
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
<script>
//    function DateFormat(String date){
//        n = new Date(date);
//        y = n.getFullYear();
//        m = n.getMonth() + 1;
//        d = n.getDate();
//        document.getElementById("date").innerHTML = d + "/" + m + "/" + y;
//    }
    function showMess(id1,id2){
        var option = confirm("Bạn có chắc muốn xóa không?");
        if(option === true){
            window.location.href = "deleteCTPM?sid1=" + id1 +"&sid2=" + id2 ;
        }
    }
</script>
<%@include file="include/footer.jsp" %>


