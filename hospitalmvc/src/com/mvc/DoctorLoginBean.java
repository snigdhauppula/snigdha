package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorLoginBean {
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
 public DoctorRegisterBean login(String email,String password) throws Exception {
	 Connection con=ConnectionEx.Conectivity();
	 String sql="select * from doctor where email=? and password=?";
	 PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(2, password);
	ps.setString(1, email);
	ResultSet rs=ps.executeQuery();
	DoctorRegisterBean rb=new DoctorRegisterBean();
	if(rs.next()) {
		rb.setId(rs.getInt("did"));
		rb.setDname(rs.getString("dname"));
		rb.setPassword(rs.getString("password"));
		rb.setEmail(rs.getString("email"));
		rb.setPhone(rs.getInt("phone"));
		rb.setGender(rs.getString("gender"));
		rb.setSpecialization(rs.getString("specialization"));
		rb.setExperiance(rs.getInt("experiance"));
		rb.setAddress(rs.getString("address"));
		return rb;
	}else {
		return null;
	}
 }
}