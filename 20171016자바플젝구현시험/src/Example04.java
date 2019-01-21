
public class Example04 {
	
	static String convertToSnakeCase(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				sb.append('_');
				c = Character.toLowerCase(c);
			}
			sb.append(c);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] a = { "helloWorld", "oneTwoThree", "HowDoYouDo", "One" };

		for (String s : a)
			System.out.printf("%s  ", convertToSnakeCase(s));
	}
}
