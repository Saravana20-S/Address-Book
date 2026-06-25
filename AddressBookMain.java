package com.oops.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

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

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact);

        System.out.println("\nContact Details:");
        addressBook.displayContact();

        sc.close();
    }
}