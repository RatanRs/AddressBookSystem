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
		AddressBook details = new AddressBook();				
		details.getAddNewContact();
		details.showContact();
        
	}
}
