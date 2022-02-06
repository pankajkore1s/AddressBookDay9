package com.bridgeLabz.AddressBookDay9;

import java.util.*;

public class AddContact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	private int phoneNumber;
	private String email;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {

		AddContact person = new AddContact();

		System.out.println("add person detail");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person first name: ");
		person.setFirstName(sc.next());

		System.out.println("Enter person last name: ");
		person.setLastName(sc.next());

		System.out.println("Enter address: ");
		person.setAddress(sc.nextLine());

		System.out.println("Enter city: ");
		person.setCity(sc.nextLine());

		System.out.println("Enter State : ");
		person.setState(sc.nextLine());

		System.out.println("Enter zip code : ");
		person.setZipCode(sc.nextInt());

		System.out.println("Enter phone number: ");
		person.setPhoneNumber(sc.nextInt());

		System.out.println("Enter Email id: ");
		person.setEmail(sc.nextLine());
		sc.close();
		System.out.println("Name : " + person.firstName + " " + person.lastName +"\nAddress : " + person.address+"\nCity : " + person.city
				+"\nState : " + person.state +"\nZipCode : " + person.zipCode +"\nPhone number : " + person.phoneNumber
				+"\nEmail : " + person.email);

	}
}
