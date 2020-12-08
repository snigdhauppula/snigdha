package com.office;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LeaveApplyBean {
	private int lid;
	private String ename;
	private String email;
	private long phone;
	private String gender;
	private int no_of_days;
	private String date_of_leave;
	private String designation;
	private String status;
	private String mname;
	private int eid;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public String getDate_of_leave() {
		return date_of_leave;
	}
	public void setDate_of_leave(String date_of_leave) {
		this.date_of_leave = date_of_leave;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public boolean leave(String ename, String email, long phone, String gender, int no_of_days,
			String date_of_leave, String designation, int eid) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		String sql="insert into leaves(ename,email,phone,gender,no_of_days,date_of_leave,designation,eid) values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, ename);
		ps.setString(2, email);
		ps.setLong(3,phone);
		ps.setString(4,gender);
		ps.setInt(5,no_of_days);
		ps.setString(6, date_of_leave);
		ps.setString(7, designation);
		ps.setInt(8,eid);
		int a=ps.executeUpdate();
		if(a!=0) {
			return true;
		}else
			return false;
	}
	
	public List<LeaveApplyBean> status(int eid) throws Exception {
		Connection con=ConnectionEst.connecitvity();
		PreparedStatement ps = con.prepareStatement("select * from leaves where eid=?");
		ps.setInt(1,eid);
		ResultSet rs = ps.executeQuery();
		List<LeaveApplyBean> l=new ArrayList<>();
		while(rs.next()) {
			LeaveApplyBean lab=new LeaveApplyBean();
			lab.setLid(rs.getInt(1));
			lab.setEname(rs.getString(2));
			lab.setEmail(rs.getString(3));
			lab.setPhone(rs.getLong(4));
			lab.setGender(rs.getString(5));
			lab.setNo_of_days(rs.getInt(6));
			lab.setDate_of_leave(rs.getString(7));
			lab.setDesignation(rs.getString(8));
			lab.setStatus(rs.getString(9));
			lab.setMname(rs.getString(10));
			lab.setEid(rs.getInt(11));
			l.add(lab);
		}
		return l;
	}
	
}
