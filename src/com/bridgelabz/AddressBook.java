package com.bridgelabz;

import java.util.Scanner;
/***
 * 
 * @author Admin
 *
 */
public class AddressBook {

	Scanner input = new Scanner(System.in);
	Contact newPerson = new Contact();
/*
 * Created Method To add new Contact details
 */
	public void getAddNewContact() {
		System.out.println("Enter your First_Name");
		newPerson.setFirst_Name(input.next());
		System.out.println("Enter your Last_Name");
		newPerson.setLast_Name(input.next());
		System.out.println("Enter your Address");
		newPerson.setAddress(input.next());
		System.out.println("Enter your City ");
		newPerson.setCity(input.next());
		System.out.println("Enter your State");
		newPerson.setState(input.next());
		System.out.println("Enter your Zip code");
		newPerson.setZip(input.nextInt());
		System.out.println("Enter your Phone_Number");
		newPerson.setPhone_Number(input.next());
		System.out.println("Enter your EmailID");
		newPerson.setEmail(input.next());
	}

	public void showContact() {
		System.out.println(newPerson.toString());
	}
}
