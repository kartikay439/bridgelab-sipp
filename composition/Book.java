package composition;

import java.util.*;

// Course class
class Course {
    private String courseName;
    private Set<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new HashSet<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private Set<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course course : enrolledCourses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// School class (Aggregation)
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("Students in " + name + " School:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
