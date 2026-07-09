package com.oops.addressbook;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Contact> searchPersonByCity(String city) {

        return addressBooks.values()
                .stream()
                .flatMap(addressBook -> addressBook.getContacts().stream())
                .filter(contact -> contact.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchPersonByState(String state) {

        return addressBooks.values()
                .stream()
                .flatMap(addressBook -> addressBook.getContacts().stream())
                .filter(contact -> contact.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());
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