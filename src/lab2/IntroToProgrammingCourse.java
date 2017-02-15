package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ITCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private Output2 output = new Output2();
    private College college2 = new College();

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.prerequisites = "NONE";
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    output.courseNameNullError());
            System.exit(0);
        }
        this.courseName = courseName;
    }    
    
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    output.courseNumberNullError());
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < college2.getMinCredits() || credits > college2.getMaxCredits()) {
            JOptionPane.showMessageDialog(null,
                    output.creditRangeError());
            System.exit(0);
        }
        this.credits = credits;
    }
    
    @Override
    public String toString() {
        return "Class Name: " + courseName + "\nCourse Number: " + courseNumber + "\nCourse Credits: " + credits + "\nCourse Prerequisites: " + prerequisites + "\n";
    }
}
