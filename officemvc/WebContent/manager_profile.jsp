<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Page</h1>
		<a href="./manager_home.html">Home</a> 
		| <a href="./manager_profile.jsp">Profile</a> 
		| <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.office.ManagerRegisterBean" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>Address</td>
			<td>Experience</td>
			<td>Designation</td>
			<td>Action</td>
		</tr>
	<%
	   ManagerRegisterBean mrb=(ManagerRegisterBean)session.getAttribute("managerDetails");
	if (mrb!=null) {
	%>
	<tr>
		<td><%=mrb.getMid()%></td>
		<td><%=mrb.getMname()%></td>
		<td><%=mrb.getEmail()%></td>
		<td><%=mrb.getPhone()%></td>
		<td><%=mrb.getGender()%></td>
		<td><%=mrb.getAddress()%></td>
		<td><%=mrb.getExperience()%></td>
		<td><%=mrb.getDesignation() %></td>
		<td><a href="update_manager_profile.jsp?id=<%=mrb.getMid()%>">update</a></td>
	</tr>
	<%
		}
	%>
	</table>
</body>
</html>
