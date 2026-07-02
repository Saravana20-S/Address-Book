# Address Book System

A Java-based Address Book application developed using Object-Oriented Programming principles. The application allows users to create and manage multiple address books, each containing multiple contacts with operations such as adding, editing, and deleting contact information.

## Features

- Create an Address Book
- Add a new contact
- Edit an existing contact using the person's name
- Delete a contact using the person's name
- Add multiple contacts to an Address Book
- Create and manage multiple Address Books
- Store Address Books using a `HashMap`
- Store contacts using an `ArrayList`

## Contact Details

Each contact contains the following information:

- First Name
- Last Name
- Address
- City
- State
- ZIP Code
- Phone Number
- Email Address

## Project Structure

```
AddressBookSystem/
├── src/
│   └── com/
│       └── bridgelabz/
│           └── addressbook/
│               ├── AddressBookMain.java
│               ├── AddressBook.java
│               ├── AddressBookSystem.java
│               └── Contact.java
└── README.md
```

## Use Cases Implemented

### UC1
- Create a Contact with personal details.

### UC2
- Add a new Contact to the Address Book using console input.

### UC3
- Edit an existing Contact using the person's first name.

### UC4
- Delete a Contact using the person's first name.

### UC5
- Add multiple Contacts to an Address Book using `ArrayList`.

### UC6
- Create and manage multiple Address Books using `HashMap`.

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework (`ArrayList`, `HashMap`)
- IntelliJ IDEA
- Git & GitHub

## Repository Workflow

```
main
└── address-book
    ├── uc1-create-contact
    ├── uc2-add-contact
    ├── uc3-edit-contact
    ├── uc4-delete-contact
    ├── uc5-multiple-contacts
    └── uc6-multiple-address-books
```

## Learning Outcomes

- Classes and Objects
- Encapsulation
- Object Relationships
- Collections Framework
- Console-Based User Interaction
- Branch-Based Git Workflow
