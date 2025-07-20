public class AnagramChecker {
	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		int[] count = new int[256];
		for (char ch : str1.toCharArray()) count[ch]++;
		for (char ch : str2.toCharArray()) {
			if (--count[ch] < 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(areAnagrams("listen", "silent"));
	}
}