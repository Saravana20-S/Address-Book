package com.oops.addressbook;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileOperations {

    private static final String FILE_NAME = "AddressBook.csv";

    public static void writeContacts(AddressBook addressBook) {

        try (CSVWriter writer = new CSVWriter(new FileWriter(FILE_NAME))) {

            writer.writeNext(new String[]{
                    "First Name",
                    "Last Name",
                    "Address",
                    "City",
                    "State",
                    "Zip",
                    "Phone Number",
                    "Email"
            });

            for (Contact contact : addressBook.getContacts()) {

                writer.writeNext(new String[]{
                        contact.getFirstName(),
                        contact.getLastName(),
                        contact.getAddress(),
                        contact.getCity(),
                        contact.getState(),
                        contact.getZip(),
                        contact.getPhoneNumber(),
                        contact.getEmail()
                });
            }

            System.out.println("Contacts written to CSV successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readContacts() {

        try (CSVReader reader = new CSVReader(new FileReader(FILE_NAME))) {

            String[] line;

            while ((line = reader.readNext()) != null) {

                for (String value : line) {
                    System.out.print(value + "\t");
                }

                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}