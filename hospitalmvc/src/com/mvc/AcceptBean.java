package com.mvc;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class AcceptBean {
	public String dname;
	public String status;
	public int aid;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public boolean accept(String dname, int aid) throws Exception {
		Connection  con=ConnectionEx.Conectivity();
		String sql = "update appointment set status=?,dname=? where aid=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Accepted");
		ps.setString(2, dname);
		ps.setInt(3, aid);
		int a = ps.executeUpdate();
		if(a!=0)
			return true;
		else
			return false;
	}
	
}
