/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa.cw.pkg1;

public class ManageContacts {
    private Node head;
    private Node tail;
    private int size;

    class Node {
        Contact contact;
        Node prev;
        Node next;

        public Node(Contact contact) {
            this.contact = contact;
        }
    }

    public void addContact(Contact contact) {
        Node newNode = new Node(contact);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void displayContacts() {
        Node current = head;
        System.out.println("Contacts:");
        while (current != null) {
            System.out.println("Name: " + current.contact.getName());
            System.out.println("Phone Number: " + current.contact.getPhoneNumber());
            System.out.println("Email: " + current.contact.getEmail());
            System.out.println("Address: " + current.contact.getAddress());
            System.out.println("ID: " + current.contact.getID());
            System.out.println("-----------------------");
            current = current.next;
        }
    }
    
    public Contact searchContactByID(String ID) {
        Node current = head;
        while (current != null) {
            if (current.contact.getID().equals(ID)) {
                return current.contact;
            }
            current = current.next;
        }
        return null; // Contact not found
    }
    
    public Contact searchContactByName(String name) {
        Node current = head;
        while (current != null) {
            if (current.contact.getName().equalsIgnoreCase(name)) {
                return current.contact;
            }
            current = current.next;
        }
        return null; // Contact not found
    }
    
    public void editContact(Contact oldContact, Contact newContact) {
        Node current = head;
        while (current != null) {
            if (current.contact == oldContact) {
                current.contact = newContact;
                return;
            }
            current = current.next;
        }
    }
    
    public void deleteContact(Contact contact) {
        Node current = head;
        while (current != null) {
            if (current.contact == contact) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }
    
}
