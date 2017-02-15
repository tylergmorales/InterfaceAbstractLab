/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Tyler
 */
public abstract class ITCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    Output output = new Output();

    public final String getCourseName() {
        return courseName;
    }
    
    public String getCapitalizedCourseName() {
        return courseName.toUpperCase();
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    output.courseNameNullError());
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber(){
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    output.courseNumberNullError());
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits(){
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    output.creditRangeError());
            System.exit(0);
        }
        this.credits = credits;
    }
            

    public final String getPrerequisites() {
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
    
    
}
