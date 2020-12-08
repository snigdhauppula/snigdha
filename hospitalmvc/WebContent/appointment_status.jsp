<!DOCTYPE html>
<%@page import="com.mvc.AppointmentBean"%>
<html>
<body bgcolor="wheat">
<br><br>
<center><h1>Welcome to Appointment Stauts  Page</h1>
<br><br>
<a href="./patient_home.html">Home</a> |
<a href="./patient_profile.jsp">Profile</a> |
<a href="./appointment.jsp">Appointment</a> |
<a href="appointment_status.jsp">Appointment status</a> |
<a href="./index.html">Logout</a>
</center>
<br><br>
<%@page import="com.mvc.AppointmentBean,java.util.*" %>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Patient Name</td>
			<td>Phone</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Blood_group</td>
			<td>Specialist</td>
			<td>Date of appointment</td>
			<td>Time of appointment</td>
			<td>Doctor Name</td>
			<td>Status</td>
		</tr>
<%
int id=(Integer)session.getAttribute("id");
List<AppointmentBean> l=new AppointmentBean().status(id);
Iterator i=l.iterator();
while(i.hasNext()){
AppointmentBean ab=(AppointmentBean)i.next();
%>
<tr>
			<td><%=ab.getPname() %></td>
			<td><%=ab.getPhone() %></td>
			<td><%=ab.getEmail() %></td>
			<td><%=ab.getGender() %></td>
			<td><%=ab.getBlood_group() %></td>
			<td><%=ab.getSpecialist() %></td>
			<td><%=ab.getDate_of_appointment() %></td>
			<td><%=ab.getTime_of_appointment() %></td>
			<td><%=ab.getDname() %></td>
			<td><%=ab.getStatus() %></td>
		</tr>
<%} %>
</table>
</body>
</html>
