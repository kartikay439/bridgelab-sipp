public class CircularTour {
    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int p, int d) { petrol = p; distance = d; }
    }

    public static int findStart(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0, deficit = 0, capacity = 0;

        for (int i = 0; i < n; i++) {
            capacity += pumps[i].petrol - pumps[i].distance;
            if (capacity < 0) {
                start = i + 1;
                deficit += capacity;
                capacity = 0;
            }
        }
        return (capacity + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };
        System.out.println(findStart(pumps)); // 1
    }
}