import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 75000));
		products.add(new Product("Phone", 30000));
// OLD WAY: Anonymous Inner Class
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.price, p2.price);
			}
		});
// MODERN WAY: Lambda Expression
// Syntax: (parameters) -> { body }
		Collections.sort(products, (p1, p2) -> Double.compare(p1.price, p2.price));
		System.out.println("Products sorted by price efficiently.");
	}
}