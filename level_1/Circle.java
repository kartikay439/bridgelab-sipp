package level_1;
// Program to Display Employee Details
// Problem Statement: Write a program to create an Employee class with attributes name,
// id, and salary. Add a method to display the details.

public class Circle{
    static Double pi  = Math.PI;

    double radius ;

    public Circle(double radius){
        this.radius = radius;
    }

    Double circumference(){
       return 2*pi*radius;
     }
     
    Double area(){
       return pi*radius*radius;
     }


}


