package devfast_thuctap;

import java.util.ArrayList;


public class Bai2Array {

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
		for(int i=0;i<listProducts.size();i++) {
			System.out.println(listProducts.get(i).toString());
		}
	
//		String name= "HDD";
//		System.out.println(findProduct(listProducts, name).toString());
	}
//	public static Product findProduct(ArrayList<Product> listProducts,String nameProduct) {
//		for(int index=0;index< listProducts.size();index++) {
//			if(nameProduct == listProducts.get(index).getName()) {
//				return listProducts.get(index);
//			}
//		}
//		return null;
//	}

}
