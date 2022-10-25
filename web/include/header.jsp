
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>D2 LIB - QLTV</title>
        <link rel="icon" type="image/png" href="assets/img/favicon.ico">
        <link href="css/styles.css" rel="stylesheet"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>

         <!-- bootstrap core css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
        <!-- font awesome style -->
        <link href="css/font-awesome.min.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="css/styles.css" rel="stylesheet" />
        <!-- responsive style -->
        <link href="css/responsive.css" rel="stylesheet" />
    </head>
    <body>
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="index.jsp">D2 LIB</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">Settings</a></li>
                        <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="login.jsp">Login</a></li>
                        <li><a class="dropdown-item" href="#!">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="index.jsp">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Trang chủ
                            </a>

                            <div class="sb-sidenav-menu-heading">Tài khoản</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Quản lý tài khoản
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="tkload">Danh sách tài khoản</a>
                                    <a class="nav-link" href="ltkload">Loại tài khoản</a>
                                </nav>
                            </div>

                            <div class="sb-sidenav-menu-heading">Quản lý</div>
                            <a class="nav-link" href="sachload">
                                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                                Quản lý sách
                            </a>
                            <a class="nav-link" href="dgload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-user"></i></i></div>
                                Quản lý độc giả
                            </a>
                            <a class="nav-link" href="nvload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-user-check"></i></div>
                                Quản lý nhân viên
                            </a>
                            <a class="nav-link" href="pmload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-book"></i></div>
                                Quản lý phiếu mượn
                            </a>
                            <a class="nav-link" href="ppload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-book"></i></div>
                                Quản lý phiếu phạt
                            </a>
                            
                            <a class="nav-link" href="ptload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-book"></i></div>
                                Quản lý phiếu trả
                            </a>

                            <a class="nav-link" href="thedgload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-file-signature"></i></div>
                                Lập thẻ đọc giả
                            </a>

                            <a class="nav-link" href="hdload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-file-invoice-dollar"></i></div>
                                Quản lý hoá đơn
                            </a>
                            
                            
                            
                            <div class="sb-sidenav-menu-heading">Nghiệp vụ</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages" aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-briefcase"></i></div>
                                Nghiệp vụ
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth">
                                        <i class="fa-solid fa-book"></i>ㅤNghiệp vụ sách
                                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                                    </a>
                                    <div class="collapse" id="pagesCollapseAuth" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                                        <nav class="sb-sidenav-menu-nested nav">
                                            <a class="nav-link" href="nxbload"><i class="fa-solid fa-user-gear"></i>ㅤNhà xuất bản</a>
                                            <a class="nav-link" href="tacgiaload"><i class="fa-solid fa-user-group"></i>ㅤTác giả</a>
                                            <a class="nav-link" href="tlload"><i class="fa-solid fa-book"></i>ㅤThể loại</a>
                                        </nav>
                                    </div>
                                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseError" aria-expanded="false" aria-controls="pagesCollapseError">
                                        <i class="fa-solid fa-user"></i>ㅤNghiệp vụ NV
                                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                                    </a>
                                    <div class="collapse" id="pagesCollapseError" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                                        <nav class="sb-sidenav-menu-nested nav">
                                            <a class="nav-link" href="chucvuload"><i class="fa-solid fa-users"></i>ㅤChức vụ</a>
                                        </nav>
                                    </div>
                                </nav>
                            </div>

                            <a class="nav-link" href="lpload">
                                <div class="sb-nav-link-icon"><i class="fa-solid fa-file-invoice-dollar"></i></div>
                                Lệ phí
                            </a>
                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Logged in as:</div>
                        ${tennv}
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">