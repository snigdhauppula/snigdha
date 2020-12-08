package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLoginBean {
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeRegisterBean login(String email, String password) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="select * from employee where email=? and password = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		EmployeeRegisterBean erb=new EmployeeRegisterBean();
		if(rs.next()) {
			erb.setEid(rs.getInt(1));
			erb.setEname(rs.getString(2));
			erb.setPassword(rs.getString(3));
			erb.setEmail(rs.getString(4));
			erb.setPhone(rs.getLong(5));
			erb.setGender(rs.getString(6));
			erb.setAddress(rs.getString(7));
			erb.setDesignation(rs.getString(8));
			erb.setExperience(rs.getInt(9));
			erb.setNo_of_leaves_taken(rs.getInt(10));
			return erb;
		}
		else
			return null;
	}
	
	
}