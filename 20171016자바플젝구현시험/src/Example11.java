import java.util.Arrays;

public class Example11 {
	
	static void printSum(int... a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		System.out.printf("배열:%s 합계:%d\n", Arrays.toString(a), sum);
	}

	public static void main(String[] args) {
		int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

		printSum( 11, 13, 17, 20 );
		printSum( a );
	}
}
