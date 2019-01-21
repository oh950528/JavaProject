
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	static void add(List<Integer> list, int count) {
		// list 목록에 0부터 count 개의 정수를 추가한다.
		for(int i = 0; i < count; i++) {
			list.add(i);
		}
	}

	static void removeEven(List<Integer> list) {
		// list 목록에서 짝수를 전부 제거한다. 
		Iterator<Integer> a = list.iterator(); //<Integer>선언을 하지않으면 아래의 %연산시 type정보 오류가 난다. 이유는 소스코드에만 의존하고 그 실제 객체의 타입을 검사하지 않는다.
		while(a.hasNext()) {
			if(a.next()%2 == 0)
				a.remove();
		}
	}

	static void addEven(List<Integer> list) {
		// list 목록의 홀수 값들 사이에 짝수 값을 삽입한다.
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
    	
    	//다른 구현
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
