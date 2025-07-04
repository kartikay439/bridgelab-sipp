//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
//I/P => NONE
//O/P => Harry's age in 2024 is ___


public class Question_1 {
    static int findAge(int dateOfBirth,int currentYear){
        return currentYear - dateOfBirth;
    }

    public static void main(String[] args) {
        int currentyear = 2024;
        int dateOfBirth = 2000;

        int age = findAge(dateOfBirth,currentyear);
        System.out.println("Age "+age);
    }
}
