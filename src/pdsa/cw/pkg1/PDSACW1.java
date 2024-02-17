/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsa.cw.pkg1;

import java.util.Scanner;

public class PDSACW1 {

    public static void main(String[] args) {
        ManageContacts manageContacts = new ManageContacts();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            try {
                System.out.println("Choose an option:");
                System.out.println("1. Add Contact");
                System.out.println("2. Display Contacts");
                System.out.println("3. Search Contact by ID");
                System.out.println("4. Search Contact by Name");
                System.out.println("5. Edit Contact");
                System.out.println("6. Delete Contact");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");

                String input = scanner.nextLine();
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter ID: ");
                        String ID = scanner.nextLine();
                        Contact newContact = new Contact(name, phoneNumber, email, address, ID);
                        manageContacts.addContact(newContact);
                        System.out.println("Contact added successfully!");
                        break;

                    case 2:
                        manageContacts.displayContacts();
                        break;

                    case 3:
                        System.out.print("Enter ID to search: ");
                        String searchID = scanner.nextLine();
                        Contact contactByID = manageContacts.searchContactByID(searchID);
                        if (contactByID != null) {
                            System.out.println("Contact found:");
                            System.out.println("Name: " + contactByID.getName());
                            System.out.println("Phone Number: " + contactByID.getPhoneNumber());
                            System.out.println("Email: " + contactByID.getEmail());
                            System.out.println("Address: " + contactByID.getAddress());
                            System.out.println("ID: " + contactByID.getID());
                            System.out.println("1. Edit Contact");
                            System.out.println("2. Back to Main Menu");
                            System.out.print("Enter your choice: ");
                            int editChoice = Integer.parseInt(scanner.nextLine());
                            switch (editChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    String newName = scanner.nextLine();
                                    System.out.print("Enter new phone number: ");
                                    String newPhoneNumber = scanner.nextLine();
                                    System.out.print("Enter new email: ");
                                    String newEmail = scanner.nextLine();
                                    System.out.print("Enter new address: ");
                                    String newAddress = scanner.nextLine();
                                    System.out.print("Enter new ID: ");
                                    String newID = scanner.nextLine();
                                    Contact updatedContact = new Contact(newName, newPhoneNumber, newEmail, newAddress, newID);
                                    manageContacts.editContact(contactByID, updatedContact);
                                    System.out.println("Contact updated successfully!");
                                    break;
                                case 2:
                                    break; // Back to main menu
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        } else {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter name to search: ");
                        String searchName = scanner.nextLine();
                        Contact contactByName = manageContacts.searchContactByName(searchName);
                        if (contactByName != null) {
                            System.out.println("Contact found:");
                            System.out.println("Name: " + contactByName.getName());
                            System.out.println("Phone Number: " + contactByName.getPhoneNumber());
                            System.out.println("Email: " + contactByName.getEmail());
                            System.out.println("Address: " + contactByName.getAddress());
                            System.out.println("ID: " + contactByName.getID());
                            System.out.println("1. Edit Contact");
                            System.out.println("2. Back to Main Menu");
                            System.out.print("Enter your choice: ");
                            int editChoice = Integer.parseInt(scanner.nextLine());
                            switch (editChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    String newName = scanner.nextLine();
                                    System.out.print("Enter new phone number: ");
                                    String newPhoneNumber = scanner.nextLine();
                                    System.out.print("Enter new email: ");
                                    String newEmail = scanner.nextLine();
                                    System.out.print("Enter new address: ");
                                    String newAddress = scanner.nextLine();
                                    System.out.print("Enter new ID: ");
                                    String newID = scanner.nextLine();
                                    Contact updatedContact = new Contact(newName, newPhoneNumber, newEmail, newAddress, newID);
                                    manageContacts.editContact(contactByName, updatedContact);
                                    System.out.println("Contact updated successfully!");
                                    break;

                                case 2:
                                    break; // Back to main menu
                                default:
                                    System.out.println("Invalid choice!");
                            }
                        } else {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 5:
                        System.out.print("Enter ID of the contact to edit: ");
                        String editID = scanner.nextLine();
                        Contact editContact = manageContacts.searchContactByID(editID);
                        if (editContact != null) {
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            System.out.print("Enter new phone number: ");
                            String newPhoneNumber = scanner.nextLine();
                            System.out.print("Enter new email: ");
                            String newEmail = scanner.nextLine();
                            System.out.print("Enter new address: ");
                            String newAddress = scanner.nextLine();
                            System.out.print("Enter new ID: ");
                            String newID = scanner.nextLine();
                            Contact updatedContact = new Contact(newName, newPhoneNumber, newEmail, newAddress, newID);
                            manageContacts.editContact(editContact, updatedContact);
                            System.out.println("Contact updated successfully!");
                        } else {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 6:
                        System.out.print("Enter ID of the contact to delete: ");
                        String deleteID = scanner.nextLine();
                        Contact deleteContact = manageContacts.searchContactByID(deleteID);
                        if (deleteContact != null) {
                            manageContacts.deleteContact(deleteContact);
                            System.out.println("Contact deleted successfully!");
                        } else {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 7:
                        exit = true;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        scanner.close();
    }
}
