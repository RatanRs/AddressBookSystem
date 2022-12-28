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
	    HashMap<String,Contact> contactHashMap = new HashMap<>();
	    private int indexOfContact;
	    public void addContact() {
	            System.out.println("Enter the details of contact =>");
	            Contact contact = new Contact();
	            System.out.println("Enter person first name: ");
	            contact.setFirstName(inputContact.next());
	            String result = contact.getFirstName();
	            boolean flag = checkDuplicate(result);
	            if (flag) {
	                System.out.println("Person is already exist");
	            } else {
	                System.out.print("Enter first name:");
	                contact.setFirstName(inputContact.next());
	                System.out.print("Enter last name:");
	                contact.setLastName(inputContact.next());
	                System.out.print("Enter address:");
	                contact.setAddress(inputContact.next());
	                System.out.print("Enter city:");
	                contact.setCity(inputContact.next());
	                System.out.print("Enter state:");
	                contact.setState(inputContact.next());
	                System.out.print("Enter zipcode:");
	                contact.setZipCode(inputContact.next());
	                System.out.print("Enter phone number:");
	                contact.setPhoneNumber(inputContact.next());
	                System.out.print("Enter email:");
	                contact.setEmail(inputContact.next());
	                contactList.add(contact);
	                System.out.println();
	                System.out.println("Contact added");
	            }
	        }
	    public void  displayContact() {
	        for (Contact contact:contactList){
	            System.out.println(contact);
	        }
	    }

	    public void editContact() {
	        System.out.println("Enter contact's First Name you want to edit: ");
	        String searchName = inputContact.next();
	        for (Contact contact:contactList) {
	            if (contact.getFirstName().equals(searchName)) {
	                System.out.print("Enter updated name:");
	                contact.setFirstName(inputContact.next());
	                System.out.print("Enter new last Name: ");
	                contact.setLastName(inputContact.next());
	                System.out.print("Enter new address: ");
	                contact.setAddress(inputContact.next());
	                System.out.print("Enter new city: ");
	                contact.setCity(inputContact.next());
	                System.out.print("Enter new state:");
	                contact.setState(inputContact.next());
	                System.out.print("Enter new zip: ");
	                contact.setZipCode(inputContact.next());
	                System.out.print("Enter phone number: ");
	                contact.setPhoneNumber(inputContact.next());
	                System.out.print("Enter new email");
	                contact.setEmail(inputContact.next());
	                System.out.println();
	                System.out.println("Edit completed");
	            }
	            else{
	                System.out.println("Contact not found with this name ");
	            }
	        }
	    }
	    public void deleteContact(){
	        System.out.print("Enter contact's First Name you want to delete:");
	        String searchName=inputContact.next();
	        for (Contact contact:contactList) {
	            if(contact.getFirstName().equals(searchName)){
	                contactList.remove(contact);
	                System.out.println("Contact deleted");
	                break;
	            }
	            else {
	                System.out.println("Contact not found with this name");
	            }
	        }
	    }
	    private static boolean checkDuplicate(String firstname) {
	        int flag = 0;
	        for (Contact contact : contactList) {
	            if (contact.getFirstName().equals(firstname)) {
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
	        for (Contact c : contactList){
	            if (c.getState().equals(cityName)){
	                contactHashMap.put(cityName,c);
	            }
	        }
	        Predicate<Contact> contactPredicate = t -> t.getCity().equals(cityName);
	        contactList.stream().filter(contactPredicate).forEach(x -> System.out.println(x));
	        System.out.println(contactHashMap.keySet());;

	    }
	    public void viewPersonByState(String stateName){
	        Predicate<Contact> contactPredicate = c->c.getState().equals(stateName);
	        contactList.stream().filter(contactPredicate).forEach(x->contactHashMap.put(stateName,x));
	        contactList.stream().filter(contactPredicate).forEach(x-> System.out.println(x));
	        for (Contact c : contactList){
	            if (c.getState().equals(stateName)){
	                contactHashMap.put(stateName,c);
	            }
	        }
	        System.out.println(contactHashMap.keySet());;


	    }
	    void printHashMap(){
	        System.out.println(contactHashMap.keySet());;
	    }

	    public String toString () {
	        return "contactList= " + contactList;
	    }
	}