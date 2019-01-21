import java.util.Random;

class SharedObjB {
	int sum = 0;

	synchronized void add(int i) {
		sum = sum + i;
	}
}

class ThreadJ extends Thread {

	String name;
	int count;
	SharedObjB sharedObj;
	Random random;

	public ThreadJ(String name, int count, SharedObjB sharedObj) {
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

public class Example09 {

	public static void main(String[] args) {
		SharedObjB sharedObj = new SharedObjB();
		ThreadJ threadOne = new ThreadJ("one", 100, sharedObj);
		ThreadJ threadTwo = new ThreadJ("two", 100, sharedObj);
		ThreadJ threadThree = new ThreadJ("three", 100, sharedObj);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}
}
