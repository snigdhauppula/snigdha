<!DOCTYPE html>
<html>
<body bgcolor="wheat">
	<br>
	<br>
	<center>
		<h1>Welcome to Patient Update Page</h1>
		<br> <br> <a href="patient_home.html">Home</a> | <a
			href="patient_profile.jsp">Profile</a> | <a href="index.html">Logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.mvc.PatientRegisterBean" %>
	<%
	PatientRegisterBean prb=(PatientRegisterBean)session.getAttribute("patientDetails");
	if (prb!=null) {
	%>
	<form action="./patient_update" method="post" align="center">
		<input type="hidden" name="id" value="<%=prb.getId()%>">
		<input type="text" name="pname" value="<%=prb.getPname()%>"><br>
		<br> <input type="email" name="email" value="<%=prb.getEmail()%>"><br> <br> 
		<input type="number" name="phone" value="<%=prb.getPhone()%>"><br>
		<br> <input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female<br>
		<br>
		<textarea rows="15" cols="15" name="address"><%=prb.getAddress()%></textarea>
		<br> <br> <input type="submit" value="update">
	</form>
	<%
		}
	%>
	</table>
</body>
</html>
