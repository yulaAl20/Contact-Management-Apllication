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
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                // Read user input as a string
                String input = scanner.nextLine();

                // Parse the input to an integer
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
                        exit = true;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a valid option (1, 2, or 3).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        scanner.close();
    }
}