/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author TMorales3
 */
public class Output2 {
    public Output2(){
    }
    
    public String creditRangeError()
    {
        return "Error: Credits must be in the range 0.5 to 4.0";
    }
    
    public String prerequisiteNullError()
    {
        return "Error: Prerequisites cannot be null or empty string";
    }
    
    public String courseNumberNullError()
    {
        return "Error: Course Number cannot be null or empty string";
    }
    
    public String courseNameNullError()
    {
        return "Error: Course Name cannot be null or empty string";
    }
}

