package com.oops.addressbook;

import java.util.HashMap;

public class AddressBookSystem {

    private HashMap<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {

        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book Already Exists");
            return;
        }

        addressBooks.put(name, new AddressBook());

        System.out.println("Address Book Created Successfully");
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public void displayAddressBooks() {

        System.out.println("\nAvailable Address Books:");

        for (String name : addressBooks.keySet()) {
            System.out.println(name);
        }
    }
}