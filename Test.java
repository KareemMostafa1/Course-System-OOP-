package Course;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> quizzes = new ArrayList<>();
        quizzes.add("Quiz 1");
        quizzes.add("Quiz 2");

        ArrayList<String> instructors = new ArrayList<>();
        instructors.add("John Doe");
        instructors.add("Jane Smith");
        ArrayList<String> students = new ArrayList<>();
        instructors.add("Michal");
        instructors.add("fady");

        ArrayList<String> content = new ArrayList<>();
        content.add("Module 1");
        content.add("Module 2");

        ArrayList<String> weeklyData = new ArrayList<>();
        weeklyData.add("Week 1");
        weeklyData.add("Week 2");

        ArrayList<String> coursePeriod = new ArrayList<>();
        coursePeriod.add("January 2024");
        coursePeriod.add("February 2024");

        double price = 99.99;
        String coursePlatform = "OnlinePlatform";

        OnlineCourse course = new OnlineCourse("Java Programming",
        										"CSE231",
                                                "Learn Java programming language",
                                                quizzes,
                                                instructors,
                                                students,
                                                content,
                                                weeklyData,
                                                coursePeriod,
                                                price,
                                                coursePlatform);
        System.out.println(course.toString());
        
    }
    
}
