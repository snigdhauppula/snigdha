package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLogic {

	public static void main(String[] args) {
     Configuration cf=new Configuration();
     cf.configure("configuration.xml"); 
		SessionFactory  sf= cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s=(Student) se.get(Student.class, 101);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		s=(Student)se.get("com.motivity.Student", 102);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
	
				se.close();
		sf.close();
	}

}
