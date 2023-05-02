package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.BusReservation;
import com.utility.hibernateUtility;

public class ViewDetails {
	public void view()
	{
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<BusReservation> query1=session.createQuery("from BusReservation");
	         
	        List<BusReservation> result=query1.list();
	         
	         
	       for(BusReservation br:result)
	      {
	       	System.out.println(br.getName()); 
	       	System.out.println(br.getDepature_date());
	       	System.out.println(br.getBus_No());

	         }

		  
		  
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	}

}



