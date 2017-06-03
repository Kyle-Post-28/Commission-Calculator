/*
Filename: Commission.java
Author: Kyle Post
Date: January 7, 2017
Purpose: Create a Commission class
to calculate the commission everyone
receives after the sale of a house.
*/
import java.math.*;
import java.text.*;
public class Commission{
	//Set the format for the all the currency used. This is a
	//class field to be used in all objects. 
	protected static DecimalFormat currency = new DecimalFormat("$00,000.00");
	// Declare variables used by the class
	private double soldPrice;
	private double totalCommission;
	private double brokersCut;
	private double teamsCut;
	//Default constructor with no parameters
	public Commission (){
		soldPrice = 489000.99;
		totalCommission = 6;
		brokersCut = 30;
		teamsCut = 10;		
	}
	//Constructor with 4 parameters
	public Commission(double price, double commission, double broker, double team) {
		this.soldPrice = price;
		this.totalCommission = commission;
		this.brokersCut = broker;
		this.teamsCut = team;
	}
	//Create a method to calculate your commission
	public double getYourCommission () {
		double totalComm = this.soldPrice * (this.totalCommission/100);
		double brokersComm = totalComm * (this.brokersCut/100);
		double teamsComm = (totalComm - brokersComm) * (this.teamsCut/100);
		double yourCommission = (totalComm - brokersComm) - teamsComm;
		return yourCommission;
	}
	//Create a toString method to present the Commission object as a string
	public String toString(){
		return "\nThe current house sold for: " + currency.format(soldPrice) +
		"\n\t The total commission percentage from this deal is " + totalCommission + "%" +
		"\n\t The Broker's commission percentage is " + brokersCut + "%" +
		"\n\t The Team's commission percentage is " + teamsCut + "%" +
		"\n\t Your final commission check that you recieve is: " + currency.format(getYourCommission());
	}
	//Display the data of the Commission Object
	public void display(){
		System.out.println(this);
	}
}