<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
     
     
     <div id="login">
		<h3 class="text-center text-primary pt-5">Welcome to Clinic
			Management System</h3>
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6 border border-dark">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="form" action="login" method="post">
							<h3 class="text-center text-info">Login</h3>
							<div class="form-group">
								<label for="username" class="text-info">Username:</label><br>
								<input type="text" name="userName" id="username"
									class="form-control">
							</div>
							<div class="form-group">
								<label for="password" class="text-info">Password:</label><br>
								<input type="password" name="password" id="password"
									class="form-control">
							</div>
							<div class="form-group text-center">
								<label for="User" class="text-secondary"><span>Role
										: </span> <input name="User" type="radio" value="Admin" />Admin <span>
										<input id="role" name="User" type="radio" value="Doctor">Doctor
								</span> <span> <input id="role" name="User" type="radio"
										value="Receptionist">Patient
								</span></label><br> <input type="submit" name="submit"
									class="btn btn-info btn-md" value="Login">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
     
</body>
</html>