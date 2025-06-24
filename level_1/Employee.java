package level_1;
// Program to Display Employee Details
// Problem Statement: Write a program to create an Employee class with attributes name,
// id, and salary. Add a method to display the details.

public class Employee{
    static int universalId = 10000;

    int id;
    String name;
    Double salary;

    public Employee(String name,double salary){
        this.id = id+1;
        this.name = name;
        this.salary = salary;
    }

    void showDetail(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+name);
        System.out.println("Salary : "+name);
     }

}



 class Main {
public static void main(String[] args) {
    Employee e1  = new Employee("java", 120000D);
    e1.showDetail();
}
    
}