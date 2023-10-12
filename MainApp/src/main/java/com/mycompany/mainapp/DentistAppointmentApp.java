/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PAUL
 */
public class DentistAppointmentApp {
    private JFrame frame;
    private JTextField customerNameField;
    private JComboBox<String> dayComboBox;
    private JComboBox<String> timeComboBox;
    private DefaultListModel<String> appointmentListModel;

    public DentistAppointmentApp() {
        frame = new JFrame("Dentist Appointment Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 1));

        customerNameField = new JTextField();
        JLabel nameLabel = new JLabel("Customer Name:");
        JPanel namePanel = new JPanel(new BorderLayout());
        namePanel.add(nameLabel, BorderLayout.WEST);
        namePanel.add(customerNameField, BorderLayout.CENTER);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        dayComboBox = new JComboBox<>(daysOfWeek);
        JLabel dayLabel = new JLabel("Select Day:");
        JPanel dayPanel = new JPanel(new BorderLayout());
        dayPanel.add(dayLabel, BorderLayout.WEST);
        dayPanel.add(dayComboBox, BorderLayout.CENTER);

        List<String> appointmentTimes = generateAppointmentTimes();
        timeComboBox = new JComboBox<>(appointmentTimes.toArray(new String[0]));
        JLabel timeLabel = new JLabel("Select Time:");
        JPanel timePanel = new JPanel(new BorderLayout());
        timePanel.add(timeLabel, BorderLayout.WEST);
        timePanel.add(timeComboBox, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String customerName = customerNameField.getText();
                String selectedDay = (String) dayComboBox.getSelectedItem();
                String selectedTime = (String) timeComboBox.getSelectedItem();
                String appointmentDetails = customerName + " - " + selectedDay + ", " + selectedTime;
                saveAppointmentToFile(appointmentDetails);
                updateAppointmentList();
                clearFields();
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the application
            }
        });

        appointmentListModel = new DefaultListModel<>();
        JList<String> appointmentList = new JList<>(appointmentListModel);
        JScrollPane listScrollPane = new JScrollPane(appointmentList);

        frame.add(namePanel);
        frame.add(dayPanel);
        frame.add(timePanel);
        frame.add(submitButton);
        frame.add(closeButton);
        frame.add(listScrollPane);

        loadAppointmentsFromFile();
        frame.setVisible(true);
    }

    private void saveAppointmentToFile(String appointmentDetails) {
        try (FileWriter writer = new FileWriter("dentist.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            printWriter.println(appointmentDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateAppointmentList() {
        appointmentListModel.clear();
        loadAppointmentsFromFile();
    }

    private void loadAppointmentsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("dentist.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                appointmentListModel.addElement(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        customerNameField.setText("");
        dayComboBox.setSelectedIndex(0);
        timeComboBox.setSelectedIndex(0);
    }

    private List<String> generateAppointmentTimes() {
        List<String> appointmentTimes = new ArrayList<>();
        for (int hour = 8; hour <= 18; hour += 2) {
            for (int minute = 0; minute < 60; minute += 30) {
                String time = String.format("%02d:%02d %s", hour % 12 == 0 ? 12 : hour % 12, minute, hour < 12 ? "AM" : "PM");
                appointmentTimes.add(time);
            }
        }
        return appointmentTimes;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DentistAppointmentApp());
    }
}