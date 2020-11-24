package com.jnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Insert {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Scanner sc=new Scanner(System.in);
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
System.out.println("Enter employee id");
int eid=sc.nextInt();
System.out.println("enter employee Name");
String ename=sc.next();
System.out.println("enter employee salary");
int esalary=sc.nextInt();
System.out.println("enter company Name");
String company_Name=sc.next();
int x=st.executeUpdate("insert into employee values(4,'NIM',15000,'Motivity') ");
if(x!=0)
{
System.out.println("Record inserted");
}
}
}

