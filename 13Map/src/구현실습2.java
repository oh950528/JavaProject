import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class DataItem {
	String s;
	int count;

	public DataItem(String s, int count) {
		this.s = s;
		this.count = count;
	}
}

// ORDER BY count DESC, s
class DataItemComparator implements Comparator<DataItem> {

	@Override
	public int compare(DataItem o1, DataItem o2) {
		if (o1 == null && o2 == null) return 0;
		else if (o1 == null) return -1;
		else if (o2 == null) return 1;
		else {
			int r = o2.count - o1.count;
			if (r != 0) return r;
			return o1.s.compareTo(o2.s);
		}
	}
}

public class 구현실습2 {

	public static void main(String[] args) throws IOException {
		Map<String,Integer> map = new TreeMap<>();
		String filePath = "C:\\\\eclipse\\\\workspace\\\\13Map\\\\src\\\\javatext.txt";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		while (scanner.hasNext("[a-zA-Z]+")) {
			String s = scanner.next();
			Integer count = map.get(s);
			if (count == null) count = 0;
			count = count + 1;
			map.put(s, count);
		}
		scanner.close();

		List<DataItem> list = new ArrayList<>();
		for (String s : map.keySet())
			list.add(new DataItem(s, map.get(s)));

		Collections.sort(list, new DataItemComparator());
		for (DataItem d : list)
			System.out.printf("%s %d\n", d.s, d.count);
	}
}
