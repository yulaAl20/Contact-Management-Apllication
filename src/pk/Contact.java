/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pk;

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String notes;
    private String contactType;

    // Constructor
    public Contact(String name, String phoneNumber, String email, String address, String notes, String contactType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.notes = notes;
        this.contactType = contactType;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getnotes() {
        return notes;
    }
    
    public String getContactType() {
        return contactType;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setnotes(String ID_no) {
        this.notes = notes;
    }
    
     public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}


