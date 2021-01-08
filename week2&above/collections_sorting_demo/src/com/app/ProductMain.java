package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100, "TV", 100.11, 2.2f, true));
		productList.add(new Product(200, "TV", 200.11, 4.7f, false));
		productList.add(new Product(101, "TV", 190.11, 4.2f, false));
		productList.add(new Product(140, "TV", 190.11, 3.2f, true));
		productList.add(new Product(120, "TV", 190.11, 4.7f, false));
		productList.add(new Product(199, "TV", 200.11, 4.2f, true));
		productList.add(new Product(166, "TV", 140.11, 4.7f, true));
		productList.add(new Product(133, "TV", 133.11, 2.2f, true));
		
		System.out.println("Printing all the products");
		printProducts(productList);
		
		Collections.sort(productList); // uses Functional Interface Comparable using which it compares 2 objects
		System.out.println("\n\nPrinting all the products in sorted order\n");
		printProducts(productList);
		
		Collections.sort(productList, new ProductAvailabilityComparator());
		System.out.println("\n\nPrinting all the products sorted by availability\n");
		printProducts(productList);
		
		Collections.sort(productList, (Product p1, Product p2) -> {
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\n\nPrinting all the products sorted by cost (low to high)\n");
		printProducts(productList);
		
		Collections.sort(productList, (Product p1, Product p2) -> {
			int x = 0;
			Float f1 = p1.getRatings();
			Float f2 = p2.getRatings();
			x = f2.compareTo(f1);
			if (x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\n\nPrinting all the products sorted by ratings (high to low) and if 2 or more products have same rating then by cost (low to high)\n");
		printProducts(productList);
	}
	public static void printProducts(List<Product> productList) {
		for (Product p: productList) {
			System.out.println(p);
		}
	}

}

// Task try to recreate the same for Flight(id, name, manufactureName, cost, rating, availability)