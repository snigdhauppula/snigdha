<!DOCTYPE html>
<%@page import="com.office.LeaveApplyBean"%>
<html>
<body bgcolor="#E6E6FA">
	<br>
	<br>
	<center>
		<h1>Welcome to Leave status Page</h1>
		<a href="./employee_home.html">Home</a> | <a
			href="./employee_profile.jsp">Profile</a> | <a href="leave.jsp">Leave
			Application</a> | <a href="leave_status.jsp">Leave status</a> | <a
			href="./index.html">logout</a>
	</center>
	<br><br>
	<%@page import="com.office.LeaveApplyBean,java.util.*" %>
	<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Employee Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>No of days</td>
			<td>Date of leave</td>
			<td>Desgination</td>
			<td>Manager Name</td>
			<td>Status</td>
			<td>No of leave remaining</td>
		</tr>
		<%
		int id=(Integer)session.getAttribute("id");
		int no_of_leaves_taken=(Integer)session.getAttribute("leaves");
		List<LeaveApplyBean> l=new LeaveApplyBean().status(id);
		Iterator i=l.iterator();
		while(i.hasNext()){
			LeaveApplyBean lab=(LeaveApplyBean)i.next();
		%>
		<tr>
			<td><%=lab.getEname() %></td>
			<td><%=lab.getEmail() %></td>
			<td><%=lab.getPhone() %></td>
			<td><%=lab.getGender() %></td>
			<td><%=lab.getNo_of_days() %></td>
			<td><%=lab.getDate_of_leave() %></td>
			<td><%=lab.getDesignation() %></td>
			<td><%=lab.getMname()%></td>
			<td><%=lab.getStatus() %></td>
			<td><%=20-no_of_leaves_taken %>
		</tr>

		<%
			}
		%>
	</table>
	<br>
	<br>
</body>
</html>