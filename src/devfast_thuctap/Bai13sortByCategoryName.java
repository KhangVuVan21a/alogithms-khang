package devfast_thuctap;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bai13sortByCategoryName {

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
		//listProducts.add(new Product("Case",120,28,5));
		// Arraylist Category
		ArrayList<Category> listCategory = new ArrayList<Category>();
		listCategory.add(new Category(1,"Computer"));
		listCategory.add(new Category(2,"Memory"));
		listCategory.add(new Category(3,"Card"));
		listCategory.add(new Category(4,"Acsesory"));
		ArrayList<Product> list =sortByCategory(listProducts, listCategory);
		for(int i=0;i<listProducts.size();i++) {
			System.out.println(listProducts.get(i).toString());
		}
		//findCategoryById(listCategory, 1);
//		sortByName(listCategory);
//		for(Category i:listCategory) {
//			System.out.println(i.toString());
//		}
	}
	public static  ArrayList<Product> sortByCategory(ArrayList<Product> listProducts,ArrayList<Category> listCategories){
		for(int i=1;i<listProducts.size();i++) {
			Product product=listProducts.get(i);
			Category category=findCategoryById(listCategories, listProducts.get(i).getCategoryId());
			int j=i-1;
			Category j1=findCategoryById(listCategories, listProducts.get(j).getCategoryId());
			if(category==null) {
				break;
			}
			while(j>=0 && j1.getName().compareTo(category.getName())>0 && j1!=null) {
				listProducts.set(j+1, listProducts.get(j));
				j--;
				if(j>=0)
				j1=findCategoryById(listCategories, listProducts.get(j).getCategoryId());
			}
			
			listProducts.set(j+1,product);
		}
		return listProducts;
	}
	
	public static Category findCategoryById(ArrayList<Category> listCategories,int categoryId) {
		for(int i=0;i<listCategories.size();i++) {
			if(listCategories.get(i).getId() == categoryId) {
				return listCategories.get(i);
			}
		}
		return null;	
	}
//	public static ArrayList<Category> sortByName(ArrayList<Category> listCategories){
//		for(int i=1;i<listCategories.size();i++) {
//			Category product=listCategories.get(i);
//			int j=i-1;
//			while(j>=0 && product.getName().compareTo(listCategories.get(j).getName())<0) {
//				listCategories.set(j+1, listCategories.get(j));
//				//System.out.println(listCategories.get(j));
//				j--;
//			}
//			
//			listCategories.set(j+1,product);
//		}
//		return listCategories;
//	}


}
