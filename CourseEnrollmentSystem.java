import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Graded {
	void assignGrade(int grade);
}


//COURSE
class Course {
	private static int id = 1;

	private int courseId;
	private String courseTitle;

	public Course(String courseTitle) {
		this.courseId = id++;
		this.courseTitle = courseTitle;

	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

}


//STUDENT
class Student {
	private static int id = 100;

	private int rollNumber;
	private String name;

	public Student(String name) {
		this.name = name;
		this.rollNumber = id++;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}
}


//ENROLLMENT
class Enrollment implements Graded {
	private static int id = 5000;

	int enrollmentId;
	private int courseId;
	private int rollNumber;
	private Integer grade;

	public Enrollment(int courseId, int rollNumber) {
		this.courseId = courseId;
		this.rollNumber = rollNumber;
		this.enrollmentId = id++;
	}

	@Override
	public void assignGrade(int grade) {
		this.grade = grade;
	}

	public int getCourseId() {
		return courseId;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public Integer getGrade() {
		return grade;
	}

}



public class CourseEnrollmentSystem {
	List<Student> students;
	List<Enrollment> enrollments;
	List<Course> courses;
	
	Scanner sc;

	public CourseEnrollmentSystem() {
		this.students = new ArrayList<>();
		this.enrollments = new ArrayList<>();
		this.courses = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	public void addStudent() {
		System.out.print("Enter Name : ");
		Student newStudent = new Student(sc.next());
		students.add(newStudent);
	}
	
	public void addCourse() {
		System.out.print("Enter Course title : ");
		Course newCourse = new Course(sc.next());
		courses.add(newCourse);
	}

	public void enrollCourse() {
		System.out.print("Enter CourseID : ");
		int cID = sc.nextInt();
		System.out.print("Enter RollNo : ");
		int rollN = sc.nextInt();
		Enrollment newEnrollment = new Enrollment(cID, rollN);
		enrollments.add(newEnrollment);
	}

	public void assignGradeE() {
		System.out.print("Enter EnrollmentID : ");
		int enrollN = sc.nextInt();
		System.out.print("Enter Grade : ");
		int gr = sc.nextInt();
		for (Enrollment i : enrollments) {
			if (i.enrollmentId == enrollN) {
				i.assignGrade(gr);
			}
		}
	}

	public void assignGrade(int courseId, int rollNumber, int grade) {
		for (Enrollment i : enrollments) {
			if (i.getRollNumber() == rollNumber && i.getCourseId() == courseId) {
				i.assignGrade(grade);
			}
		}
	}
	
	public void showAllStudents() {
		System.out.println("-----------------------------------Students-----------------------------------");
		int count = 1;
		for(Student s : students) {
			System.out.println(count+++".  Roll No : "+s.getRollNumber()+"  Name : "+s.getName());
		}
	}
	
	public void showEnrollments() {
		System.out.println("-----------------------------------Enrollments-----------------------------------");
		int count = 1;
		for(Enrollment e : enrollments) {
			System.out.println(count+++".  CourseID : "+e.getCourseId()+"  RollNo : "+e.getRollNumber());
		}
	}
	
	public void showCourses() {
		System.out.println("-----------------------------------Courses-----------------------------------");
		int count = 1;
		for(Course c : courses) {
			System.out.println(count+++".  CourseID : "+c.getCourseId()+"  CourseTitle : "+c.getCourseTitle());
		}
	}

	public double calculateGPA(int rollNo) {
		int sum = 0;
		int count = 0;
		for (Enrollment e : enrollments) {
			if (e.getRollNumber() == rollNo) {
				count++;
				sum += e.getGrade() == null ? 0 : e.getGrade();
			}
		}
		return (double)sum/(double)count;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean end = true;
		while(end) {
			System.out.println("Enter 1 for : Courses");
			System.out.println("Enter 2 for : Students");
			System.out.println("Enter 3 for : Enrollments");
			System.out.println("Enter 4 for : AddStudent");
			System.out.println("Enter 5 for : AddCourse");
			System.out.println("Enter 6 for : AddGrade");
			System.out.println("Enter 7 for : Exit");
			
			System.out.print("Enter : ");
			int x = sc.nextInt();
			switch(x) {
			case 1:showCourses();
					break;
			case 2:showAllStudents();
					break;
			case 3:showEnrollments();
					break;
			case 4:addStudent();
					break;
			case 5:addCourse();
					break;
			case 6:assignGradeE();
					break;
			case 7: end = false;
					break;
			}
			
			
		}
	}

	public static void main(String[] args) {
		CourseEnrollmentSystem enrollSystem = new CourseEnrollmentSystem();
		
		enrollSystem.run();
		
		
	}
}
