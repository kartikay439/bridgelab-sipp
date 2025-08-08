import java.util.*;

enum Difficulty {
    EASY, MEDIUM, HARD
}

class Question<T> {
    private String text;
    private Difficulty difficulty;
    private Map<String, T> options;
    private T correctAnswer;

    public Question(String text, Difficulty difficulty, Map<String, T> options, T correctAnswer) {
        this.text = text;
        this.difficulty = difficulty;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public Map<String, T> getOptions() {
        return options;
    }

    public T getCorrectAnswer() {
        return correctAnswer;
    }
}

class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question<T> question) {
        questions.add(question);
    }

    public List<Question<T>> getQuestions() {
        return questions;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private String rollNumber;
    private Map<String, List<Object>> submittedAnswers;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.submittedAnswers = new HashMap<>();
    }

    public void submitAnswers(String subjectName, List<Object> answers) {
        submittedAnswers.put(subjectName, answers);
    }

    public Map<String, List<Object>> getSubmittedAnswers() {
        return submittedAnswers;
    }

    public String getName() {
        return name;
    }
}

class ExamSystem {
    private List<Subject<?>> subjects;
    private List<Student> students;

    public ExamSystem() {
        subjects = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addSubject(Subject<?> subject) {
        subjects.add(subject);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Subject<?> getSubjectByName(String name) {
        for (Subject<?> s : subjects) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void conductExam(Student student, Subject<?> subject, Scanner scanner) {
        List<Object> answers = new ArrayList<>();
        List<? extends Question<?>> questions = subject.getQuestions();

        for (Question<?> q : questions) {
            System.out.println("Q: " + q.getText());
            for (Map.Entry<String, ?> entry : q.getOptions().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.print("Your answer: ");
            String ans = scanner.nextLine().trim();
            answers.add(ans);
        }

        student.submitAnswers(subject.getName(), answers);
    }

    public int calculateScore(Student student, Subject<?> subject) {
        List<Object> submitted = student.getSubmittedAnswers().get(subject.getName());
        List<? extends Question<?>> questions = subject.getQuestions();
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question<?> q = questions.get(i);
            Object submittedAnswer = submitted.get(i);
            if (q.getCorrectAnswer().toString().equalsIgnoreCase(submittedAnswer.toString())) {
                score++;
            }
        }

        return score;
    }
}

public class ExamManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamSystem system = new ExamSystem();

        Subject<String> java = new Subject<>("Java");
        Map<String, String> options1 = new HashMap<>();
        options1.put("A", "JVM");
        options1.put("B", "JRE");
        options1.put("C", "JDK");
        options1.put("D", "JIT");
        java.addQuestion(new Question<>("What is Java Virtual Machine?", Difficulty.EASY, options1, "A"));

        Subject<Integer> math = new Subject<>("Math");
        Map<String, Integer> options2 = new HashMap<>();
        options2.put("A", 2);
        options2.put("B", 3);
        options2.put("C", 4);
        options2.put("D", 5);
        math.addQuestion(new Question<>("What is 2 + 2?", Difficulty.EASY, options2, 4));

        system.addSubject(java);
        system.addSubject(math);

        Student student = new Student("Alice", "CS101");
        system.addStudent(student);

        System.out.println("Choose subject to take exam: Java / Math");
        String subjectName = scanner.nextLine().trim();
        Subject<?> subject = system.getSubjectByName(subjectName);

        if (subject != null) {
            system.conductExam(student, subject, scanner);
            int score = system.calculateScore(student, subject);
            System.out.println("Score of " + student.getName() + " in " + subject.getName() + ": " + score + "/" + subject.getQuestions().size());
        } else {
            System.out.println("Subject not found.");
        }
    }
}
