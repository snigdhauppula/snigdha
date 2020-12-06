<%@ page import="java.sql.*" %>
<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3307/rainbow";
String user="root";
String password="timbu";
con=DriverManager.getConnection(url, user, password);
int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
long mobile=Long.parseUnsignedLong(phone);
ps=con.prepareStatement("update patient set name=?,email=?,phone=? where id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setLong(3,mobile);
ps.setInt(4,id);
int x=ps.executeUpdate();
if(x!=0)
{
	response.sendRedirect("patient_profile.jsp?msg=updated");
}
%>
