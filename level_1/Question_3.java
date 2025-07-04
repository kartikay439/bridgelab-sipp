//Create a program to convert the distance of 10.8 kilometers to miles.
//        Hint: 1 km = 1.6 miles
//I/P => NONE
//O/P => The distance  ___ km in miles is ___

public class Question_3 {
    static double kilometerToMiles(double kilometer){
        double miles = 1.6*kilometer;
        return miles;
    }

    public static void main(String[] args) {
        double distanceInKilometer = 10.8;

        //Conversion
        double distanceInMiles = kilometerToMiles(distanceInKilometer);

        System.out.println(distanceInMiles+" miles");


    }
}
