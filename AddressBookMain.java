package com.oops.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        char choice;

        do {

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            System.out.print("Enter Zip: ");
            String zip = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Contact contact = new Contact(
                    firstName,
                    lastName,
                    address,
                    city,
                    state,
                    zip,
                    phoneNumber,
                    email
            );

            addressBook.addContact(contact);

            System.out.print("\nAdd Another Contact? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');


        System.out.print("\nEnter First Name to Edit: ");
        String editName = sc.nextLine();

        addressBook.editContact(editName);

        System.out.print("\nEnter First Name to Delete: ");
        String deleteName = sc.nextLine();

        addressBook.deleteContact(deleteName);

        System.out.println("\nRemaining Contacts:");
        addressBook.displayContacts();


        sc.close();
    }
}