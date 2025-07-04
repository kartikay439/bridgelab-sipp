package abstraction_polymorphism.employee_management;


public class PartTimeEmployee extends Employee implements Department {
    private static int id = 0;

    private String department;
    private int hours = 0;


    //Part time Employee Hourly Salary
    public int getHours(){
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }



    public PartTimeEmployee(String name,double salary) {
        super(("P"+id++),name,salary);
    }

    public void showDetail(){
        System.out.println("Part time Employee");
        super.displayDetails();
        System.out.println("Department : "+department);
        System.out.println("Salary : "+super.getSalary());
    }

    @Override
    double calculateSalary(){
        return (super.getSalary()/30)/24*hours;
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
class Main {
public static void main(String[] args) {
    PartTimeEmployee p =new PartTimeEmployee("kartikay", 150000.0);
    
}
    
}
