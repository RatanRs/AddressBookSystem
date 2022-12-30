package com.bridgelabz;

import java.util.HashMap;
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
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();

        AddressBook addressBook = new AddressBook();
        int ch;
        do {
            System.out.println("1.Add AddressBook\t" +
                    "2.Display all addressBooks\t" +
                    "3.Search by city 4\t" +
                    "4.Search by state\n " +
                    "5.Add contact in AddressBook\t" +
                    "6.Count Contacts\t" +
                    "7.Sort Entries in AddressBook alphabetically ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter address book name to add : ");
                    String name = scanner.next();
                    if (addressBookHashMap.containsKey(name)) {
                        System.out.println("AddressBook already exists.");
                    } else {
                        addressBookHashMap.put(name, addressBook);
                    }
                    break;
                case 2:
                    System.out.println(addressBookHashMap.keySet());
                    break;
                case 3:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName)) {
                        System.out.println("Enter city name : ");
                        String cityName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName);
                        addressBook.viewPersonByCity(cityName);
                    } else {
                        System.out.println("AddressBook not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        System.out.println("Enter state name : ");
                        String stateName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.viewPersonByCity(stateName);
                        addressBook.printHashMap();

                    } else {
                        System.out.println("AddressBook not found.");
                    }
                case 5:
                    System.out.println("Enter addressBook name to add contact : ");
                    String searchName1 = scanner.next();
                    if (addressBookHashMap.containsKey(searchName1)) {
                        addressBook = addressBookHashMap.get(searchName1);
                        addressBook.addContact();

                    } else {
                        System.out.println("AddressBook not exists.");
                    }
                    break;
                case 6:
                    System.out.println("Enter AddressBook name : ");
                    addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        addressBook = addressBookHashMap.get(addBookName1);
                        long count = addressBook.getCount();
                        System.out.println(count);
                    } else {
                        System.out.println("AddressBook not exists.");
                    }
                    break;
                case 7:
                    System.out.println("Enter AddressBook name : ");
                    addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)) {
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.sortContact();
                    } else {
                        System.out.println("AddressBook not found.");
                    }
                    break;

            }
        } while (ch != 0);
    }
}