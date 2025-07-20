import java.util.HashMap;
public class ZeroSumSubarrays {
    public static int countZeroSumSubarrays(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;

        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 5, 5, 0, 0};
        System.out.println(countZeroSumSubarrays(arr)); // 6
    }
}