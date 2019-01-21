import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\\\eclipse\\\\workspace\\\\13Map\\\\src\\\\javatext.txt";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		while (scanner.hasNext("[a-zA-Z]+")) {
			String s = scanner.next();
			System.out.println(s);
		}
		scanner.close();
	}
}
