package com.jnit;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		Session se=Config.config();
		Transaction tx=se.beginTransaction();
		tx.commit();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Insert\n 2.Display\n 3.Update\n 4.Delete\n 5.Exit");
		int number=0;
		for(;number<=5;) {
			System.out.println("Enter a number between 1 and 5");
			number=sc.nextInt();
			if(number==1)
				Insert.insert();
			else if(number==2)
				Display.display();
			else if(number==3)
				Update.update();
			else if(number==4)
				Delete.delete();
			else if(number==5) {
				System.out.println("exit");
				System.exit(0);
			}
		
	}

	}

	}


