package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientLoginBean {
private String email,password;

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
 public PatientRegisterBean login(String email,String password) throws Exception {
	 Connection con=ConnectionEx.Conectivity();
	 String sql="select * from patient where email=? and password=?";
	 PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(2, password);
	ps.setString(1, email);
	ResultSet rs=ps.executeQuery();
	PatientRegisterBean prb=new PatientRegisterBean();
	if(rs.next()) {
		prb.setId(rs.getInt("pid"));
		prb.setPname(rs.getString("pname"));
		prb.setPassword(rs.getString("password"));
		prb.setEmail(rs.getString("email"));
		prb.setPhone(rs.getInt("phone"));
		prb.setGender(rs.getString("gender"));
		prb.setAddress(rs.getString("address"));
		return prb;
	}else {
		return null;
	}
 }
}