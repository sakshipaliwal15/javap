<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Doctor List</title>
</head>
<body>
     <jsp:include page="Admin.jsp"></jsp:include>

	<div class="container" style="padding-top: 50px;">
		<div class="row col-md-6 col-md-offset-2 custyle">
			<table class="table table-striped custab"
				style="border: 2px solid black;">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>emailId</th>
						<th>contact Number</th>
						<th>Specification</th>
						<th>Qualification</th>
						<th class="text-center">Action</th>
					</tr>
				</thead>
				<c:forEach var="doctors" items="${doclist}">
					<tr>
						<td class="text-center">${doctors.getId() }</td>
						<td class="text-center">${doctors.getName() }</td>
						<td class="text-center">${doctors.getEmailId() }</td>
						<td class="text-center">${doctors.getContactNumber() }</td>
						<td class="text-center">${doctors.getSpecification() }</td>
						<td class="text-center">${doctors.getQualification() }</td>
						<td class="text-center">
						   <a class='btn btn-info btn-xs'
							href="Doctor/${doctors.getId() }"><span
								class="glyphicon glyphicon-edit"></span> Edit</a>
								
								 <a href="#"
							class="btn btn-danger btn-xs"><span
								class="glyphicon glyphicon-remove"></span> Delete</a>  </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
     
</body>
</html>