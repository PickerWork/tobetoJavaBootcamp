package org.example.models;

public class User {
    public User (){

    }
    private int id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;

    public User(int id, String firstName, String lastName, String eMail, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print(){
        System.out.println("ID : " + this.getId() + "\nİsim: " + this.getFirstName() + "\nSoyisim: "
                + this.getLastName() + "\nTelefon Numarası: " + this.getPhoneNumber() + "\nEmail: " + this.geteMail() + "\n----------------------");
    }
}
