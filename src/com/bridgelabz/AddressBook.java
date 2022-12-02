package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class AddressBook {
	List<Contact> contactList = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	Contact newPerson = new Contact();

	/*
	 * Created Method To add new Contact details
	 */
	public void getContact() {
		System.out.println("Enter the details of contact =>");
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
		contactList.add(newPerson);
		System.out.println();
		System.out.println("Contact added");
	}

	public void editContact() {
		System.out.println("Enter contact's First Name you want to edit: ");
		String searchName = input.next();
		for (Contact newPerson : contactList) {
			if (newPerson.getFirst_Name().equals(searchName)) {
				System.out.print("Enter updated name:");
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
			}
			else {
				 System.out.println("Contact not found with this name ");
			}
		}
	}
	public void deleteContact(){
		System.out.print("Enter contact's First Name you want to delete:");
		 String searchName=input.next();
		 for (Contact newPerson : contactList) {
			 if(newPerson.getFirst_Name().equals(searchName)){
				 contactList.remove(newPerson);
				 System.out.println("Contact deleted");
	                break;
			 }
			 else {
	                System.out.println("Contact not found with this name");
			 }
		 }
	}
	public String toString() {
		return "contactList= " + contactList;
	}
}
