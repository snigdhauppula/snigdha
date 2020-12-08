package com.office;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEst {
	public static Connection connecitvity() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3307/office";
		String username = "root";
		String password = "timbu";
		return DriverManager.getConnection(url, username, password);
	}

}
