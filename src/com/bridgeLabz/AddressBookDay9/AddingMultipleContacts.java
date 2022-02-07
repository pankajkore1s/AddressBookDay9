package com.bridgeLabz.AddressBookDay9;

import java.util.*;

public class AddingMultipleContacts {
	static ArrayList<AddContact> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int counter;
	static int indexOfPerson = 0;

	public static void AddContact() {	
		AddContact person = new AddContact();

		System.out.println("add person detail");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person first name: ");
		person.setFirstName(sc.nextLine());

		System.out.println("Enter person last name: ");
		person.setLastName(sc.nextLine());

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
		personsList.add(person);
		System.out.println();
		System.out.println("New Person added");
		counter++;
	}
	
	static void editContact() {

		if (counter > 0) {
			System.out.println("Enter Person's FirstName you want to edit: ");
			String searchByName = sc.nextLine();

			int indexOfPerson = 0;
			boolean isFoundPerson = false;

			for (int i=0;i<personsList.size();i++){
				if ((personsList.get(i)).getFirstName().equals(searchByName)) {
					isFoundPerson = true;
					indexOfPerson = i;
					break;
				}
			}
			if (isFoundPerson) {

				System.out.print("\nEnter new address: ");
				personsList.get(indexOfPerson).setAddress(sc.nextLine());

				System.out.println("Enter new city  ");
				personsList.get(indexOfPerson).setCity(sc.nextLine());

				System.out.println("Enter new zip: ");
				personsList.get(indexOfPerson).setZipCode(sc.nextInt());

				System.out.println("Enter mobile number: ");
				personsList.get(indexOfPerson).setPhoneNumber(sc.nextInt());

				System.out.println("Enter the Email id: ");
				personsList.get(indexOfPerson).setEmail(sc.nextLine());

				personsList.get(indexOfPerson).setFirstName(searchByName);

				System.out.println("Enter Last Name: ");
				personsList.get(indexOfPerson).setLastName(sc.nextLine());

				System.out.println();
				System.out.println("Contact Edit completed");
			} else
				System.out.println("No person found with entered Name");
		} else
			System.out.println("There is no contacts to edit in AddressBook");
	}
	
	static void deleteContact(){
		if (counter > 0) {
			System.out.println("Enter Person's FirstName you want to delete: ");
			String searchByName = sc.next();

			for (int i=0;i<personsList.size();i++){
				if (personsList.get(i).getFirstName().equals(searchByName)) {
					personsList.remove(i);
					break;
				}
			}
		}
	}
	static void AddMultipleContacts() {
		System.out.println("Enter The Number Of Persons Want To Add To The AddressBook");
		Scanner sc = new Scanner(System.in);
		int noOfPerson = sc.nextInt();
		for (int i=1;i<=noOfPerson;i++) {
			AddContact();
			sc.close();
		}
	}
	static void choices() {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice 1: AddContact \n 2: EditContact \n 3: Display person's Details \n4: Delete \n5: Add Multiple Contact \n 0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				AddContact();
				break;
			case 2:
				System.out.println("Entered person's new details are as follows= ");
				editContact();
				break;
			case 3:
				System.out.println(personsList.toString());
				break;
			case 4:
				deleteContact();
				break;
			case 5:
				AddMultipleContacts();
			default:
				System.out.println("Enter number from 1 to 5");
				choice = 5;
				sc.close();
			}
		}
		while (choice < 6);
	}
	public static void main(String[] args) {
		choices();
	}
}
