package com.motivity;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	public class PatientRegister extends HttpServlet {
		Connection con=null;
		PreparedStatement ps=null;
		public void init(ServletConfig config) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			String url="jdbc:mysql://localhost:3307/rainbow";
			String user="root";
			String password="timbu";
		    try {
				con=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			 String id=request.getParameter("id");
			String name=request.getParameter("name");
		    String password=request.getParameter("password");
		    String email=request.getParameter("email");
		    String phone=request.getParameter("phone");
		    long mobile=Long.parseUnsignedLong(phone);
		    PrintWriter pw=response.getWriter();
		    String sql="insert into patient(id,name,password,email,phone)values(?,?,?,?)";
	        	try {
					ps=con.prepareStatement(sql);
					ps.setString(1, id);
					ps.setString(2, name);
		        	ps.setString(3, password);
		        	ps.setString(4, email);
		        	ps.setLong(5, mobile);
				    int x=ps.executeUpdate();
				    if(x!=0)
                       response.sendRedirect("./patient_login.html?msg=registered");
	        	} catch (SQLException e) {
					e.printStackTrace();
				}
	        	}
		}
