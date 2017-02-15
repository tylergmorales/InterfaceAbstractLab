/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author TMorales3
 */
public class Output {
    public Output(){
    }
    
    public String creditRangeError()
    {
        return "Error: credits must be in the range 0.5 to 4.0";
    }
    
    public String prerequisiteNullError()
    {
        return "Error: prerequisites cannot be null of empty string";
    }
    
    public String courseNumberNullError()
    {
        return "Error: courseNumber cannot be null of empty string";
    }
    
    public String courseNameNullError()
    {
        return "Error: courseName cannot be null of empty string";
    }
}
