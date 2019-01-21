
public class Exam01 {
	
	public static double average(int... a) {
		double result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		result = result/a.length;
		
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 };

		System.out.println(average(2, 3));
		System.out.println(average(2, 3, 4));
		System.out.println(average(a));
	}
}
