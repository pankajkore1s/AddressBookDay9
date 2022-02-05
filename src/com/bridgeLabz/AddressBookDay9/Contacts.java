package com.bridgeLabz.AddressBookDay9;

import java.util.*;

class Contacts {
	public  String firstName,lastName,address,city,state,zip,phoneNumber,emailID;
	public void credientials() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name=");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name=");
		String lastName=sc.nextLine(); 
		System.out.println("Enter Address=");
		String address=sc.nextLine();
		System.out.println("Enter city=");
		String city=sc.nextLine();
		System.out.println("Enter State=");
		String state=sc.nextLine();
		System.out.println("Enter zip code=");
		int zip=sc.nextInt();
		System.out.println("Enter phone number=");
		int phoneNumber=sc.nextInt();
		System.out.println("Enter EmailId=");
		String emailID=sc.nextLine();
		sc.close();
		
	}
	public void printCredientials() {
		System.out.print("FirstName : "+firstName+"\n"+"LastName : "+lastName+"\n"+"Address :"+address+"\n"+
            	"City : "+city+"\n"+"State : "+state+"\n"+"Zip : "+zip+"\n"+
		        "Phone Number : "+phoneNumber+"\n"+"Email : "+emailID);
	}
	public class AddressBookUC1 {
		public static void main (String []args) {
			Contacts person1=new Contacts();
			person1.credientials();
			person1.printCredientials();
		}
	}
}
