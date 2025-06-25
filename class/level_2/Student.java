package level_2;
// Program to Simulate Student Report
// Problem Statement: Create a Student class with attributes name, rollNumber, and
// marks. Add two methods:
// ● To calculate the grade based on the marks.
// ● To display the student&#39;s details and grade.
// Explanation: The Student class organizes all relevant details about a student as
// attributes. Methods are used to calculate the grade and provide a way to display all
// information.

public class Student {
    String name;
    int rollNumber;
    int marks;

    

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String getGrade(){
        if(marks > 90)
        return "O";
        else if(marks>80)
        return "A+";
        else if(marks>70)
        return "A";
        else if(marks>80)
        return "B+";
        else if(marks>70)
        return "B";
        else if(marks>60)
        return "C+";
        else if(marks>50)
        return "C";
        else
        return "F";  
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + "]";
    }

    
    
}
