package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Update {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/motivity";
String username="root";
String password="root";
Connection connection=DriverManager.getConnection(url, username, password);
if(connection!=null)
{
System.out.println("Connection established");
}
Statement st=connection.createStatement();
int x=st.executeUpdate("update  employee set esalary=esalary+10000 where eid in(1,2,3) ");
if(x!=0)
{
System.out.println("Record Updated");
}
}
}
