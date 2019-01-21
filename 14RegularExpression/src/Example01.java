import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example01 {

	static String readTextFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String[] args) throws IOException {
		String path = "C:\\eclipse\\자바실습\\자바프로젝트(오일권)\\강의자료\\홈페이지_게시판.html";
		String s = readTextFile(path, Charset.forName("EUC-KR"));
		System.out.println(s);
	}
}
