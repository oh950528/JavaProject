import java.util.ArrayList;
import java.util.Arrays;

public class Example3 {

	static void solution(int[] a) {
		// �迭 a���� 2�� ����� 3�� ����� ��� �����ϰ�
		// ���ŵ� �׸��� �� �׸���� ������ ��ܾ� �Ѵ�.
		// ���ŵ� �׸� ������ ���� �迭 ���� ������ -1�� ä����
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < a.length; i++)
			if((a[i] % 2) != 0 && (a[i] % 3) != 0)
				list.add(a[i]);
		for(int i = 0; i < a.length; i++)
			a[i] = (i < list.size() ? list.get(i) : -1);
	}
	
	static void solution2(int[] a) {
		for(int i = 0; i < a.length; ++i)
			if((a[i] % 2) == 0 || (a[i] % 3) == 0) {
				removeAt(a, i);
				a[a.length - 1] = -1;
				--i;
			}
	}
	
	static void removeAt(int[] a, int index) {
		for(int i = index; i < a.length - 1; ++i)
			a[i] = a[i + 1];
	}
	

	public static void main(String[] args) {
		int[] a = new int[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7};
		System.out.println(Arrays.toString(a));
		solution(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[] {1, 6, 1, 8, 9, 2, 2, 3, 5, 3, 1, 3, 7};
		System.out.println(Arrays.toString(b));
		solution2(b);
		System.out.println(Arrays.toString(b));
	}
}
