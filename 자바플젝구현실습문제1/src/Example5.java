import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };

		// 구현 
		//Example4에 구현2가 답
		Set<String> result2 = new HashSet<>();

		result2.addAll(Arrays.asList(a1));
		result2.removeAll(Arrays.asList(a2));

		System.out.print(result2);

	}
}
