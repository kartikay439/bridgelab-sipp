//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
//I/P => NONE
//O/P => Sam’s average mark in PCM is ___

public class Question_2 {
    static int findAveragePCM_Marks(int physicsMarks,int mathsMarks, int chemistryMarks){
        int averageMarks =( physicsMarks + mathsMarks + chemistryMarks)/3;
        return averageMarks;
    }

    public static void main(String[] args) {
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 94;

        int averageMarks = findAveragePCM_Marks(physicsMarks,mathsMarks,chemistryMarks);

        System.out.println(averageMarks);
    }
}
