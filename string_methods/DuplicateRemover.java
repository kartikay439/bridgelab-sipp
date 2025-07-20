public class DuplicateRemover {
	public static String removeDuplicates(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("aabbcc"));
	}
}