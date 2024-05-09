package Course;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 * This class represents a quiz in the system.
 * It contains information such as the date it was created, the number of questions, and the chapters that make up the quiz.
 *
 * @author Omar Ayman
 */
public class Quiz {
    private LocalDate time;
    private ArrayList<String> content;
    private int noOfQuestions;
    private boolean isSequential;
    private String type;

    /**
     * Constructs a new quiz with the given parameters.
     *
     * @param time the date the quiz was created
     * @param content the chapters that make up the quiz
     * @param noOfQuestions the number of questions in the quiz
     * @param isSet whether the quiz is sequential or not
     */
    public Quiz(LocalDate time, ArrayList<Chapter> content, int noOfQuestions, boolean isSequential, String type) {
    	setTime(time);
        setContent(content);
        setNoOfQuestions(noOfQuestions);
        setSet(isSequential);
        this.type = type;
    }

    /**
     * Constructs a new quiz with the given parameters.
     *
     * @param time the date the quiz was created
     * @param content the chapters that make up the quiz
     */
    public Quiz(LocalDate time, ArrayList<Chapter> content) {
    	setTime(time);
    	setContent(content);
        this.type = "MCQ";
        this.setNoOfQuestions=10;
        this.isSequential=false;
    }

    /**
     * Constructs a new quiz with the given parameters.
     *
     * @param time the date the quiz was created
     * @param noOfQuestions the number of questions in the quiz
     */
    public Quiz(LocalDate time, int noOfQuestions) {
    	setTime(time);
        setNoOfQuestions(noOfQuestions);
        this.type = "MCQ";
        this.content = new ArrayList<>();
    }

    /**
     * Constructs a new quiz with the given parameters.
     *
     * @param time the date the quiz was created
     * @param content the chapters that make up the quiz
     * @param noOfQuestions the number of questions in the quiz
     */
    public Quiz(LocalDate time, ArrayList<Chapter> content, int noOfQuestions) {
    	setTime(time);
        setContent(content);
        setNoOfQuestions(noOfQuestions);
        this.type = "MCQ";
    }

    /**
     * Returns the date the quiz was created.
     *
     * @return the date the quiz was created
     */
    public void setTime(LocalDate time) {
        if (time == null) {
            throw new IllegalStateException("Time is not set.");
        }
        this.time = time;
        
    }


    /**
     * Sets the date the quiz was created.
     *
     * @param time the date the quiz was created
     */
    public LocalDate getTime() {
    	return time;
    }

    /**
     * Returns the chapters that make up the quiz.
     *
     * @return the chapters that make up the quiz
     */
    public ArrayList<Chapter> getContent() {
        return content;
    }

    /**
     * Sets the chapters that make up the quiz.
     *
     * @param content the chapters that make up the quiz
     */
    public void setContent(ArrayList<String> content) {
    	if (content.isEmpty()) {
    		throw new IllegalArgumentException("The Content must not be empty");
    	}
        this.content = content;
    }

    /**
     * Returns the number of questions in the quiz.
     *
     * @return the number of questions in the quiz
     */
    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    /**
     * Sets the number of questions in the quiz.
     *
     * @param noOfQuestions the number of questions in the quiz
     */
    public void setNoOfQuestions(int noOfQuestions) {
        if (noOfQuestions <= 0) {
            throw new IllegalArgumentException("Number of questions must be greater than zero.");
        }
        this.noOfQuestions = noOfQuestions;
    }


    /**
     * Returns whether the quiz is set or not.
     *
     * @return whether the quiz is set or not
     */
    public boolean isSequential() {
        return isSequential;
    }

    /**
     * Sets whether the quiz is set or not.
     *
     * @param set whether the quiz is set or not
     */
    public void setSequential(boolean set) {
        isSequential = set;
    }

    /**
     * Returns the type of quiz.
     *
     * @return the type of quiz
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of quiz.
     *
     * @param type the type of quiz
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "time=" + time +
                ", content=" + content +
                ", noOfQuestions=" + noOfQuestions +
                ", isSet=" + isSet +
                ", type=" + type +
                '}';
    }

    /**
     * Changes the date of the quiz.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     */

    public void changeQuizTime(int year, int month, int day) {
        // Validate the inputs
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date inputs.");
        }

        this.time = LocalDate.of(year, month, day);
    }

    private boolean isValidDate(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /**
     * Adds the given number of questions to the quiz.
     *
     * @param noOfQuestions the number of questions to add
     */
    public void addQuestion(int noOfQuestions) {
        this.noOfQuestions += noOfQuestions;
    }

    /**
     * Removes the given number of questions from the quiz.
     *
     * @param noOfQuestions the number of questions to remove
     */
    public void removeQuestion(int noOfQuestions) {
        this.noOfQuestions -= noOfQuestions;
    }

    /**
     * Adds the given chapter to the quiz.
     *
     * @param chapter the chapter to add
     */
    public void addChapter(String chapter) {
        this.content.add(chapter);
    }

    /**
     * Removes the given chapter from the quiz.
     *
     * @param chapter the chapter to remove
     */
    public void removeChapter(String chapter) {
    	if(content.contains(chapter)) {
    		if (content != null) {
    			content.remove(chapter);
    		}
    		else {
            System.out.println("Content array is null, cannot remove chapter.");
    		}
    	}
    	else throw new IllegalArgumentException("chapter does not exist in content");
    }

    
    /**
     * Changes the type of quiz.
     *
     * @param type the new type of quiz
     */
    public void changeType(String type) {
        this.type = type;
    }

    
}
/*
class Test {
    public static void main(String[] args) {
        try {
            var quiz = new Quiz(LocalDate.of(2001, 5, 11), new ArrayList<>());
            quiz.setContent(new ArrayList<>());
            quiz.addChapter(new Chapter());
            System.out.println(quiz);

            quiz.changeType(Quiz.Type.MIXED);
            System.out.println(quiz);
            Quiz quiz2 = new Quiz(LocalDate.of(2000, 1, 1), 10);
            System.out.println(quiz2);

            quiz2.addChapter(new Chapter());
            quiz2.addChapter(new Chapter());
            quiz2.addChapter(new Chapter());

            System.out.println(quiz2);

            quiz2.removeChapter(1);
            System.out.println(quiz2);
            quiz2.setSet(true);
            System.out.println(quiz2.isSet());
        } catch (Exception e) {
            System.out.println("invalid");
        }
    }
}*/

