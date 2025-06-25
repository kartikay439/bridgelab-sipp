package constructor;

public class Course {
    static String InstituteName;

    String courseName;
    int duration;
    double fees;

    public Course(String courseName, int duration, double fees,String instituteName) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
        InstituteName  = instituteName;
    }

    public String displayCourseDetails() {
        return "Course [courseName=" + courseName + ", duration=" + duration + ", fees=" + fees + "]";
    }
    public void updateInstituteName(String instituteName) {
        InstituteName = instituteName;
    }



    

    
    
}
