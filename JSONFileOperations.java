package com.oops.addressbook;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONFileOperations {

    private static final String FILE_NAME = "AddressBook.json";

    public static void writeContacts(AddressBook addressBook) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            gson.toJson(addressBook.getContacts(), writer);

            System.out.println("Contacts written to JSON successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readContacts() {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader(FILE_NAME)) {

            Type contactListType = new TypeToken<ArrayList<Contact>>() {}.getType();

            List<Contact> contacts = gson.fromJson(reader, contactListType);

            System.out.println("\nContacts from JSON File:\n");

            if (contacts != null) {
                contacts.forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}