package com.mvc;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientRegister extends HttpServlet {
	Connection con = null;
	PreparedStatement ps = null;

	public void init(ServletConfig config) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3307/kims";
		String username = "root";
		String password = "timbu";
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("pname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		long mobile = Long.parseLong(phone);
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		boolean status = false;
		PatientRegisterBean prb = new PatientRegisterBean();
		prb.setPname(pname);
		prb.setPassword(password);
		prb.setEmail(email);
		prb.setPhone(mobile);
		prb.setGender(gender);
		prb.setAddress(address);
		try {
			status = prb.register(pname, password, email, mobile, gender, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (status)
			response.sendRedirect("./patient_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./patient_register.html?msg=registered failed");

	}

}