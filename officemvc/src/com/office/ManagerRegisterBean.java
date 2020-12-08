package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManagerRegisterBean {
	private int mid;
	private String mname;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String address;
	private int experience;
	private String designation;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean register(String mname, String password, String email, long phone, String gender, String address,
			int experience, String designation) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="insert into manager(mname,password,email,phone,gender,address,experience,designation) values(?,?,?,?,?,?,?,?)";
		PreparedStatement	ps=con.prepareStatement(sql);
		ps.setString(1,mname);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setLong(4, phone);
		ps.setString(5,gender);
		ps.setString(6,address);
		ps.setInt(7, experience);
		ps.setString(8, designation);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}
	
}