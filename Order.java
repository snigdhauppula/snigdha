package com.jnit;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	public class Order {
		public static void main(String[] args) throws ClassNotFoundException, SQLException 
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/motivity";
			String user="root";
			String password="root";
			Connection con=DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Select options->city or name");
			String option=sc.next();
			String qry="Select * from employee order by "+option+";";
			ResultSet set=stmt.executeQuery(qry);
			while(set.next())
			{
				System.out.println(set.getInt(1)+"-"+set.getString(2)+"-"+set.getInt(3)+"-"+set.getString(4));
			}
		}
}
