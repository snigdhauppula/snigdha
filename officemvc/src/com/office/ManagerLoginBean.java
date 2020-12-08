package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerLoginBean {
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
	public ManagerRegisterBean login(String email, String password) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="select * from manager where email=? and password = ?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		ManagerRegisterBean mrb=new ManagerRegisterBean();
		if(rs.next()) {
			mrb.setMid(rs.getInt(1));
			mrb.setMname(rs.getString(2));
			mrb.setPassword(rs.getString(3));
			mrb.setEmail(rs.getString(4));
			mrb.setPhone(rs.getLong(5));
			mrb.setGender(rs.getString(6));
			mrb.setAddress(rs.getString(7));
			mrb.setExperience(rs.getInt(8));
			mrb.setDesignation(rs.getString(9));
			return mrb;
		}
		else
			return null;
	}
	
}
