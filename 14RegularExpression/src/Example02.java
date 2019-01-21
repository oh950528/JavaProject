import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Example02 {

	static String readTextFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String[] args) throws IOException {        
		String path = "C:\\eclipse\\자바실습\\자바프로젝트(오일권)\\강의자료\\홈페이지_게시판.html";
		String s = readTextFile(path, Charset.forName("EUC-KR"));

		String regex = "<a href='boardread.aspx[^>]+>([^<]+)</a>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find())
			System.out.println(matcher.group(1));

	}

}