package com.office;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;

public class ManagerUpdate extends HttpServlet {
	
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String mname=request.getParameter("mname");
		String email=request.getParameter("email");
		String number=request.getParameter("phone");
		long phone=Long.parseLong(number);
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		int experience=Integer.parseInt(request.getParameter("experience"));
		String designation=request.getParameter("designation");
		ManagerRegisterBean mrb=null;
		try {
			mrb=new ManagerUpdateBean().update(id, mname, email, phone, gender, address, experience, designation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(mrb!=null) {
			hs.setAttribute("managerDetails", mrb);
			response.sendRedirect("./manager_profile.jsp?msg=updated sucessfully");
		}else
				response.sendRedirect("./update_manager_profile.jsp?id="+id+"msg=update failed");
	}

}