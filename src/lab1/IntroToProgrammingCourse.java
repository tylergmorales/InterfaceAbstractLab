package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ITCourse{

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites("NONE");
    }

    @Override
    public String toString()
    {
        return "Class Name: " + this.getCourseName() + "\nCourse Number: " + this.getCourseNumber() + "\nCourse Credits: " + this.getCredits() + "\nCourse Prerequisites: " + this.getPrerequisites() + "\n";
    }
}
