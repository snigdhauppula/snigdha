package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientUpdateBean {
	private int id;
	private String pname;
	private String password;
	private String email;
	private long phone;
	private String gender;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	public PatientRegisterBean update(int id, String pname, String password, String email, long phone, String gender, String address) throws Exception {
		Connection con = ConnectionEx.Conectivity();
		String sql = "update patient set pname=?,email=?,phone=?,gender=?,address=? where pid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pname);
		ps.setString(2, email);
		ps.setLong(3, phone);
		ps.setString(4, gender);
		ps.setString(5, address);
		ps.setInt(6, id);
		int a = ps.executeUpdate();
		PatientRegisterBean prb = new PatientRegisterBean();
		if (a != 0) {
			sql = "select * from patient where pid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
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
		} else
			return null;
		
	}
}