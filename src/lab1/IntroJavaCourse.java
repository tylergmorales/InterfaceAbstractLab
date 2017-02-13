package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{

    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
        return super.getCourseNumber();
    }

    public void setCourseNumber(String courseNumber) {
        super.setCourseNumber(courseNumber);
    }

    public double getCredits() {
        return super.getCredits();
    }


    public String getPrerequisites() {
        return super.getPrerequisites();
    }

    public void setPrerequisites(String prerequisites) {
        super.setPrerequisites(prerequisites);
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        super.setCredits(credits);
    }

}
