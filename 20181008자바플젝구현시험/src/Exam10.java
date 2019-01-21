
public class Exam10 {
	static String removeSubstring(String s, int fromIndex, int toIndex) {
		StringBuilder str = new StringBuilder(s);
		str.delete(fromIndex, toIndex);
		String c;
		c = "" + str;
		return c;
	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello hello" };
		System.out.println(removeSubstring(a[0], 1, 4));
		System.out.println(removeSubstring(a[1], 2, 4));
		System.out.println(removeSubstring(a[2], 2, 5));
	}
}
