/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.financialaidavailable;

/**
 *
 * @author Joe Amin
 */
public interface CourseProvider {
    Course getCourseById(String courseId);
    
    Course searchCourse(String keyword);
    
}

