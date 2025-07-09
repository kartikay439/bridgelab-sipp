class Student {
	private int rollNumber;
	private String name;
	private int age;
	private int grade; //percentage
	
	Student next; 
	
	public Student(int rollNumber, String name, int age, int grade) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}




public class StudentList {
    private Student head;
    private Student tail;

    void addStudentAtStart(int rollNumber, String name, int age, int grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = tail = newStudent;
        } else {
            newStudent.next = head;
            head = newStudent;
        }
    }

    void addStudentAtEnd(int rollNumber, String name, int age, int grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = tail = newStudent;
        } else {
            tail.next = newStudent;
            tail = newStudent;
        }
    }

    void addStudentAtIndex(int rollNumber, String name, int age, int grade, int index) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (index == 0) {
            addStudentAtStart(rollNumber, name, age, grade);
            return;
        }
        Student temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.print("Index Out Of Range");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
        if (newStudent.next == null) {
            tail = newStudent;
        }
    }

    void deleteStudentByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.getRollNumber() == rollNumber) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.getRollNumber() != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.print("No Record Found");
        } else {
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }
    }

    void searchStudentByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.getRollNumber() == rollNumber) {
                System.out.print(temp.getName());
                return;
            }
            temp = temp.next;
        }
        System.out.print("No Record Found");
    }

    void displayAllStudentRecord() {
        Student temp = head;
        while (temp != null) {
            System.out.print(temp.getName());
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    void updateGradeByRollNumber(int rollNumber, int grade) {
        Student temp = head;
        while (temp != null) {
            if (temp.getRollNumber() == rollNumber) {
                temp.setGrade(grade);
                System.out.print("Updated: " + temp.getName());
                return;
            }
            temp = temp.next;
        }
        System.out.print("No Record Found");
    }

    public static void main(String[] args) {
        StudentList l = new StudentList();
        l.addStudentAtStart(2215, "Sunny", 24, 84);
        l.addStudentAtEnd(2216, "Ravi", 22, 78);
        l.displayAllStudentRecord();
    }
}
