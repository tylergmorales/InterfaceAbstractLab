package lab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public interface Course {
    public void setCourseName(String courseName);
    public String getCourseName();
    public void setCourseNumber(String courseNumber);
    public String getCourseNumber();
    public void setCredits(int credits);
    public double getCredits();
    public void setPrerequisites(String prerequisites);
    public String getPrerequisites();
}
