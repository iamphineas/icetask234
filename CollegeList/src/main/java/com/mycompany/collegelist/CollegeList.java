/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collegelist;

import java.util.Scanner;

/**
 *
 * @author PAUL
 */
public class CollegeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[14]; // Array to hold all persons (4 CollegeEmployees, 3 Faculty, and 7 Students)
        int collegeEmployeeCount = 0;
        int facultyCount = 0;
        int studentCount = 0;

        while (true) {
            System.out.println("Enter data for (C)ollege Employee, (F)aculty, (S)tudent, or (Q)uit:");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("Q")) {
                break;
            }

            if (choice.equalsIgnoreCase("C") && collegeEmployeeCount < 4) {
                CollegeEmployee employee = new CollegeEmployee();
                System.out.println("Enter College Employee data:");
                System.out.print("SSN: ");
                String ssn = scanner.nextLine();
                System.out.print("Annual Salary: ");
                double annualSalary = Double.parseDouble(scanner.nextLine());
                System.out.print("Department Name: ");
                String departmentName = scanner.nextLine();
                employee.setData("John", "Doe", "123 Main St", "12345", "123-456-7890");
                employee.setEmployeeData(ssn, annualSalary, departmentName);
                people[collegeEmployeeCount] = employee;
                collegeEmployeeCount++;
            } else if (choice.equalsIgnoreCase("F") && facultyCount < 3) {
                Faculty faculty = new Faculty();
                System.out.println("Enter Faculty data:");
                System.out.print("Is Tenured (true/false): ");
                boolean isTenured = Boolean.parseBoolean(scanner.nextLine());
                faculty.setData("Jane", "Smith", "456 Elm St", "67890", "987-654-3210");
                faculty.setEmployeeData("987-65-4321", 75000.0, "Computer Science");
                faculty.setFacultyData(isTenured);
                people[4 + facultyCount] = faculty;
                facultyCount++;
            } else if (choice.equalsIgnoreCase("S") && studentCount < 7) {
                Student student = new Student();
                System.out.println("Enter Student data:");
                System.out.print("Major: ");
                String major = scanner.nextLine();
                System.out.print("GPA: ");
                double gpa = Double.parseDouble(scanner.nextLine());
                student.setData("Alice", "Johnson", "789 Oak St", "54321", "345-678-9012");
                student.setStudentData(major, gpa);
                people[7 + studentCount] = student;
                studentCount++;
            } else {
                System.out.println("Error: Maximum limit reached for this category.");
            }
        }

        // Display the report
        System.out.println("\nReport:");
        System.out.println("College Employees:");
        if (collegeEmployeeCount == 0) {
            System.out.println("No College Employees entered.");
        } else {
            for (int i = 0; i < collegeEmployeeCount; i++) {
                people[i].display();
                System.out.println();
            }
        }

        System.out.println("Faculty:");
        if (facultyCount == 0) {
            System.out.println("No Faculty members entered.");
        } else {
            for (int i = 4; i < 4 + facultyCount; i++) {
                people[i].display();
                System.out.println();
            }
        }

        System.out.println("Students:");
        if (studentCount == 0) {
            System.out.println("No Students entered.");
        } else {
            for (int i = 7; i < 7 + studentCount; i++) {
                people[i].display();
                System.out.println();
            }
        }

        scanner.close();
    }
}
