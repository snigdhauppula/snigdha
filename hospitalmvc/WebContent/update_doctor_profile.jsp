<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Doctor Update Page</h1>
		<br> <br> <a href="doctor_home.html">Home</a> | <a
			href="doctor_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.mvc.DoctorRegisterBean" %>
	<%
		DoctorRegisterBean rb=(DoctorRegisterBean)session.getAttribute("doctorDetails");
		if (rb!=null) {
	%>
	<form action="./doctor_update" method="post" align="center">
		<input type="hidden" name="id" value="<%=rb.getId()%>">
		<input type="text" name="dname" value="<%=rb.getDname()%>"><br>
		<br> <input type="email" name="email"
			value="<%=rb.getEmail()%>"><br> <br> <input
			type="number" name="phone" value="<%=rb.getPhone()%>"><br>
		<br> <input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female<br>
		<br> <select name="specialization">
		 	<option value="<%=rb.getSpecialization()%>"><%=rb.getSpecialization()%></option>
			<option value="Dentist">Dentist</option>
			<option value="Cardio">Cardio</option>
			<option value="ENT">ENT</option>
		</select><br>
		<br> <input type="number" name="experiance" value="<%=rb.getExperiance()%>"><br>
		<br>
		<textarea rows="15" cols="15" name="address"><%=rb.getAddress()%></textarea>
		<br> <br> <input type="submit" value="update">
	</form>
	<%
		}
	%>
	</table>
</body>
</html>
