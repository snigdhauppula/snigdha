<!DOCTYPE html>
<html>
<body bgcolor="#E6E6FA">
<br><br>
<center>
<h1>Welcome to Details Page</h1>
<a href="./manager_home.html">Home</a> |
<a href="./manager_profile.jsp">Profile</a> |
<a href="view_leave.jsp">Leave Details</a> |
<a href="./index.html">logout</a>
</center>
<br><br>
<%@page import="com.office.ViewLeaveBean,java.util.*" %>
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
			<td>Action</td>
		</tr>
<%
String designation=(String) session.getAttribute("designation");
List<ViewLeaveBean> l=new ViewLeaveBean().view(designation);
Iterator i=l.iterator();
while(i.hasNext()) {
	ViewLeaveBean lab=(ViewLeaveBean)i.next();	
	int id=lab.getEid();
	List<Integer> num=new ViewLeaveBean().details(id);
		int no_of_leaves_taken=num.get(1),eid=num.get(0);
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
			<%if(lab.getNo_of_days() <20-no_of_leaves_taken){
				if(lab.getStatus().equalsIgnoreCase("Accepted")){ %>
			<td>Accepted</td>
			<%}else{ %>
			<td><a href="./accept_leave?id=<%=lab.getLid()%>&eid=<%=eid %>&no_of_days=<%=lab.getNo_of_days() %>">Accept</a></td>
			<%}
				}else{ %>
					<td><a href="./reject_leave?id=<%=lab.getLid()%>">Reject</a></td>
				<%} %>
		</tr>
		<%}%>
</table>
<br><br>
</body>
</html>
