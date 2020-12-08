<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Manager Profile Update Page</h1>
		<a href="./manager_home.html">Home</a> | <a
			href="./manager_profile.jsp">Profile</a> | <a href="./index.html">logout</a>
	</center>
	<br>
	<br>
	<%@page import="com.office.ManagerRegisterBean" %>
	<%
	   ManagerRegisterBean mrb=(ManagerRegisterBean)session.getAttribute("managerDetails");
	if (mrb!=null) {
	%>
	<form action="./manager_update" method="post" align="center">
	<input type="hidden" name="id" value="<%=mrb.getMid()%>">
<input type="text" name="mname" value="<%=mrb.getMname()%>"><br><br>
<input type="email" name="email" value="<%=mrb.getEmail()%>"><br><br>
<input type="number" name="phone" value="<%=mrb.getPhone()%>"><br><br>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female<br><br>
<input type="number" name="experience" value="<%=mrb.getExperience()%>"><br><br>
<textarea rows="15" cols="15" name="address"><%=mrb.getAddress()%></textarea><br><br>
<select name="designation">
<option <%=mrb.getDesignation()%>><%=mrb.getDesignation()%></option>
<option vlaue="Team Manger">Team Manager </option>
<option vlaue="Project Manger">Project Manager </option>
</select><br><br>
<input type="submit" value="update">
	<%
		}
	%>
</body>
</html>