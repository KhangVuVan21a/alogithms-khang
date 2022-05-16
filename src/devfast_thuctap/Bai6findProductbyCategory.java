package devfast_thuctap;

import java.util.ArrayList;

public class Bai6findProductbyCategory {
	public static void main(String[] args) {
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
		// Arraylist Category
		ArrayList<Category> listCategory= new ArrayList<Category>();
		listCategory.add(new Category(1,"Computer"));
		listCategory.add(new Category(2,"Memory"));
		listCategory.add(new Category(3,"Card"));
		listCategory.add(new Category(4,"Acsesory"));
		int price =100;
		ArrayList<Product> list= findProductByPrice(listProducts, price);
		for(Product i:list) {
			System.out.println(i.toString());
		}
	}
	public static ArrayList<Product> findProductByPrice(ArrayList<Product> listProducts,int price) {
		ArrayList<Product> products=new ArrayList<Product>();
		for(int index=0;index< listProducts.size();index++) {
			if(listProducts.get(index).getPrice()<=price) {
				products.add(listProducts.get(index));
			}
		}
		if(products.size()==0) {
			return null;
		}
		else {
			return products;
		}
	}
}
