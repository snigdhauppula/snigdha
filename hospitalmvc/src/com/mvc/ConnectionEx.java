package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
	public static Connection Conectivity() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/kims";
		String username="root";
		String password="timbu";
		Connection con=DriverManager.getConnection(url, username, password);
         return con;
	}


}
