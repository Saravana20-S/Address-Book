package com.oops.addressbook;

public class AddressBook {

    Contact contact;

    public void addContact(Contact contact) {
        this.contact = contact;
    }

    public void displayContact() {
        if (contact != null) {
            contact.display();
        }
    }
}
