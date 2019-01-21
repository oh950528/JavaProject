
public class Example01 {
	
	static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] a = { "a", "1234", "hello" };
		for(String s : a)
			System.out.printf("%s ", reverse(s));
	}
}
