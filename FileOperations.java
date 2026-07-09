package com.oops.addressbook;

import java.io.*;

public class FileOperations {

    private static final String FILE_NAME = "AddressBook.txt";

    public static void writeContacts(AddressBook addressBook) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Contact contact : addressBook.getContacts()) {

                writer.write(contact.getFirstName() + "," +
                        contact.getLastName() + "," +
                        contact.getAddress() + "," +
                        contact.getCity() + "," +
                        contact.getState() + "," +
                        contact.getZip() + "," +
                        contact.getPhoneNumber() + "," +
                        contact.getEmail());

                writer.newLine();
            }

            System.out.println("Contacts written to file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void readContacts() {

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            System.out.println("\nContacts from File:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}