<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Profile Page</h1>
		<br> <br> <a href="patient_home.html">Home</a> | <a
			href="patient_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.mvc.PatientRegisterBean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Action</td>
		</tr>

		<%
			PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
		if (prb!=null) {
		%>
		<tr>
			<td><%=prb.getId()%></td>
			<td><%=prb.getPname()%></td>
			<td><%=prb.getEmail()%></td>
			<td><%=prb.getPhone()%></td>
			<td><%=prb.getGender()%></td>
			<td><%=prb.getAddress()%></td>
			<td><a
				href="update_patient_profile.jsp?id=<%=prb.getId()%>">update</a>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
