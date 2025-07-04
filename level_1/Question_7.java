//Write a Program to compute the volume of Earth in km^3 and miles^3
//Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
//O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____

public class Question_7 {
    public static void main(String[] args) {
        double radiusOfEarth = 6378;
        double volumeInKM_Cube = (4 / 3) * (Math.PI) * Math.pow(radiusOfEarth, 3);
        System.out.println("Volume in km Cube " + volumeInKM_Cube + " Volume in km Cube " + volumeInKM_Cube * Math.pow(1.6, 3));
    }
}
