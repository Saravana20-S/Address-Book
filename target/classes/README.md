# Address Book System

A Java-based Address Book application developed using Object-Oriented Programming principles. The application enables users to create and manage multiple address books, maintain contact information, perform search and sorting operations, and store contact data using Java File I/O.

## Features

* Create and manage Address Books
* Add, edit, and delete contacts
* Manage multiple contacts using collections
* Manage multiple Address Books using `HashMap`
* Prevent duplicate contacts
* Search contacts by city or state
* View persons grouped by city or state
* Count contacts by city or state
* Sort contacts by name, city, state, and ZIP code
* Read and write Address Book data using Java File I/O

## Contact Details

Each contact contains the following information:

* First Name
* Last Name
* Address
* City
* State
* ZIP Code
* Phone Number
* Email Address

## Project Structure

```text
AddressBookSystem/
├── src/
│   └── com/
│       └── bridgelabz/
│           └── addressbook/
│               ├── AddressBookMain.java
│               ├── AddressBook.java
│               ├── AddressBookSystem.java
│               ├── Contact.java
│               └── FileOperations.java
└── README.md
```

## Use Cases Implemented

### UC1

* Create a contact with personal details.

### UC2

* Add a new contact to the Address Book using console input.

### UC3

* Edit an existing contact using the person's name.

### UC4

* Delete a contact using the person's name.

### UC5

* Add multiple contacts to an Address Book using `ArrayList`.

### UC6

* Create and manage multiple Address Books using `HashMap`.

### UC7

* Prevent duplicate contacts using overridden `equals()` and Java Streams.

### UC8

* Search persons by city or state across multiple Address Books using Java Streams.

### UC9

* View persons grouped by city or state using dictionaries and Java Streams.

### UC10

* Count contacts by city or state using Java Streams.

### UC11

* Sort contacts alphabetically by person's name using Java Streams.

### UC12

* Sort contacts by city, state, and ZIP code using Java Streams.

### UC13

* Read and write Address Book data using Java File I/O.

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework (`ArrayList`, `HashMap`)
* Java Streams API
* Java File I/O
* IntelliJ IDEA
* Git
* GitHub

## Branch Structure

```text
main
└── address-book
    ├── uc1-create-contact
    ├── uc2-add-contact
    ├── uc3-edit-contact
    ├── uc4-delete-contact
    ├── uc5-multiple-contacts
    ├── uc6-multiple-address-books
    ├── uc7-prevent-duplicate-contact
    ├── uc8-search-person-by-city-state
    ├── uc9-view-persons-by-city-state
    ├── uc10-count-contacts-by-city-state
    ├── uc11-sort-by-person-name
    ├── uc12-sort-by-city-state-zip
    └── uc13-read-write-file-io
```


## Learning Outcomes

- Classes and Objects
- Encapsulation
- Object Relationships
- Collections Framework
- Console-Based User Interaction
- Branch-Based Git Workflow
