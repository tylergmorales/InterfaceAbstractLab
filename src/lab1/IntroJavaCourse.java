package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ITCourse{

     public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

     @Override
    public String toString()
    {
        return "Class Name: " + this.getCourseName() + "\nCourse Number: " + this.getCourseNumber() + "\nCourse Credits: " + this.getCredits() + "\nCourse Prerequisites: " + this.getPrerequisites() + "\n";
    }
}
