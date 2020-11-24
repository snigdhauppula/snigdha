package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Drop {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mysql";
String user="root";
String password="root";
Connection con=DriverManager.getConnection(url, user, password);
if(con!=null)
{
System.out.println("connection established");
}
String query="drop table employee";
Statement st=con.createStatement();
int i=st.executeUpdate(query);
if(i==0)
{
System.out.println("query executed ");
		}
	}
}
