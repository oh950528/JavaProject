import java.util.Random;

class RunnableA implements Runnable {

	String name;
	Random random;

	public RunnableA(String name) {
		this.name = name;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 0; i < 100; ++i) {
				System.out.printf("%s: %d\n", name, i);
				int mili_second = random.nextInt(100);
				Thread.sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
	}
}

public class Example02 {

	public static void main(String[] args) {
		Thread threadOne = new Thread(new RunnableA("one"));
		Thread threadTwo = new Thread(new RunnableA("two"));
		Thread threadThree = new Thread(new RunnableA("three"));
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
