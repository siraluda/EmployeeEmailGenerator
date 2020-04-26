package com.emailproject;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int defaultPasswordLength = 10;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "siraluda.com";

    // Constructor to receive first and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department and return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // Generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + this.companySuffix;


    }

    // Ask for department
    private String setDepartment(){
        System.out.println("Hi " + this.firstName + "\nDepartment Codes: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \nPlease enter department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        switch (deptChoice) {
            case 1:
                return "sales.";

            case 2:
                return "dev.";

            case 3:
                return "acc.";

            default:
                return "";
        }

    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
        char[] password = new char[length];

        for (int i=0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);

    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set an alternate email

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change password
    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    // Get email
    public String getEmail() {
        return email;
    }

    // Get mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Get alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Show info of user
    public String showInfo(){

        return  "DISPLAY NAME: " + this.firstName + " " + this.lastName +
                "\nCOMPANY EMAIL: " + getEmail() +
                "\nPASSWORD: " + this.password +
                "\nMAILBOX CAPACITY: " + getMailboxCapacity();

    }
}
