class Professor {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course c) {
        courses.add(c);
        c.assignProfessor(this);
    }
}

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Professor professor;

    public Course(String name) {
        this.name = name;
    }

    public void enroll(Student s) {
        students.add(s);
        s.enroll(this);
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course c) {
        courses.add(c);
    }
}
