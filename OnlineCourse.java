package Course;

import java.util.ArrayList;

public class OnlineCourse extends Course implements Comparable<OnlineCourse>,CourseProvider{
	private String coursePlatform;
	//private boolean availableFinancialAid;
	

	public OnlineCourse(String name , String courseId , String describtion, Quiz quiz, ArrayList<Instructor> instructors , ArrayList<Student> students,
			ArrayList<String> content, String weeklyDate, String coursePeriod , float price , String coursePlatform) {
		super(name,courseId,descrription, quiz , price , instructors , students , content, weeklyDate, coursePeriods);
		// TODO Auto-generated constructor stub ((((a7a ya mohamed ya hussien)))))
		this.coursePlatform=coursePlatform;
		//this.availableFinancialAid=false;
		
	}		

	public String getCoursePlatform() {
		return coursePlatform;
	}
	
	void setCoursePlatform(String coursePlatform) {
	    if (coursePlatform == null || coursePlatform.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
	    this.coursePlatform = coursePlatform;
	}

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", course id='"+courseId+'\''+
                ", description='" + descrription + '\'' +
                ", quizzes=" + quizes +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriods +
                ", price=" + price +
                ", coursePlatform='" + coursePlatform + '\'' +
                '}';
    }

	@Override
	public int compareTo(Course o) { //I updated the argument to make it course as online courses can be compared with interactive ones
		// TODO Auto-generated method stub
		if (this.price==o.getPrice())
			return 0;
		else if(this.price>o.getPrice())
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
	
}
