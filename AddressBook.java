package com.oops.addressbook;

import java.util.ArrayList;

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
}
