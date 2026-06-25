package com.oops.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully");
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            contact.display();
            System.out.println("--------------------");
        }
    }

    public void editContact(String firstName) {

        for (Contact contact : contacts) {

            if (contact.firstName.equalsIgnoreCase(firstName)) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter New Address: ");
                contact.address = sc.nextLine();

                System.out.print("Enter New City: ");
                contact.city = sc.nextLine();

                System.out.print("Enter New State: ");
                contact.state = sc.nextLine();

                System.out.print("Enter New Zip: ");
                contact.zip = sc.nextLine();

                System.out.print("Enter New Phone Number: ");
                contact.phoneNumber = sc.nextLine();

                System.out.print("Enter New Email: ");
                contact.email = sc.nextLine();

                System.out.println("Contact Updated Successfully");
                return;
            }
        }

        System.out.println("Contact Not Found");
    }
}
