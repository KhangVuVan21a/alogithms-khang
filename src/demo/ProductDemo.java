package demo;

import java.util.Scanner;

import entity.Product;

public class ProductDemo {
	public Product createProductTest() {
		Scanner scanner=new Scanner(System.in);
		int id=scanner.nextInt();
		String name=scanner.nextLine();
		int categoryId=scanner.nextInt();
		return new Product(id,name,categoryId);
	}
	public void printProduct(Product product) {
		System.out.println(product.toString());
	}
}
