package com.oops.addressbook;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        AddressBookSystem system = new AddressBookSystem();

        System.out.print("Enter Address Book Name: ");
        String bookName = sc.nextLine();

        system.addAddressBook(bookName);

        AddressBook addressBook = system.getAddressBook(bookName);

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
            String phone = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            Contact contact = new Contact(
                    firstName,
                    lastName,
                    address,
                    city,
                    state,
                    zip,
                    phone,
                    email
            );

            addressBook.addContact(contact);

            System.out.print("\nAdd Another Contact? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        system.displayAddressBooks();

        system.buildDictionaries();

// UC14: CSV OPERATIONS
//        CSVFileOperations.writeContacts(addressBook);
//        CSVFileOperations.readContacts();


 // UC15: JSON OPERATIONS
        JSONFileOperations.writeContacts(addressBook);
        JSONFileOperations.readContacts();


        //search
//        System.out.print("\nEnter City: ");
//        String city = sc.nextLine();
//
//        System.out.println("\nPersons in " + city);
//        system.viewPersonsByCity(city);
//
//        System.out.print("\nEnter State: ");
//        String state = sc.nextLine();
//
//        System.out.println("\nPersons in " + state);
//        system.viewPersonsByState(state);
//
//        system.searchPersonByCity(city)
//                .forEach(Contact::display);


        //count
//        System.out.print("\nEnter City to Count Persons: ");
//        String city = sc.nextLine();
//
//        System.out.println("Number of Persons in " + city + " : "
//                + system.getPersonCountByCity(city));
//
//        System.out.print("\nEnter State to Count Persons: ");
//        String state = sc.nextLine();
//
//        System.out.println("Number of Persons in " + state + " : "
//                + system.getPersonCountByState(state));
//
//
//        System.out.println("\nContacts Sorted by Name:");
//
//        addressBook.sortContactsByName();

        //sort
//        System.out.println("\nSort Contacts By");
//        System.out.println("1. City");
//        System.out.println("2. State");
//        System.out.println("3. Zip");
//
//        System.out.print("Enter Choice: ");
//        int option = sc.nextInt();
//
//        switch (option) {
//
//            case 1:
//                System.out.println("\nContacts Sorted By City");
//                addressBook.sortContactsByCity();
//                break;
//
//            case 2:
//                System.out.println("\nContacts Sorted By State");
//                addressBook.sortContactsByState();
//                break;
//
//            case 3:
//                System.out.println("\nContacts Sorted By Zip");
//                addressBook.sortContactsByZip();
//                break;
//
//            default:
//                System.out.println("Invalid Choice");
//        }

        FileOperations.writeContacts(addressBook);

        FileOperations.readContacts();

        sc.close();
    }
}