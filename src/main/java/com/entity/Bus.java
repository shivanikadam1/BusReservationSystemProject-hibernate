package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bus")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
	private int Reservation_no;
	@Column(name="Bus_No")
	 private String Bus_No;
	@Column(name="Bus_Type")
	 private String Bus_Type;
	@Column(name="Seat_No")
	 private int Seat_No;
	@Column(name="Amount")
    private double Amount;
	public Bus()
	{
		
	}
	public Bus(int reservation_no, String bus_No, String bus_Type, int seat_No, double amount) {
		super();
		Reservation_no = reservation_no;
		Bus_No = bus_No;
		Bus_Type = bus_Type;
		Seat_No = seat_No;
		Amount = amount;
	}
	public int getReservation_no() {
		return Reservation_no;
	}
	public void setReservation_no(int reservation_no) {
		Reservation_no = reservation_no;
	}
	public String getBus_No() {
		return Bus_No;
	}
	public void setBus_No(String bus_No) {
		Bus_No = bus_No;
	}
	public String getBus_Type() {
		return Bus_Type;
	}
	public void setBus_Type(String bus_Type) {
		Bus_Type = bus_Type;
	}
	public int getSeat_No() {
		return Seat_No;
	}
	public void setSeat_No(int seat_No) {
		Seat_No = seat_No;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
}