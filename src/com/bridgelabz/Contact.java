package com.bridgelabz;
/***
 * 
 * @author Admin
 *
 */

public class Contact {

	private String first_Name;
    private String last_Name;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phone_Number;
	private String email;
	/***
	 * 
	 * @return
	 */

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBook= [first_Name=" + first_Name + ", \nlast_Name=" + last_Name + ",\naddress=" + address
				+ ", \ncity=" + city + ", \nstate=" + state + ", \nzip=" + zip + ", \nphone_Number=" + phone_Number
				+ ", \nemail=" + email + "]";
	}

}
