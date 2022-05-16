package devfast_thuctap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bai14mapProductByCategory {
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
		ArrayList<Category> listCategory = new ArrayList<Category>();
		listCategory.add(new Category(1,"Computer"));
		listCategory.add(new Category(2,"Memory"));
		listCategory.add(new Category(3,"Card"));
		listCategory.add(new Category(4,"Acsesory"));
		Map<Product, String>map =mapProductByCategory(listProducts, listCategory);
		for(Product i:map.keySet()) {
			System.out.println(i.toString()+map.get(i));
		}
	}
	public static Map<Product,String>mapProductByCategory(ArrayList<Product> listProducts,ArrayList<Category> listCategories){
		Map<Product,String> mapProduct=new HashMap<Product, String>(); 
		for(int i=0;i<listCategories.size();i++) {
			if(findCategoryById(listCategories, listProducts.get(i).getCategoryId())==null) {
				mapProduct.put(listProducts.get(i), "");
			}else {
				mapProduct.put(listProducts.get(i),findCategoryById(listCategories, listProducts.get(i).getCategoryId()).getName());
			}
		}
		return mapProduct;
	}
	public static Category findCategoryById(ArrayList<Category> listCategories,int categoryId) {
		for(int i=0;i<listCategories.size();i++) {
			if(listCategories.get(i).getId() == categoryId) {
				return listCategories.get(i);
			}
		}
		System.out.println(categoryId);
		return null;	
	}
}
