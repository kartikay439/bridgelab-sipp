class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enroll(Student s) {
        students.add(s);
        s.enroll(this);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students)
            System.out.println("- " + s.name);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course c) {
        if (!courses.contains(c)) courses.add(c);
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses)
            System.out.println("- " + c.name);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }
}
