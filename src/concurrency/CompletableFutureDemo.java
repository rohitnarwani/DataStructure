package concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main pipeline initiating order orchestration...");
		// Asynchronously initiate workflow pipeline
		CompletableFuture.supplyAsync(() -> {
			// Task 1: Fetch order price from database asynchronously
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			return 500.0; // Base Price
		}).thenApply(basePrice -> {
			// Task 2: Calculate tax multiplier once data becomes available
			System.out.println("Computing applicable tax rules...");
			return basePrice * 1.18; // 18% GST Applied
		}).thenAccept(finalPrice -> {
			// Task 3: Consume final value to print invoice safely
			System.out.println("Order finalized! Final Invoice Value: Rs. " + finalPrice);
		}).exceptionally(ex -> {
			// Error Handling Fallback Route
			System.out.println("An error occurred during transaction processing: " + ex.getMessage());
			return null;
		});
		// The main thread continues running independently!
		System.out.println("Main thread completely unblocked, performing independent tasks...");
		// Prevent main JVM exit before async task chain completes processing
		Thread.sleep(2500);
	}
}
