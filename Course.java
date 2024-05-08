package Course;

import java.util.ArrayList;

public abstract class Course {
	protected String name;
	protected String courseId;
	protected String describtion;
	protected Quiz 	quiz;
	protected float Price;  
	protected ArrayList<Instructor> instructors;
	protected ArrayList<String> content;
	protected String weeklyDate;
	protected String coursePeriod;
	protected ArrayList<Student> students;
	
	protected static ArrayList<Course> AllCoursesAvailable;
	protected static int no_Courses;
	
	public Course(String name,String courseId,String describtion,Quiz quiz,float price,ArrayList<Instructor> instructors,ArrayList<Student> students,ArrayList<String> content,String weeklyDate, String coursePeriod)
	{
		setName(name);
		setDescribtion(describtion);
		setQuiz(quizes);
		setPrice(price);
		setInstructors(instructors);
		setContent(content);
		setWeeklyDate(weeklyDate);
		setCoursePeriod(coursePeriod);
		setCourseId(courseId);
		no_Courses++;
		AllCoursesAvailable.add(new Course(name , courseId , describtion , quiz , price , instructors , students , content , weeklyDate , coursePeriod))
	
	
	}




//	public String getName() {
//		return name;
//	}
	public String getCourseId() {
		return courseId;
	}
	public String getDescribtion() {
		return describtion;
	}
//	public Quiz getQuizes() {
//		return quiz;
//	}
//	public ArrayList<Instructor> getInstructor() {
//		return instructors;
//	}
//	public ArrayList<Student> getStudents() {
//		return students;
//	}
//	public ArrayList<String> getContent() {
//		return content;
//	}
	
//	public String getWeeklyDate() {
//		return weeklyDate;
//	}
//	public String getCoursePeriod() {
//		return coursePeriod;
//	}
//	
	
	void setCourseId(String courseId) throws IllegalArgumentException{
	    if (courseId == null || courseId.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.courseId = courseId;
	}
	void setName(String name) {
	    if (name == null || name.isEmpty()) throws IllegalArgumentException{
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.name = name;
	}

	void setDescription(String description) throws IllegalArgumentException{
	    if (description == null || description.isEmpty()) {
	        throw new IllegalArgumentException("Description cannot be null or empty.");
	    }
	    this.describtion = describtion;
	}

	void setQuiz(Quiz quiz) throws IllegalArgumentException{
	    if (quiz == null) {
	        throw new IllegalArgumentException("Quiz cannot be null.");
	    }
	    this.quiz = quiz;
	}
	void setPrice(float price) throws IllegalArgumentException{
		if(price<0)
			throw new IllegalArgumentException("Price cannot be negative.");
		this.Price=price;
	}
	void setStudents(ArrayList<String> students) throws IllegalArgumentException{
	    if (students == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.students = students;
	}
	void setInstructors(ArrayList<String> instructors) throws IllegalArgumentException{
	    if (instructors == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.instructors = instructors;
	}

	void setContent(ArrayList<String> content) throws IllegalArgumentException{
	    if (content == null || content.length()==0) { //check whether the passed arraylist is null or empty
	        throw new IllegalArgumentException("Content ArrayList cannot be null or empty.");
	    }
	    this.content = conent;
	}

	void setWeeklyDate(String weeklyDate) throws IllegalArgumentException{
	    if (weeklyDate == null) {
	        throw new IllegalArgumentException("WeeklyData ArrayList cannot be null.");
	    }
	    this.weeklyDate = weeklyDate;
	}

	void setCoursePeriod(String coursePeriod) throws IllegalArgumentException{
	    if (coursePeriod == null) {
	        throw new IllegalArgumentException("CoursePeriods ArrayList cannot be null.");
	    }
	    this.coursePeriods = coursePeriod;
	}
	
	public void changeWeeklyPeriod(String newWeeklyPeriod) throws IllegalArgumentException{
	    if (newWeeklyPeriod == null) {
	        throw new IllegalArgumentException("New weekly period cannot be null.");
	    }
	    this.weeklyDate = newWeeklyPeriod;
	}
	public void addChapterToContent(String newChapter) throws IllegalArgumentException{
	    if (newChapter == null || newChapter.isEmpty()) {
	        throw new IllegalArgumentException("New chapter cannot be null or empty.");
	    }
	    this.content.add(newChapter);
	}
	public void removeChapterFromContent(String chapterToRemove) {
	    if (chapterToRemove == null || chapterToRemove.isEmpty()) {
	        throw new IllegalArgumentException("Chapter to remove cannot be null or empty.");
	    }
	    if (content != null) {
	        content.remove(chapterToRemove);
	    }
	   
	}
	public int getChapterNumber(String chapterName) {
	    if (chapterName == null || chapterName.isEmpty()) {
	        throw new IllegalArgumentException("Chapter name cannot be null or empty.");
	    }
	       for (int i = 0; i < content.size(); i++) {
	           if (content.get(i).equals(chapterName)) {
	               return i + 1; // Chapter numbers start from 1
	           }
	       }
	    
	    throw new IllegalArgumentException("Chapter name not found in the content.");
	}

	public static ArrayList<Course> getAllCoursesAvailable(){
		return AllCoursesAvailable;
	}


	public abstract String toString();
	
	
	
	
	
	
	

}
