import java.util.Arrays;

public class Example01 {

	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
		String str = "";
		
		for(int i = 0; i < a.length; i++) {
			if(!str.contains(a[i])) {
				str += a[i];
			}
		}
		
		System.out.println(Arrays.toString(str.toCharArray()));
		
	}
}
