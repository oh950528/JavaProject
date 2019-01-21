import java.util.Random;

class SharedObject {
	int sum = 0;

	synchronized void add(int i) {
		sum = sum + i;
	}

	synchronized void sub(int i) {
		sum = sum - i;
	}
}

class Thread1 extends Thread {

	String name;
	int count;
	SharedObject sharedObject;
	Random random;

	public Thread1(String name, int count, SharedObject sharedObject) {
		this.name = name;
		this.count = count;
		this.sharedObject = sharedObject;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for(int i = 0; i <= count; ++i) {
				sharedObject.add(i);
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObject.sum);
	}
}

class Thread2 extends Thread {

	String name;
	int count;
	SharedObject sharedObject;
	Random random;

	public Thread2(String name, int count, SharedObject sharedObject) {
		this.name = name;
		this.count = count;
		this.sharedObject = sharedObject;
		this.random = new Random();
	}

	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try {
			for(int i = 0; i <= count; ++i) {
				sharedObject.sub(i);
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e) {
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObject.sum);
	}
}
public class 실습문제 {

	public static void main(String[] args) {
		SharedObject sharedObject = new SharedObject();
		Thread1 threadOne = new Thread1("one", 100, sharedObject);
		Thread2 threadTwo = new Thread2("two", 100, sharedObject);
		threadOne.start();
		threadTwo.start();
	}
}
