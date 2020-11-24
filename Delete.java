package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Delete {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/motivity";
String username="root";
String password="root";
Connection connection=DriverManager.getConnection(url, username, password);
System.out.println("Enter the  employees id want to delete");
int eid=sc.nextInt();
String qry="delete from employee where eid=?";
PreparedStatement stmt=connection.prepareStatement(qry);
stmt.setInt(1,eid);
int i=stmt.executeUpdate();
if(i!=0)
{
System.out.println("table deleted successfully");
}
else
{
System.out.println("Table not updated successfully");
}
}
}


