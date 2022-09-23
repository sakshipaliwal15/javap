<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <jsp:include page="Logout.jsp"></jsp:include>
	
	<table align="center">
		<tr>
			<td><a href="createdoc"><input type="submit" value="Insert_Doctor"></a></td>
		</tr>
		<tr>
			<td><a href="deletedoc.jsp"><input type="submit"	value="Remove_Doctor"></a></td>
		</tr>
		<tr>
			<td><a href="updatedoc.jsp"><input type="submit"	value="Update_Doctor"></a></td>
		</tr>
		<tr>
			<td><a href="Doctor"><input type="submit"	value="View_Doctor"></a></td>
		</tr>
		<tr>
			<td><a href="viewpatient.jsp"><input type="submit" value="View_Patient"></a></td>
		</tr>
	</table>
	
	
</body>
</html>