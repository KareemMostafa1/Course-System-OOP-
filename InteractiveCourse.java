package Course;

import java.util.ArrayList;

public class InteractiveCourse extends Course implements Comparable<OnlineCourse>,CourseProvider{
	private String Place;
	private int seatsAvailable;
	private ArrayList<String> toolsNeeded;
	private final int maxNoOfStudents = 30;


	

	InteractiveCourse(String name,String courseId, String descrription, ArrayList<String> quizes, ArrayList<String> instructors,ArrayList<String> students
		,	ArrayList<String> content, ArrayList<String> weeklyDate, ArrayList<String> coursePeriods,String Place,ArrayList<String> toolsNeeded) {
		super(name,courseId, descrription, quizes, instructors,students, content, weeklyDate, coursePeriods);
		// TODO Auto-generated constructor stub
		setPlace(place);
		seatsAvailable=maxNoOfStudents; //available seats are initially equal to the max no of students(length of students array is initially zero)
		setToolsNeeded(toolsNeeded);
		
	}
	





	String getPlace() {
		return Place;
	}
	
	public int getSeatsAvailable() {
	    return seatsAvailable;
	}

//	public void setSeatsAvailable(int seatsAvailable) {
//	    if (seatsAvailable < 0 || seatsAvailable > maxNoOfStudents) {
//	        throw new IllegalArgumentException("seats available cannot be negative or exceed max.available number");
//	    }
//	    this.seatsAvailable = seatsAvailable;
//	}

	public ArrayList<String> getToolsNeeded() {
	    return toolsNeeded;
	}

	public void setToolsNeeded(ArrayList<String> toolsNeeded) {
	    if (toolsNeeded == null) {
	        throw new IllegalArgumentException("Tools needed ArrayList cannot be null.");
	    }
	    this.quizes = new ArrayList<>(toolsNeeded);
	}
	void setPlace(String Place) {
	    if (Place == null || Place.isEmpty()) {
	        throw new IllegalArgumentException("Course place cannot be null or empty.");
	    }
	    this.Place = Place;
	}


    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", describtion='" + describtion + '\'' +
                ", quiz=" + quiz +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriods +
                ", price=" + price +
                ", Place='" + Place + '\'' +
                ", seatsAvailable='" + seatsAvailable + '\'' +
                ", toolsNeeded='" + toolsNeeded + '\''+ 
                
                '}';
    }

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		if (this.price==o.getPrice())
			return 0;
		else if(this.price>=o.getPrice())
			return 1;
		else 
			return -1;
	}
	
	@Override
	Course getCourseById(String courseId) throws IllegalArgumentException {
		ArrayList<Course> AllCourses=Course.getAllCoursesAvailable;
		for(int i; i<AllCourses.length();i++) {
			if(AllCourses.get(i).getCourseId()==courseId)
				return AllCourses.get(i);
		}
		throw new IllegalArgumentException("courseId does not exist");
	}
	@Override
	Course searchCourse(String keyword) {
		ArrayList<Course> AllCourses=Course.getAllCoursesAvailable;
		for(int i; i<AllCourses.length();i++) {
			if(AllCourses.get(i).getDescribtion().cantains(keyword))
				return AllCourses.get(i);
		}
		throw new IllegalArgumentException("courseId does not exist");
	}
	
}
