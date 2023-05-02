package com.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="BusReservation")
public class BusReservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
	int Reservation_no;
	@Column(name="name")
      private String name;
	
	@Column(name="Mobile_no")
      private Long Mobile_no;
	@Column(name="Boarding_point")
    private String Boarding_point;
	@Column(name="Alighting_point")
    private String Alighting_point;
    @Column(name="Depature_Date")
      private LocalDate Depature_date;
    @Column(name="Return_Date")
      private LocalDate Return_date;
    @Column(name="Bus_No")
	 private String Bus_No;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Reservation_no")
	private Bus bus;
	public BusReservation()
	{
		
	}
	public BusReservation(String name, Long mobile_no, String boarding_point,
			String alighting_point, LocalDate depature_date, LocalDate return_date, String bus_No) {
		super();
	
		this.name = name;
		Mobile_no = mobile_no;
		Boarding_point = boarding_point;
		Alighting_point = alighting_point;
		Depature_date = depature_date;
		Return_date = return_date;
		Bus_No = bus_No;
	}
	public int getReservation_no() {
		return Reservation_no;
	}
	public void setReservation_no(int reservation_no) {
		Reservation_no = reservation_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile_no() {
		return Mobile_no;
	}
	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}
	public String getBoarding_point() {
		return Boarding_point;
	}
	public void setBoarding_point(String boarding_point) {
		Boarding_point = boarding_point;
	}
	public String getAlighting_point() {
		return Alighting_point;
	}
	public void setAlighting_point(String alighting_point) {
		Alighting_point = alighting_point;
	}
	
	public LocalDate getDepature_date() {
		return Depature_date;
	}
	public void setDepature_date(LocalDate depature_date) {
		Depature_date = depature_date;
	}
	public LocalDate getReturn_date() {
		return Return_date;
	}
	public void setReturn_date(LocalDate return_date) {
		Return_date = return_date;
	}
	public String getBus_No() {
		return Bus_No;
	}
	public void setBus_No(String bus_No) {
		Bus_No = bus_No;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
}