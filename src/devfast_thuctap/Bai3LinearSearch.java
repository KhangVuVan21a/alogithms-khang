package devfast_thuctap;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> listProducts = new ArrayList<Product>();
		listProducts.add(new Product("CPU",750,10,1));
		listProducts.add(new Product("RAM",50,2,2));
		listProducts.add(new Product("HDD",70,1,2));
		listProducts.add(new Product("Main",400,3,1));
		listProducts.add(new Product("Keyboard",30,8,4));
		listProducts.add(new Product("Mouse",25,50,4));
		listProducts.add(new Product("VGA",60,35,3));
		listProducts.add(new Product("Monitor",750,10,1));
		listProducts.add(new Product("Case",120,28,5));
		Scanner scanner =new Scanner(System.in);
		String name = (scanner.nextLine());
		//String name="RAM";

		System.out.println(findProduct(listProducts, name.trim()).toString());
		
	}
	public static Product findProduct(ArrayList<Product> listProducts,String nameProduct) {
		for(int index=0;index< listProducts.size();index++) {
			if(nameProduct.equals( listProducts.get(index).getName())) {
				return listProducts.get(index);
			}
		}
		return null;
	}

}
