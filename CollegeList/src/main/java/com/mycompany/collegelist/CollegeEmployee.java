/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collegelist;

/**
 *
 * @author PAUL
 */
public class CollegeEmployee extends Person {
    private String ssn;
    private double annualSalary;
    private String departmentName;

    public void setEmployeeData(String ssn, double annualSalary, String departmentName) {
        this.ssn = ssn;
        this.annualSalary = annualSalary;
        this.departmentName = departmentName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("SSN: " + ssn);
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Department: " + departmentName);
    }
}

