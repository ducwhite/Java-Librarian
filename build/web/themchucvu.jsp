<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
<!-- Main -->
<main>
    <div class="container-fluid px-4">
        <center><h1 class="mt-4">Thêm chức vụ</h1></center>
        <hr>
        <form class="row g-3">
            <div class="col-md-3 w-100">
              <label for="validationDefault01" class="form-label">Mã chức vụ</label>
              <input type="text" class="form-control" id="validationDefault01" value="CV" required>
            </div>

            <div class="col-md-3 w-100">
              <label for="validationDefault02" class="form-label">Tên chức vụ</label>
              <input type="text" class="form-control" id="validationDefault02" value="" required>
            </div>
            
            <div class="col-md-3 w-100">
                <label for="validationDefault02" class="form-label">Lương</label>
                <input type="number" class="form-control" id="validationDefault02" value="" required>
              </div>
                            
            <div class="col-12">
              <button class="btn btn-primary" type="submit">Thêm chức vụ</button>
            </div>
        </form>

        <div style="height: 32vh"></div>
        <div class="card mb-4"><div class="card-body">When scrolling, the navigation stays at the top of the page. This is the end of the static navigation demo.</div></div>
    </div>
</main>
<%@include file="inc/footer.jsp" %>
                
                                

                <!-- footer -->
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; D2Lib 2022</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>



