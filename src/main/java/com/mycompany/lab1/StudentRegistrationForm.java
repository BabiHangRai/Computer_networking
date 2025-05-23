/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student {
    String name, address, contact, faculty, level, email;

    public Student(String name, String address, String contact, String faculty, String level, String email) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.faculty = faculty;
        this.level = level;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Contact: " + contact +
                ", Faculty: " + faculty + ", Level: " + level + ", Email: " + email;
    }
}

public class StudentRegistrationForm {
    private JFrame frame;
    private JTextField nameField, addressField, contactField, levelField, emailField;
    private JComboBox<String> facultyBox;
    private ArrayList<Student> studentList;

    public StudentRegistrationForm() {
        frame = new JFrame("Student Registration Form");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(7, 2, 10, 10));

        // Create Labels and Fields
        frame.add(new JLabel("Name:"));
        nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Address:"));
        addressField = new JTextField();
        frame.add(addressField);

        frame.add(new JLabel("Contact:"));
        contactField = new JTextField();
        frame.add(contactField);

        frame.add(new JLabel("Faculty:"));
        String[] faculties = {"Science", "Arts", "Commerce", "Engineering"};
        facultyBox = new JComboBox<>(faculties);
        frame.add(facultyBox);

        frame.add(new JLabel("Level:"));
        levelField = new JTextField();
        frame.add(levelField);

        frame.add(new JLabel("Email:"));
        emailField = new JTextField();
        frame.add(emailField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);

        studentList = new ArrayList<>();

        // Button Action Listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capture input
                String name = nameField.getText();
                String address = addressField.getText();
                String contact = contactField.getText();
                String faculty = (String) facultyBox.getSelectedItem();
                String level = levelField.getText();
                String email = emailField.getText();

                // Create Student object and store it
                Student student = new Student(name, address, contact, faculty, level, email);
                studentList.add(student);

                // Display stored students in console
                System.out.println("\nStored Students:");
                for (Student s : studentList) {
                    System.out.println(s);
                }

                // Clear fields after submission
                nameField.setText("");
                addressField.setText("");
                contactField.setText("");
                levelField.setText("");
                emailField.setText("");
                facultyBox.setSelectedIndex(0);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
