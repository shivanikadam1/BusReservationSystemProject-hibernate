package com.dao;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Bus;
import com.entity.BusReservation;

import com.utility.hibernateUtility;

public class CreateDetails {
	public  void create()
	{
		  SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
         LocalDate Depature_date=LocalDate.now() ;
         LocalDate Return_date=LocalDate.now() ;
         
         BusReservation br = new BusReservation("tanvi",99864356l,"Banglore","pune",Depature_date,Return_date,"MH 11 9078");
         BusReservation br1 = new BusReservation("Ankit",67584689l,"Hyderabad","Mumbai",Depature_date,Return_date,"MH 14 4067");
         BusReservation br2 = new BusReservation("Srinu",906579087l,"Chennai","Delhi",Depature_date,Return_date,"MH 46 1023");
         BusReservation br3 = new BusReservation("Varshini",98765432l,"Mumbai","Banglore",Depature_date,Return_date,"MH 12 1078");
         
         
      
        
         
         
         
         Bus Bus=new Bus();
         Bus.setBus_No("MH 11 9078");
         Bus.setBus_Type("Non-AC");
         Bus.setSeat_No(22);
         Bus.setAmount(5000);
         
         Bus Bus1=new Bus();
         Bus1.setBus_No("MH 11 9078");
         Bus1.setBus_Type("AC");
         Bus1.setSeat_No(22);
         Bus1.setAmount(2000);
         
         Bus Bus2=new Bus();
         Bus2.setBus_No("MH 11 9078");
         Bus2.setBus_Type("Non-AC");
         Bus2.setSeat_No(22);
         Bus2.setAmount(2000);
         
         Bus Bus3=new Bus();
         Bus3.setBus_No("MH 11 9078");
         Bus3.setBus_Type("AC");
         Bus3.setSeat_No(22);
         Bus3.setAmount(2000);
         
         
         
         br.setBus(Bus);
         session.save(br);

         session.save(Bus);
         
         br1.setBus(Bus1);
         session.save(br1);

         session.save(Bus1);

         br2.setBus(Bus2);
         session.save(br2);

         session.save(Bus2); 

         br3.setBus(Bus3);
         session.save(br3);

         session.save(Bus3);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

         }
}





