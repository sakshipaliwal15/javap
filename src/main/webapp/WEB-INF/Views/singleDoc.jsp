<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
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
    <div class="container">
		<div class="row justify-content-center">
			<div class="col-md-8">
				<div class="card">
					<div class="card-header">Update Doctor</div>
					<div class="card-body">
						<form class="form-horizontal" method="post" action="Update">
							<div class="form-group">
								<label for="confirm" class="cols-sm-2 control-label">Doctor's
									Id </label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="id" id="confirm"
											value="${doctor.getId() }" />
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
											value="${doctor.getName() }" />
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
											id="contactNumber" value="${doctor.getContactNumber() }" />
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
											value="${doctor.getEmailId() }" />
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
											id="specification" value="${doctor.getSpecification() }" />
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
											id="qualification" value="${doctor.getQualification() }" />
									</div>
								</div>
							</div>
							<div class="form-group ">
								<input type="submit"
									class="btn btn-primary btn-lg btn-block login-button"
									value="Update">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>