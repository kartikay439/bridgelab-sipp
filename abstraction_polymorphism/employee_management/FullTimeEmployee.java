package abstraction_polymorphism.employee_management;



public class FullTimeEmployee extends Employee implements Department {
    private static int id = 0;

    private String department;

    public FullTimeEmployee(String name,Double salary) {
        super(("P"+id++),name,salary);
    }

    public void showDetail(){
        System.out.println("Full time Employee");
        super.displayDetails();
        System.out.println("Department : "+department);
        System.out.println("Salary : "+super.getSalary());
    }



    @Override
    double calculateSalary(){
        return super.getSalary();
    }

 

    @Override
    public void assignDepartment(String department) {
        this.department = department;
        
    }
    @Override
    public String getDepartment() {
        return department;
    }

    

    public String getName(){
        return super.getName();
    }

    public String getId(){
        return super.getEmployeeId();
    }

  
}

