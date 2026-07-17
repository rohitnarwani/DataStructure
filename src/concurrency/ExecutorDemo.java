package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
	public static void main(String[] args) {
		// Create a fixed thread pool containing 3 dedicated worker threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		// Submit 5 independent processing tasks to the executor
		for (int i = 1; i <= 8; i++) {
			final int taskId = i;
			Future<?> f = executor.submit(() -> {
				String threadName = Thread.currentThread().getName();
				System.out.println("Executing Task " + taskId + " via thread: " + threadName);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			});

		}

		// Gracefully shut down the executor once tasks finish execution
		executor.shutdown();
	}
}
