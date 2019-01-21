import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		String[] a1 = { "d", "a", "b", "a", "c", "a" };
		String[] a2 = { "b", "a", "f", "e", "b", "b" };
		
		// 구현1
		List<String> list1 = Arrays.asList(a1);
		List<String> list2 = Arrays.asList(a2);
		List<String> result1 = new ArrayList<>();
		
		
		for(String s : list1)
			if(list2.contains(s))
				if(!result1.contains(s))
					result1.add(s);
		System.out.print(result1);
		System.out.println();
		
		//구현2
		Set<String> result2 = new HashSet<>();
		
		result2.addAll(Arrays.asList(a1));
		result2.retainAll(Arrays.asList(a2));
		
		System.out.print(result2);
	}
}
