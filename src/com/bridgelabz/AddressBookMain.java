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

	void openContact() {
		int choice;
		AddressBook addressBook = new AddressBook();
		do {
			Scanner inputChoice = new Scanner(System.in);
			System.out.println("Enter your choice\n1: Add\t2: Edit\t3: Display Details");
			choice = inputChoice.nextInt();
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
			default:
				System.out.println("Wrong choice");
			}
		} while (choice < 4);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program");
		AddressBookMain details = new AddressBookMain();
		details.openContact();
	}
}
