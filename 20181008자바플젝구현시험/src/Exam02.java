
public class Exam02 {

	public static void main(String[] args) {
		Person[] a = new Person[2];
		
		a[0] = new Person("ȫ�浿", "201132050", 2, 4.1);
		a[1] = new Person("ȫ�浿", "201132050", 2, 4.1);
		
		System.out.println(a[0] == a[1]);        
		System.out.println(a[0].equals(a[1]));
	}
}
