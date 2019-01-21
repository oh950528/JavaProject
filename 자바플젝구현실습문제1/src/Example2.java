
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	static void add(List<Integer> list, int count) {
		// list ��Ͽ� 0���� count ���� ������ �߰��Ѵ�.
		for(int i = 0; i < count; i++) {
			list.add(i);
		}
	}

	static void removeEven(List<Integer> list) {
		// list ��Ͽ��� ¦���� ���� �����Ѵ�. 
		Iterator<Integer> a = list.iterator(); //<Integer>������ ���������� �Ʒ��� %����� type���� ������ ����. ������ �ҽ��ڵ忡�� �����ϰ� �� ���� ��ü�� Ÿ���� �˻����� �ʴ´�.
		while(a.hasNext()) {
			if(a.next()%2 == 0)
				a.remove();
		}
	}

	static void addEven(List<Integer> list) {
		// list ����� Ȧ�� ���� ���̿� ¦�� ���� �����Ѵ�.
		Iterator<Integer> a =  list.iterator();
    	Collection<Integer> b = new ArrayList<>();
    	while(a.hasNext()) {
    		Integer c = a.next();
    		if(c%2 != 0) {
    			b.add(c-1);
    		}
    	}
    	list.addAll(b);
    	Collections.sort(list);
    	
    	//�ٸ� ����
//    	int count = list.size() *2;
//    	for(int i = 0; i < count; i +=2) {
//    		list.add(i, i);
//    	}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		add(list, 10);
		System.out.println(list.toString());

		removeEven(list);
		System.out.println(list.toString());

		addEven(list);
		System.out.println(list.toString());
	}
}
