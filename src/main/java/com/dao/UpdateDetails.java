package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.BusReservation;
import com.utility.hibernateUtility;

public class UpdateDetails {
	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int Reservation_no=sc.nextInt();
		
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  BusReservation br = (BusReservation)session.get(BusReservation.class,Reservation_no);
		  br.setName("Sweety ");
		  br.setBoarding_point("Guragon ");
		  br.setAlighting_point("pune ");
		  br.setBus_No("MH 47 3078");
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}

}


