import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {

	static String[] convertToArray(String s) {
		// ���ڿ� s���� �ܾ �����Ͽ� �ܾ� ��� �迭�� �����϶�.
		// �ܾ�� ���ĺ���θ� �����Ǿ�� �Ѵ�.
		// ���ϵǴ� �迭�� �ܾ�� ���� �ҹ��ڷ� ��ȯ�Ǿ�� �Ѵ�.
		ArrayList<String> list = new ArrayList<>();
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(s);
		while(matcher.find())
			list.add(matcher.group(0).toLowerCase());
		return list.toArray(new String[list.size()]);
	}
	
	static String[] convertToArray2(String s) {
		s = s.replaceAll("[^a-zA-Z]+", " ");
		s = s.replaceAll("^[^a-zA-Z]+", "");
		s = s.replaceAll("[^a-zA-Z]+$", "");
		s = s.toLowerCase();
		return s.split(" ");
	}
	
	static String[] convertToArray3(String s) {
		s = s.replaceAll("[^a-zA-Z]+", " ");
		s = s.trim().toLowerCase();
		return s.split(" ");
	}


	public static void main(String[] args) {
		String[] a = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
		"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : a) {
			String[] t = convertToArray(s);
			System.out.println(Arrays.toString(t));
		}
		
		String[] b = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
		"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : b) {
			String[] t = convertToArray2(s);
			System.out.println(Arrays.toString(t));
		}
		
		String[] c = { "one 2 two, - Three,\t four; @ \t\nfive..,SIX)",
		"1 one 2 two, - Three,\t four; @ \t\nfive..,SIX)" };
		for (String s : c) {
			String[] t = convertToArray3(s);
			System.out.println(Arrays.toString(t));
		}
	}
}
