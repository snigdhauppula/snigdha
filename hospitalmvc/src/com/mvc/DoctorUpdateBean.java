package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorUpdateBean {
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

	public DoctorRegisterBean update(int id, String dname, String password, String email, long phone, String gender,
		String specialization, int experiance, String address) throws Exception {
		Connection con = ConnectionEx.Conectivity();
		String sql = "update doctor set dname=?,email=?,phone=?,gender=?,address=?,specialization=?,experiance=? where did=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dname);
		ps.setString(2, email);
		ps.setLong(3, phone);
		ps.setString(4, gender);
		ps.setString(5, address);
		ps.setString(6, specialization);
		ps.setInt(7, experiance);
		ps.setInt(8, id);
		int a = ps.executeUpdate();
		DoctorRegisterBean rb = new DoctorRegisterBean();
		if (a != 0) {
			sql = "select * from doctor where did=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
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
		} else
			return null;
		
	}
}
