
interface Parent {
	void method1();
}

class Child1 implements Parent{
	@Override
	public void method1() {
		System.out.println("Child1");
	}
}

class Child2 implements Parent{
	@Override
	public void method1() {
		System.out.println("Child2");
	}
}

public class Exam09 {
	
	static void doSomething(Parent parent) {
		parent.method1();
	}

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		doSomething(child1); 
		doSomething(child2);
	}
}
