package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements ITCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private Output2 output = new Output2();
    private College college2 = new College();
    

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
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

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    output.prerequisiteNullError());
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    @Override
    public String toString()
    {
        return "Class Name: " + courseName + "\nCourse Number: " + courseNumber + "\nCourse Credits: " + credits + "\nCourse Prerequisites: " + prerequisites + "\n";
    }
}
