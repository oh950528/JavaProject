import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example3 {

	public static void main(String[] args) {
		String[] a = { "d", "a", "b", "a", "c", "d", "e", "f", "e" };
		// 备泅规过 1
		List<String> list = new ArrayList<>();
		for(String s : a) 
			if(!list.contains(s))
				list.add(s);
		System.out.println(list);
		
		//备泅规过 2
		Set<String> set = new HashSet<>();
		for(String s : a)
			set.add(s);
		System.out.println(set);
	}
}
