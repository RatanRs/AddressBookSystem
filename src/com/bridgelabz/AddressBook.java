package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/***
 * 
 * @author Admin
 *
 */
public class AddressBook {
	static List<Contact> contactList = new ArrayList<>();
	HashMap<String, AddressBook> addressBooks = new HashMap<>();
	Scanner inputContact = new Scanner(System.in);
	Contact newPerson = new Contact();

	/*
	 * Created Method To add new Contact details
	 */
	public void addContact() {
        System.out.println("Enter the details of contact =>");
        Contact contact = new Contact();
        System.out.println("Enter person first name: ");
        contact.setFirst_Name(inputContact.next());
        String result = contact.getFirst_Name();
        boolean flag = checkDuplicate(result);
        if (flag) {
            System.out.println("Person is already exist");
        } else {
            System.out.print("Enter first name:");
            contact.setFirst_Name(inputContact.next());
            System.out.print("Enter last name:");
            contact.setFirst_Name(inputContact.next());
            System.out.print("Enter address:");
            contact.setAddress(inputContact.next());
            System.out.print("Enter city:");
            contact.setCity(inputContact.next());
            System.out.print("Enter state:");
            contact.setState(inputContact.next());
            System.out.print("Enter zipcode:");
            contact.setZip(inputContact.nextInt());
            System.out.print("Enter phone number:");
            contact.setPhone_Number(inputContact.next());
            System.out.print("Enter email:");
            contact.setEmail(inputContact.next());
            contactList.add(contact);
            System.out.println();
            System.out.println("Contact added");
        }
    }

	/**
	 * Created method to edit contact details
	 */
	public void editContact() {
		System.out.println("Enter contact's First Name you want to edit: ");
		String searchName = inputContact.next();
		for (Contact newPerson : contactList) {
			if (newPerson.getFirst_Name().equals(searchName)) {
				System.out.print("Enter updated name:");
				newPerson.setFirst_Name(inputContact.next());
				System.out.println("Enter your Last_Name");
				newPerson.setLast_Name(inputContact.next());
				System.out.println("Enter your Address");
				newPerson.setAddress(inputContact.next());
				System.out.println("Enter your City ");
				newPerson.setCity(inputContact.next());
				System.out.println("Enter your State");
				newPerson.setState(inputContact.next());
				System.out.println("Enter your Zip code");
				newPerson.setZip(inputContact.nextInt());
				System.out.println("Enter your Phone_Number");
				newPerson.setPhone_Number(inputContact.next());
				System.out.println("Enter your EmailID");
			} else {
				System.out.println("Contact not found with this name ");
			}
		}
	}

	/*
	 * Created method to delete contact
	 */
	public void deleteContact() {
		System.out.print("Enter contact's First Name you want to delete:");
		String searchName = inputContact.next();
		for (Contact newPerson : contactList) {
			if (newPerson.getFirst_Name().equals(searchName)) {
				contactList.remove(newPerson);
				System.out.println("Contact deleted");
				break;
			} else {
				System.out.println("Contact not found with this name");
			}
		}
	}
	  public static boolean checkDuplicate(String firstname) {
	        int flag = 0;
	        for (Contact contact :  contactList) {
	            if (contact.getFirst_Name().equals(firstname)) {
	                flag = 1;
	                break;
	            }
	        }
	        return flag == 1;
	    }
	  public void searchNameByStateAndCity(){
	        System.out.println("Enter name of state : ");
	        String stateName = inputContact.next();
	        contactList.stream().filter(c->c.getCity()==stateName).forEach(x-> System.out.println(x));
	    }

	    public void viewPersonByCity(String cityName) {
	        Predicate<Contact> contactPredicate = t->t.getCity().equals(cityName);
	        if (contactList.stream().filter(contactPredicate).equals(true)){
	            contactList.stream().filter(contactPredicate).forEach(x-> System.out.println(x));
	        }else
	            System.out.println("Not exists.");

	    }
	    public void viewPersonByState(String stateName){

	        Predicate<Contact> contactPredicate = c->c.getState().equals(stateName);
	        contactList.stream().filter(contactPredicate).forEach(x-> System.out.println(x));
	    }

	public String toString() {
		return "contactList= " + contactList;
	}
}
