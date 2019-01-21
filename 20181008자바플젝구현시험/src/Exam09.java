
public class Exam09 {
	
	static String reverse(String path) {
		StringBuilder str = new StringBuilder(path);
		str.reverse();
		return str.toString();
		
	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			System.out.println(reverse(s));
	}
}
