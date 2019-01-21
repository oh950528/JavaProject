import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Example07 {

	static void solution(List<Integer> a) {
		Iterator<Integer> it = a.iterator();
		while(it.hasNext()) {
			int value = it.next();
			if((value % 2) == 0 || (value & 3) == 0)
				it.remove();
		}

	}

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < 30; ++i)
			a.add(random.nextInt(8) + 1);
		System.out.println(a.toString());
		solution(a);
		System.out.println(a.toString());
	}
}
