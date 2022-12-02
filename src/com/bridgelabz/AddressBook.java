package com.bridgelabz;

public class AddressBook {
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip;
	String phone_Number;
	String email;

	/*
	 * Created Constractor
	 */
	public AddressBook(String first_Name, String last_Name, String address, String city, String state, int zip,
			String phone_Number, String email) {
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_Number = phone_Number;
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBook= [first_Name=" + first_Name + ", \nlast_Name=" + last_Name + ",\naddress=" + address
				+ ", \ncity=" + city + ", \nstate=" + state + ", \nzip=" + zip + ", \nphone_Number=" + phone_Number
				+ ", \nemail=" + email + "]";
	}

}
