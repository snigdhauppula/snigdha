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
import javax.servlet.http.HttpSession;

public class DoctorUpdate extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
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
		DoctorUpdateBean ub=new DoctorUpdateBean();
		ub.setId(id);
		ub.setDname(dname);
		ub.setEmail(email);
		ub.setPhone(mobile);
		ub.setGender(gender);
		ub.setSpecialization(specialization);
		ub.setExperiance(experiance);
		ub.setAddress(address);
		HttpSession hs=request.getSession();
		DoctorRegisterBean rb=null;
		try {
			rb = ub.update(id, dname, password, email, mobile, gender, specialization, experiance, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(rb!=null) {
			    hs.setAttribute("doctorDetails", rb);
			    response.sendRedirect("doctor_profile.jsp?msg=updated sucessfully");
		}else
			response.sendRedirect("./update_doctor_profile.jsp?msg=updated failed");
	}

}
