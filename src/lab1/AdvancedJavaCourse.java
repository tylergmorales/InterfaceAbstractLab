package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return super.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return super.getPrerequisites();
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        super.setPrerequisites(prerequisites);
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }

    public String getCourseName() {
        return super.getCourseName();
    }

    public void setCourseName(String courseName) {
        super.setCourseName(courseName);
    }

    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    public void setCourseNumber(String courseNumber) {
        super.setCourseNumber(courseNumber);
    }
    
}
