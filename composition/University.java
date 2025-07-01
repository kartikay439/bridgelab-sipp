class Faculty {
    String name;
    public Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    public Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(String depName) {
        departments.add(new Department(depName));
    }

    public void addFaculty(Faculty f) {
        faculties.add(f); // Aggregation: faculty can exist outside
    }

    public void deleteUniversity() {
        departments.clear(); // Composition: removing all departments
        System.out.println("University " + name + " deleted.");
    }
}
