 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegelist;

/**
 *
 * @author PAUL
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;

    public void setData(String firstName, String lastName, String streetAddress, String zipCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + streetAddress + ", " + zipCode);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
