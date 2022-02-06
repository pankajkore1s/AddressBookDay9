package com.bridgeLabz.AddressBookDay9;

import java.util.ArrayList;

import java.util.Scanner;

public class EditContact {
	static ArrayList<AddContact> personsList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static int counter;


	public static void addContact() {

		AddContact persons = new AddContact();

		System.out.println("add person details");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter person first name: ");
		persons.setFirstName(sc.nextLine());

		System.out.println("Enter person last name: ");
		persons.setLastName(sc.nextLine());

		System.out.println("Enter phone number: ");
		persons.setPhoneNumber(sc.nextInt());

		System.out.println("Enter the Email id: ");
		persons.setEmail(sc.nextLine());

		System.out.println("Enter address: ");
		persons.setAddress(sc.nextLine());

		System.out.println("Enter city: ");
		persons.setCity(sc.nextLine());

		System.out.println("Enter State name: ");
		persons.setState(sc.nextLine());

		System.out.println("Enter zip: ");
		persons.setZipCode(sc.nextInt());
		personsList.add(persons);
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
				personsList.get(indexOfPerson).setAddress(sc.next());

				System.out.println("Enter new city  ");
				personsList.get(indexOfPerson).setCity(sc.next());

				System.out.println("Enter new zip: ");
				personsList.get(indexOfPerson).setZipCode(sc.nextInt());

				System.out.println("Enter mobile number: ");
				personsList.get(indexOfPerson).setPhoneNumber(sc.nextInt());

				System.out.println("Enter the Email id: ");
				personsList.get(indexOfPerson).setEmail(sc.next());

				personsList.get(indexOfPerson).setFirstName(searchByName);

				System.out.println("Enter Last Name: ");
				personsList.get(indexOfPerson).setLastName(sc.next());
		
				System.out.println();
				System.out.println("COntact Edit completed");
			} else
				System.out.println("No person found with entered Name");
		} else
			System.out.println("There is no contacts to edit in AddressBook");
	}
	static void choices() {

		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Choice 1: AddContact \n 2: EditContact \n 3: Display person's Details  \n 0: Exit ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				System.out.println("Entered person's details are as follows= ");
				editContact();
				break;
			case 3:
				System.out.println(personsList.toString());
				break;
			default:
				System.out.println("Enter number from 1 to 3");
				choice = 4;
				sc.close();
			}
		}
		while (choice < 4);
	}

	public static void main(String[] args) {
		choices();
	}
}

