/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegelist;

/**
 *
 * @author PAUL
 */
public class Faculty extends CollegeEmployee {
    private boolean isTenured;

    public void setFacultyData(boolean isTenured) {
        this.isTenured = isTenured;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tenured: " + (isTenured ? "Yes" : "No"));
    }
}