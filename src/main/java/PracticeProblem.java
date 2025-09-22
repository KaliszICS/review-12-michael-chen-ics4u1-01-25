public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static boolean isPalindrome(String a) {
		a = a.toLowerCase().replaceAll(" ", "");
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.split("")[i];
		}
		return a.equals(b);
	}

	public static int getAge(String[] a, int[] b, String c) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c) {
				return b[i];
			}
		}
		return -1;
	}

	public static int countWords(String a, char b) {
		String[] c = a.split(" ");
		int count = 0;
		for (String i : c) {
			if (i.indexOf(b) != -1) {
				count++;
			}
		}
		return count;
	}
}
