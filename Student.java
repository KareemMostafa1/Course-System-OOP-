/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.online_course_system;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHALID
 */

public class Student extends Person {
    private String id;
    private final List<Course> courses;
//    private String studentStatus;
    
    private static ArrayList<Student> AllStudents ;

    // Constructor
    public Student(String name, String num, String address, String gender, String nationality, String id, String studentStatus) {
        super(name, num, address, gender, nationality);
        setId(id);
        setStudentStatus(studentStatus);
        this.courses = new ArrayList<>();
        
        AllStudents.add(new Student(String name, String num, String address, String gender, String nationality, String id, String studentStatus));
    }

    // Getters and Setters
    
    public void setId(String id) throws IllegalArgumentException{
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid ID: ID cannot be empty.");
        }
        this.id = id;
    }
        
//    public void setStudentStatus(String studentStatus) throws IllegalArgumentException{
//        if (studentStatus == null || (!studentStatus.equalsIgnoreCase("rich") && 
//                                      !studentStatus.equalsIgnoreCase("middle") && 
//                                      !studentStatus.equalsIgnoreCase("poor"))) {
//            throw new IllegalArgumentException("Invalid student status: Status must be 'rich', 'middle', or 'poor'.");
//        }
//        this.studentStatus = studentStatus;
//    }

    public String getStudentStatus() {
        return studentStatus;
    }

    // Methods for course management
    public void addCourse(Course course) {
        if(course instanceof InteractiveCourse) {
        	if(course.getStudents().length() < course.maxNoOfStudents) {
        		courses.add(course); //add this course to the arraylist of student's courses
        		course.getStudents().add(this);  //add this student to the arraylist of the course's students
        		course.setSeatsAvailable(course.getMaxNoOfStudents()-course.getStudents().length());//decrement available seats((((((getMaxNoOfStudents is yet to be implemented)))))))))))
        	}
        	else {
        		System.out.println("Sorry, the course is curruntly full");
        	}
        }
        else { //if it is not an interactive course then we will do the registration process immediatley
        	courses.add(course); //add this course to the arraylist of student's courses
        	course.getStudents().add(this); //if it wasn't an interactive class 
        }
    }    
    public void removeCourse(Course course) {
        
        if(courses.contains(course)) {
            this.courses.remove(course);		//remove this course from the arraylist of the student's courses
            course.getStudents().remove(this);	//remove this student from the course's arraylist of students	
            
        }    
        else 
        	throws new IllegalArgumentException("passed Course does not exist in student's courses");
        
    }

    public void showStudentCourses() {
    	System.out.println("the student courses are :");
        for(int i; i<courses.length();i++) {
        	
    		System.out.println(i+1 +")  " +courses.get(i).getName());
        }
    }

    @Override
    public String toString() {
    	return "Name: " + name + "\n" +
                "Number: " + mobile_number + "\n" +
                "Address: " + address + "\n" +
                "Gender: " + gender + "\n" +
                "Nationality: " + nationality + "\n" +
                "Student ID: " + id + "\n" +
                "Student Status: " + studentStatus + "\n" +
                "Courses: " + courses;
    }
}