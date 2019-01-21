import java.util.ArrayList;
import java.util.Collection;

public class Exam05 {
	static void removeEvenNumbers(Collection<Integer> c) {
		for(int i = 0; i < 20; i += 2) {
			c.remove(i);
		}

	}


	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i)
			c.add(i);
		removeEvenNumbers(c);
		System.out.println(c.toString());

	}

}
