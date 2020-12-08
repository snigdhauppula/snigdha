package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class DoctorRegisterBean {
	private int id;
	private String dname;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String specialization;
	private int experiance;
	private String address;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean register(String dname, String password, String email, long phone, String gender, String specialization,
			int experiance, String address) throws Exception {
		Connection con=ConnectionEx.Conectivity();
		String sql="insert into doctor(dname,password,email,phone,gender,specialization,experiance,address) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, dname);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, phone);
		ps.setString(5,gender);
		ps.setString(6, specialization);
		ps.setInt(7, experiance);
		ps.setString(8, address);
		int a=ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
}