package abstraction_polymorphism.employee_management;

abstract class Employee {
    private String employeeId;
    private String name;
    private double salary;
    
    public Employee(String employeeId, String name,double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    
    abstract double calculateSalary();

 
    public void displayDetails(){
        System.out.println("EmployeeID : "+employeeId);
        System.out.println("Name  :"+name);
    }

    public String getEmployeeId() {
        return employeeId;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }




    public double getSalary() {
        return salary;
    }




    public void setSalary(double salary) {
        this.salary = salary;
    }
}


