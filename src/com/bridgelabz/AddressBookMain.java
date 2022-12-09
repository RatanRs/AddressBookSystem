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
	 * Created Method to Choose user to add,adding Multiple
	 * addressBook,delete,eidt,display Contacts
	 */
	void openContact() {
		int choice;
		AddressBook addressBook = new AddressBook();
		AddressBook book1 = new AddressBook();
		AddressBook book2 = new AddressBook();
		AddressBook book3 = new AddressBook();
		addressBook.addressBooks.put("AddressBook1", addressBook);
		addressBook.addressBooks.put("AddressBook2", book1);
		addressBook.addressBooks.put("AddressBook3", book2);
		addressBook.addressBooks.put("AddressBook4", book3);
		do {
			Scanner inputChoice = new Scanner(System.in);
			System.out.println(
					"Enter your choice\n1: Add Contact\t2: Edit Contact\n3: Display Contact\t4: Delete Contact");
			choice = inputChoice.nextInt();
			/*
			 * Used switch case for choice1
			 */
			switch (choice) {
			case 1:
				System.out.println("Enter:\n1:Address Book\t2:Address Book1\n3:Address Book2\t4:Address Book3");
				int chooseAddressBook = inputChoice.nextInt();
				/*
				 * Used If-else condition to check the Result.
				 */
				if (chooseAddressBook == 1) {
					addressBook.getContact();
				} else if (chooseAddressBook == 2) {
					book1.getContact();
				} else if (chooseAddressBook == 3) {
					book2.getContact();
				} else if (chooseAddressBook == 4) {
					book3.getContact();
				} else {
					System.out.println("Option not found");
				}
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
