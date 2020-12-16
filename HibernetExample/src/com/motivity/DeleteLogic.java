package com.motivity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DeleteLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student st=(Student)se.load(Student.class, 102);
		se.delete(st);;
		tx.commit();
		sf.close();
		se.close();
	
	}

}
