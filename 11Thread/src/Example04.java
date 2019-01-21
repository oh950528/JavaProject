import java.util.Random;

class ThreadC extends Thread {

	String name;
	int count;
	int sum;
	Random random;

	public ThreadC(String name, int count) {
		this.name = name;
		this.count = count;
		this.sum = 0;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				sum = sum + i;
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
	}
}

public class Example04 {

	public static void main(String[] args) {
		System.out.println("main started");
		ThreadC threadOne = new ThreadC("one", 100);
		ThreadC threadTwo = new ThreadC("two", 100);
		ThreadC threadThree = new ThreadC("three", 100);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		System.out.printf("one: %d\n", threadOne.sum);
		System.out.printf("two: %d\n", threadTwo.sum);
		System.out.printf("three: %d\n", threadThree.sum);
		System.out.println("main stoped");
	}
}
