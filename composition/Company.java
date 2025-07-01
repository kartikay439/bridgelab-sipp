class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(String depName) {
        departments.add(new Department(depName));
    }

    public void destroyCompany() {
        departments.clear();  // destroys all departments and employees
        System.out.println("Company " + name + " has been dissolved.");
    }

    class Department {
        String name;
        ArrayList<Employee> employees = new ArrayList<>();

        public Department(String name) {
            this.name = name;
        }

        public void addEmployee(String empName) {
            employees.add(new Employee(empName));
        }

        class Employee {
            String name;
            public Employee(String name) {
                this.name = name;
            }
        }
    }
}
