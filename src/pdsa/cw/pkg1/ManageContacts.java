/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdsa.cw.pkg1;

public class ManageContacts {
    private Node root;

    class Node {
        Contact contact;
        Node left;
        Node right;

        public Node(Contact contact) {
            this.contact = contact;
            left = null;
            right = null;
        }
    }

    public void addContact(Contact contact) {
        root = addContactRecursive(root, contact);
    }

    private Node addContactRecursive(Node root, Contact contact) {
        if (root == null) {
            return new Node(contact);
        }

        if (contact.getName().compareToIgnoreCase(root.contact.getName()) < 0) {
            root.left = addContactRecursive(root.left, contact);
        } else if (contact.getName().compareToIgnoreCase(root.contact.getName()) > 0) {
            root.right = addContactRecursive(root.right, contact);
        } else {
            root.contact = contact;
        }

        return root;
    }

    public void displayContacts() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println("Name: " + root.contact.getName());
            System.out.println("Phone Number: " + root.contact.getPhoneNumber());
            System.out.println("Email: " + root.contact.getEmail());
            System.out.println("Address: " + root.contact.getAddress());
            System.out.println("ID: " + root.contact.getID());
            System.out.println("-----------------------");
            inOrderTraversal(root.right);
        }
    }

    public Contact searchContactByName(String name) {
        return searchContactByNameRecursive(root, name);
    }

    private Contact searchContactByNameRecursive(Node root, String name) {
        if (root == null || root.contact.getName().equalsIgnoreCase(name)) {
            return root == null ? null : root.contact;
        }

        if (name.compareToIgnoreCase(root.contact.getName()) < 0) {
            return searchContactByNameRecursive(root.left, name);
        } else {
            return searchContactByNameRecursive(root.right, name);
        }
    }

    public Contact searchContactByID(String ID) {
        return searchContactByIDRecursive(root, ID);
    }

    private Contact searchContactByIDRecursive(Node root, String ID) {
        if (root == null || root.contact.getID().equals(ID)) {
            return root == null ? null : root.contact;
        }

        if (ID.compareTo(root.contact.getID()) < 0) {
            return searchContactByIDRecursive(root.left, ID);
        } else {
            return searchContactByIDRecursive(root.right, ID);
        }
    }

    public void editContact(Contact oldContact, Contact newContact) {
        root = editContactRecursive(root, oldContact, newContact);
    }

    private Node editContactRecursive(Node root, Contact oldContact, Contact newContact) {
        if (root == null) {
            return null;
        }

        if (root.contact.equals(oldContact)) {
            root.contact = newContact;
        } else if (oldContact.getName().compareToIgnoreCase(root.contact.getName()) < 0) {
            root.left = editContactRecursive(root.left, oldContact, newContact);
        } else {
            root.right = editContactRecursive(root.right, oldContact, newContact);
        }

        return root;
    }

    public void deleteContact(Contact contact) {
        root = deleteContactRecursive(root, contact);
    }

    private Node deleteContactRecursive(Node root, Contact contact) {
        if (root == null) {
            return null;
        }

        if (contact.getName().compareToIgnoreCase(root.contact.getName()) < 0) {
            root.left = deleteContactRecursive(root.left, contact);
        } else if (contact.getName().compareToIgnoreCase(root.contact.getName()) > 0) {
            root.right = deleteContactRecursive(root.right, contact);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.contact = minValue(root.right);

            root.right = deleteContactRecursive(root.right, root.contact);
        }

        return root;
    }

    private Contact minValue(Node root) {
        Contact minv = root.contact;
        while (root.left != null) {
            minv = root.left.contact;
            root = root.left;
        }
        return minv;
    }
}
