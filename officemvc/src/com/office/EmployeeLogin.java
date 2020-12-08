package com.office;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		EmployeeRegisterBean erb=null;
		try {
			erb=new EmployeeLoginBean().login(email, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
			HttpSession hs=request.getSession();
			if(erb!=null) {
				hs.setAttribute("employeeDetails", erb);
				hs.setAttribute("id", erb.getEid());
				hs.setAttribute("leaves", erb.getNo_of_leaves_taken());
				response.sendRedirect("./employee_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./employee_login.html?msg=login failed");
	
	}

}
