package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Select {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/motivity";
String username="root";
String password="root";
Connection connection=DriverManager.getConnection(url, username, password);
System.out.println(connection);
if(connection!=null)
{
System.out.println("Connection established");
}
Statement st=connection.createStatement();
System.out.println(st);
ResultSet rs=st.executeQuery("select *from employee");
if(rs.next())
{
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
}
}
}
