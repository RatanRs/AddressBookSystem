package com.bridgelabz;

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

	public static void main(String args[]) {
		System.out.println("Welcome to AddressBook Program");
		AddressBook details = new AddressBook("Ratan", "Sollapure", "Bazar road Hukkeri", "belagavi", "Karnataka", 34567,
				"9087659088", "ratan@123gmail.com");
		System.out.println(details);

	}
}
