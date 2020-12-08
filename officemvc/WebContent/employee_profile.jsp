<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Employee Profile Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.office.EmployeeRegisterBean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Designation</td>
			<td>Experience</td>
			<td>No of Leaves Taken</td>
			<td>No of remaining leaves</td>
			<td>Action</td>
		</tr>
	<%
		EmployeeRegisterBean erb=(EmployeeRegisterBean)session.getAttribute("employeeDetails");
	if (erb!=null) {
	%>
	<tr>
		<td><%=erb.getEid()%></td>
		<td><%=erb.getEname()%></td>
		<td><%=erb.getEmail()%></td>
		<td><%=erb.getPhone()%></td>
		<td><%=erb.getGender()%></td>
		<td><%=erb.getAddress()%></td>
		<td><%=erb.getDesignation()%></td>
		<td><%=erb.getExperience()%></td>
		<td><%=erb.getNo_of_leaves_taken() %></td>
		<td><%=20-erb.getNo_of_leaves_taken() %></td>
		<td><a href="update_employee_profile.jsp?id=<%=erb.getEid()%>">update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>