package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class AddressBookMain {
	/***
	 * 
	 * @param args
	 */
	/*
	 * Created Method to Choose user to add,delete,eidt,display Contacts
	 */
	void openContact() {
		int choice;
		AddressBook addressBook = new AddressBook();
		do {
			Scanner inputChoice = new Scanner(System.in);
			System.out.println(
					"Enter your choice\n1: Add Contact\t2: Edit Contact\n3: Display Contact\t4: Delete Contact");
			choice = inputChoice.nextInt();
			/*
			 * Used switch case for choice
			 */
			switch (choice) {
			case 1:
				addressBook.getContact();
				break;
			case 2:
				addressBook.editContact();
				break;
			case 3:
				System.out.println(addressBook.contactList);
				break;
			case 4:
				addressBook.deleteContact();
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (choice != 5);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		AddressBookMain details = new AddressBookMain();
		details.openContact();
	}
}
