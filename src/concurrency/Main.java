package concurrency;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		Thread t = new Thread(th);
		Thread.sleep(5000);
		t.start();
		t.join();

	}
}
