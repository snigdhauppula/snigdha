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

public class PatientUpdate extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String pname=request.getParameter("pname");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		boolean status=false;
		PatientUpdateBean pub=new PatientUpdateBean();
		pub.setId(id);
		pub.setPname(pname);
		pub.setEmail(email);
		pub.setPhone(mobile);
		pub.setGender(gender);
		pub.setAddress(address);
		HttpSession hs=request.getSession();
		PatientRegisterBean prb=null;
		try {
			prb = pub.update(id, pname, password, email, mobile, gender, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(prb!=null) {
			    hs.setAttribute("patientDetails", prb);
			    response.sendRedirect("patient_profile.jsp?msg=updated sucessfully");
		}else
			response.sendRedirect("./update_patient_profile.jsp?msg=updated failed");
	}

}