package static_this_final_instanceOf;

class Employee {

    //company name and total employess are independent of Employee 
    private static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    //Instance variable employee dependent
    private String name;
    private final int id;
    private String designation;

    //Parameterized Constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    //displaying total emlpoyee count
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }


    //Showing Employye detail if Emplyee is valid
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID  : " + id);
            System.out.println("Designation  : " + designation);
        } else {
            System.out.println("Not a valid Employee instance.");
        }
    }
}
