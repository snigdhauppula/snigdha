<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Profile Page</h1>
		<br> <br> <a href="doctor_home.html">Home</a>| <a
			href="doctor_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br><br>
	<%@page import="com.mvc.DoctorRegisterBean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Specialization</td>
			<td>Experience</td>
			<td>Address</td>
			<td>Action</td>
		</tr>
		<%
			DoctorRegisterBean rb=(DoctorRegisterBean) session.getAttribute("doctorDetails");
		%>
		<tr>
			<td><%=rb.getId()%></td>
			<td><%=rb.getDname()%></td>
			<td><%=rb.getEmail()%></td>
			<td><%=rb.getPhone()%></td>
			<td><%=rb.getGender()%></td>
			<td><%=rb.getSpecialization()%></td>
			<td><%=rb.getExperiance()%></td>
			<td><%=rb.getAddress()%></td>
			<td><a href="update_doctor_profile.jsp?id=<%=rb.getId()%>">update</a></td>
		</tr>
	</table>
</body>
</html>
