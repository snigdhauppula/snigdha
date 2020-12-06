<html>
<body bgcolor="pink">
<br><br><br>
<center><h1>WELCOME TO Patient profile Page</h1></center>
<br><br><br>
<center>
<a href="patient_profile.jsp">Profile</a>
<a href="index.html">Logout</a>
<br><br><br>
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
 ps=con.prepareStatement("select * from patient where id=?");
 ps.setInt(1,id);
  ResultSet rs=ps.executeQuery();
  if(rs.next()){
  %>
  <form action="./patient_profile_update.jsp" align="center">
   <input type="text" name="id" value="<%=rs.getInt("id")%>">
 <input type="text" name="name" value="<%=rs.getString("name")%>">
 <input type="email" name="email" <%=rs.getString("email")%>">
 <input type="number" name="phone" <%=rs.getInt("phone")%>">

 <input type="submit" value="update">
 </form>
 <%} %>
