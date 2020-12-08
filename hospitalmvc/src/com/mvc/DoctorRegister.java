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

public class DoctorRegister extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dname=request.getParameter("dname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String gender=request.getParameter("gender");
		String specialization=request.getParameter("specialization");
		int experiance=Integer.parseInt(request.getParameter("experiance"));
		String address=request.getParameter("address");
		boolean status=false;
		DoctorRegisterBean rb=new DoctorRegisterBean();
		rb.setDname(dname);
		rb.setPassword(password);
		rb.setEmail(email);
		rb.setPhone(mobile);
		rb.setGender(gender);
		rb.setSpecialization(specialization);
		rb.setExperiance(experiance);
		rb.setAddress(address);
		try {
			status=rb.register(dname, password, email, mobile, gender, specialization, experiance, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./doctor_login.html?msg=registered sucessfully");
		else
			response.sendRedirect("./doctor_register.html?msg=registered failed");
	}

}