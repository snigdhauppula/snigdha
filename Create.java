package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	public class Create{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner  s=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mysql";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		if(con!=null)
		{
			System.out.println("connection established");
		}
		String query="create table student(sid int(10),sname varchar(20),marks int(10),section varchar(10));";
		Statement st=con.createStatement();
		int i=st.executeUpdate(query);
		if(i==0)
		{
			System.out.println("query executed ");
		}

	}
}
