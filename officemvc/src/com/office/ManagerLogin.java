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

public class ManagerLogin extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password=request.getParameter("password");
		String email=request.getParameter("email");
			ManagerRegisterBean mrb=null;
			try {
				mrb = new ManagerLoginBean().login(email, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
			HttpSession hs=request.getSession();
			if(mrb!=null) {
				hs.setAttribute("managerDetails", mrb);
				hs.setAttribute("id", mrb.getMid());
				hs.setAttribute("designation", mrb.getDesignation());
				hs.setAttribute("mname",mrb.getMname());
				response.sendRedirect("./manager_home.html?msg=login sucessfully");
			}
			else
				response.sendRedirect("./manager_login.html?msg=login failed");
		
	}

}
