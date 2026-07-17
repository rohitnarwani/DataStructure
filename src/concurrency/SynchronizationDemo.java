package concurrency;

public class SynchronizationDemo {
	class BankAccount {
		private int balance = 1000;

		// The 'synchronized' keyword locks the method to a single thread at a time
		public synchronized void deposit(int amount) {
			int initialBalance = balance;
			// Introduce small deliberate delay to simulate real network context processing
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			balance = initialBalance + amount;
		}

		public int getBalance() {
			return balance;
		}
	}

//T1 locked -> methodA,-> method B
//T2 locked-> methodB -> method A
	public static void main(String[] args) throws InterruptedException {
		BankAccount account = new SynchronizationDemo().new BankAccount();
		// Spawn two threads both attempting to deposit money simultaneously
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 50; i++)
				account.deposit(10);
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 50; i++)
				account.deposit(10);
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join(); // Wait for both threads to finish
		// Expected balance: 1000 + (50 * 10) + (50 * 10) = 2000
		System.out.println("Final secure account balance: " + account.getBalance());
	}

}
