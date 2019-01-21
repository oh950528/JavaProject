import java.util.Arrays;

public class Exam15 {

	static void sort(int[] a) {
		Arrays.sort(a);
	}

	static int[] insert(int[] a, int value) {
		int index = Arrays.binarySearch(a, value);
		if(index > 0)
			return a;
		else
			index =((index * -1) - 1);

		int [] n = new int[a.length+1];
		int count = 0;
		for(int i=0; i<n.length; i++) {
			if(i == index) 
				n[index] = value;
			else
				n[i] = a[count++];
		}
		return n;
	}


	public static void main(String[] args) {
		int[] a = { 3, 8, 1, 2, 4, 5, 7 };

		sort(a);
		System.out.println(Arrays.toString(a));

		a = insert(a, 2);
		a = insert(a, 6);
		System.out.println(Arrays.toString(a));
	}
}
