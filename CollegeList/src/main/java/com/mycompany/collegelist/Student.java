/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegelist;

/**
 *
 * @author PAUL
 */
public class Student extends Person {
    private String major;
    private double gpa;

    public void setStudentData(String major, double gpa) {
        this.major = major;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}