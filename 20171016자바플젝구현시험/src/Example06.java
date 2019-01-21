
public class Example06 {

	static String getFileExtension(String path) {
		int index = path.lastIndexOf(".");
		return path.substring(index+1);
	}

	public static void main(String[] args) {
		String[] a = { "c:/data/student/lecture.docx",
				"c:/www/mainpage.html",
		"c:/program files/java/javac.exe" };
		for (String s : a) {
			String extension = getFileExtension(s);
			System.out.printf("%s  ", extension);
		}
	}
}
