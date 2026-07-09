package com.oops.addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookSystem {

    private HashMap<String, AddressBook> addressBooks = new HashMap<>();
    private Map<String, List<Contact>> cityDictionary = new HashMap<>();
    private Map<String, List<Contact>> stateDictionary = new HashMap<>();

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

    public void buildDictionaries() {

        cityDictionary = addressBooks.values()
                .stream()
                .flatMap(addressBook -> addressBook.getContacts().stream())
                .collect(Collectors.groupingBy(contact -> contact.city));

        stateDictionary = addressBooks.values()
                .stream()
                .flatMap(addressBook -> addressBook.getContacts().stream())
                .collect(Collectors.groupingBy(contact -> contact.state));
    }

    public void viewPersonsByCity(String city) {

        List<Contact> persons = cityDictionary.get(city);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No Persons Found");
            return;
        }

        persons.forEach(Contact::display);
    }

    public void viewPersonsByState(String state) {

        List<Contact> persons = stateDictionary.get(state);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No Persons Found");
            return;
        }

        persons.forEach(Contact::display);
    }

    public long getPersonCountByCity(String city) {

        return cityDictionary.getOrDefault(city, new ArrayList<>())
                .stream()
                .count();
    }


    public long getPersonCountByState(String state) {

        return stateDictionary.getOrDefault(state, new ArrayList<>())
                .stream()
                .count();
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