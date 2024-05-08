/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online_course_system;

import java.util.Arrays;

/**
 *
 * @author KHALID
 */

        
public abstract class Person {
    protected String name;
    protected String mobile_number;
    protected String address;
    protected String gender;
    protected String nationality;

    // Parameterized Constructor 
    public Person(String name, String mobile_number, String address, String gender, String nationality) {
        setName(name);
        setMobile_number(mobile_number);
        setAddress(address);
        setGender(gender);
        setNationality(nationality);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getmMobile_number() {
        return mobile_number;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters with exception handling
    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty() || name.matches(".*\\d.*") || !name.matches("[A-Za-z ]+")) {
            throw new IllegalArgumentException("Invalid name: Name must be non-empty and contain only letters and spaces.");
        }
        this.name = name;
    }

    public void setMobile_number(String mobile_number) throws IllegalArgumentException {
        if (mobile_number == null || !mobile_number.matches("\\+?\\d+")) {
            throw new IllegalArgumentException("Invalid number: Phone number must only contain digits and optionally start with a '+'.");
        }
        this.mobile_number = mobile_number;
    }

    public void setAddress(String address) throws IllegalArgumentException {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Invalid address: Address must be non-empty.");
        }
        this.address = address;
    }

    public void setGender(String gender) throws IllegalArgumentException {
        if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            throw new IllegalArgumentException("Invalid gender: Gender must be either 'male' or 'female'.");
        }
        this.gender = gender;
    }

    public void setNationality(String nationality) throws IllegalArgumentException {
        // Suggesting nationality from a predefined list (example list used here)
        String[] validNationalities = {"United States", "Canada", "United Kingdom", "Australia", "New Zealand"};
        if (!Arrays.asList(validNationalities).contains(nationality)) {
            throw new IllegalArgumentException("Invalid nationality: Nationality must be from the predefined list.");
        }
        this.nationality = nationality;
    }

    // Override toString method to return person's information
    @Override
    public abstract String toString() {
        return "Name: " + name + "\n" +
               "Number: " + mobile_number + "\n" +
               "Address: " + address + "\n" +
               "Gender: " + gender + "\n" +
               "Nationality: " + nationality;
    }
}

