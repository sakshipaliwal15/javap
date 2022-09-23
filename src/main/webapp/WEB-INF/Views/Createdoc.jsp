<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserted Doctor</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
       <div class="container">
		<div class="row justify-content-center">
			<div>${model.insert }</div>
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">Add Doctor</div>
					<div class="card-body">
					
						<form class="form-horizontal" method="post" action="Doctor">
							<div class="form-group">
								<label for="confirm" class="cols-sm-2 control-label">Doctor's
									Id </label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="id" id="confirm"
											placeholder="Enter Id" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="name" class="cols-sm-2 control-label">Doctor's
									Name</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-user fa" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="name" id="name"
											placeholder="Enter Doctor's Name" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="confirm" class="cols-sm-2 control-label">Contact
									Number </label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="contactNumber"
											id="contactNumber"
											placeholder="Enter Doctor's contact Number" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="email" class="cols-sm-2 control-label">Doctor's
									Email</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="emailId" id="emailId"
											placeholder="Enter Doctor's Email" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="username" class="cols-sm-2 control-label">Username</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-users fa" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="username"
											id="username" placeholder="Enter Username" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="password" class="cols-sm-2 control-label">Password</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="password" class="form-control" name="password"
											id="password" placeholder="Enter Password" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="confirm" class="cols-sm-2 control-label">Specifications
								</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="specification"
											id="specification" placeholder="Enter Specifications" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="confirm" class="cols-sm-2 control-label">Qualification
								</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="qualification"
											id="qualification" placeholder="Enter Qualification" />
									</div>
								</div>
							</div>
							<div class="form-group ">
								<input type="submit"
									class="btn btn-primary btn-lg btn-block login-button"
									value="Add Doc">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>