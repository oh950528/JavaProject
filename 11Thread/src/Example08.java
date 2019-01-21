import java.util.Random;

class SharedObjA {
	int sum = 0;

	void add(int i) {
		sum = sum + i;
	}
}

class ThreadH extends Thread {

	String name;
	int count;
	SharedObjA sharedObj;
	Random random;

	public ThreadH(String name, int count, SharedObjA sharedObj) {
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for (int i = 1; i <= count; ++i) {
				sharedObj.add(i);
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObj.sum);
	}
}

public class Example08 {

	public static void main(String[] args) {
		SharedObjA sharedObj = new SharedObjA();
		ThreadH threadOne = new ThreadH("one", 100, sharedObj);
		ThreadH threadTwo = new ThreadH("two", 100, sharedObj);
		ThreadH threadThree = new ThreadH("three", 100, sharedObj);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
