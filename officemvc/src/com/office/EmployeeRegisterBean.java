package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRegisterBean {
	private int eid;
	private String ename;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String designation;
	private int experience;
	private int no_of_leaves_taken;
	private String address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getNo_of_leaves_taken() {
		return no_of_leaves_taken;
	}
	public void setNo_of_leaves_taken(int no_of_leaves_taken) {
		this.no_of_leaves_taken = no_of_leaves_taken;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean register(String ename, String password, String email, long phone, String gender,
			String designation, int experience, int no_of_leaves_taken, String address) throws Exception {
		Connection con=ConnectionEst.connecitvity();		
		String sql="insert into employee(ename,password,email,phone,gender,address,designation,experience,no_of_leaves_taken) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,ename);
		ps.setString(2,password);
		ps.setString(3,email);
		ps.setLong(4, phone);
		ps.setString(5,gender);
		ps.setString(6,address);
		ps.setString(7,designation);
		ps.setInt(8, experience);
		ps.setInt(9, no_of_leaves_taken);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
		
	}
	
}
