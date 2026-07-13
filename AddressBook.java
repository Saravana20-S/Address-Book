package com.oops.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {

        boolean isDuplicate = contacts.stream()
                .anyMatch(existingContact -> existingContact.equals(contact));

        if (isDuplicate) {
            System.out.println("Duplicate Contact Found. Contact Not Added.");
            return;
        }

        contacts.add(contact);
        System.out.println("Contact Added Successfully");
    }


    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found");
            return;
        }

        for (Contact contact : contacts) {
            contact.display();
            System.out.println("---------------------");
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

    public List<Contact> getContacts() {
        return contacts;
    }

    public void sortContactsByName() {

        contacts.stream()
                .sorted(Comparator.comparing(Contact::getFirstName)
                        .thenComparing(Contact::getLastName))
                .forEach(System.out::println);
    }

    public void sortContactsByCity() {

        contacts.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .forEach(System.out::println);
    }

    public void sortContactsByState() {

        contacts.stream()
                .sorted(Comparator.comparing(Contact::getState))
                .forEach(System.out::println);
    }

    public void sortContactsByZip() {

        contacts.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .forEach(System.out::println);
    }

    public void deleteContact(String firstName) {

        Contact contactToDelete = null;

        for (Contact contact : contacts) {
            if (contact.firstName.equalsIgnoreCase(firstName)) {
                contactToDelete = contact;
                break;
            }
        }

        if (contactToDelete != null) {
            contacts.remove(contactToDelete);
            System.out.println("Contact Deleted Successfully");
        } else {
            System.out.println("Contact Not Found");
        }
    }
}
