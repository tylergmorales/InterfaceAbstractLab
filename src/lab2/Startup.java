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
public class Startup {
    
    public static void main(String[] args) {
        IntroToProgrammingCourse course1 = new IntroToProgrammingCourse("Intro to Programming", "000001", 3.00);
        IntroJavaCourse course2 = new IntroJavaCourse("Intro to Java", "000002", 3.00, "Intro to Programming");
        AdvancedJavaCourse course3 = new AdvancedJavaCourse("Advanced Java", "000003", 3.00, "Intro to Java");
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
