package com.emailproject;

public class Main {

    public static void main(String[] args) {

        Email em1 = new Email("Abdul", "Waris");
        em1.setAlternateEmail("warisity@gmail.com");

        System.out.println(em1.showInfo());

    }
}
