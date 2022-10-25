<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
  	<title>D2 LIB - Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<link rel="stylesheet" href="css/login.css">

	</head>
	<body>
	<section class="ftco-section" style="background-image: url(assets/img/back.png);">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-3 text-center mb-5">
					<h2></h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-7 col-lg-5">
					<div class="login-wrap p-4 p-md-5">
		      	<div class="icon d-flex align-items-center justify-content-center">
		      		<span class="fa fa-user-o"></span>
		      	</div>
		      	<h3 class="text-center mb-4">Đăng nhập</h3>
                        <p class="text-danger">${mess}</p>
                        <form action="login" method="post" class="login-form">
		      		<div class="form-group">
                                    <input type="text" name="tai_khoan" class="form-control rounded-left" placeholder="Username" required>
		      		</div>
                                <div class="form-group d-flex">
                                  <input type="password" name="mat_khau" class="form-control rounded-left" placeholder="Password" required>
                                </div>
                                <div class="form-group">
                                    <button type="submit" class="form-control btn btn-primary rounded submit px-3">Login</button>
                                </div>
                        </form>
	        </div>
				</div>
			</div>
		</div>
	</section>

<!--	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>-->

	</body>
</html>

