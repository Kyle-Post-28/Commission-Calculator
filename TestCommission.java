/*
Filename: TestCommission.java
Author: Kyle Post
Date: January 7, 2017
Purpose: This application is going
to create multiple Commission objects
and then calculate and display your commission
*/

public class TestCommission{
	public static void main(String[] args){
		//Create Commission object with default constructor
		Commission house1 = new Commission();
		//Create more Commission objects with parameters
		Commission house2 = new Commission(679999, 5, 30, 7);
		Commission house3 = new Commission(950389.67, 5.5, 40, 10);
		Commission house4 = new Commission(328000.79, 6, 55, 5);
		//Display all the new objects
		house1.display();
		house2.display();
		house3.display();
		house4.display(); 
	}
}