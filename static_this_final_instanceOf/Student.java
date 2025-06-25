package static_this_final_instanceOf;

public class Student {
    static String UniversityName;
    static int studentNo = 0;

    String name;
    final int rollNo;
    char grade;
    
    public Student(String name, int rollNo, char grade,String universityName ) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        UniversityName = universityName;
        studentNo++;
    }
    void updateGrade(char grade){
        if(this instanceof Student)
        this.grade = grade;
    }

    void displayStrudentDetail(){
        if(this  instanceof Student)
        {
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+name);
        System.out.println("Grade : "+grade);
        }
    }

    
    
}
