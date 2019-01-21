
public class Example03 {

	int a = 3, b = 4;

	class InnerClass {

		int temp = 0;

		void swap() {
			temp = a;
			a = b;
			b = temp;
		}
	}


	void doSomething() {
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	}

	public static void main(String[] args) {
		new Example03().doSomething();
	}
}
