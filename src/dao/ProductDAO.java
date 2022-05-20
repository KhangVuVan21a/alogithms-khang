package dao;

import java.util.ArrayList;

import entity.Product;

public class ProductDAO extends BaseDao{
	
	/**
	 * find product by "name" in data
	 * @param name
	 * @return product
	 */
	public Product findByName(String name) {
		for(Object object:database.selectTable(database.PRODUCT,"")) {
			Product product=(Product)object;
			if(name==product.getName()) {
				return product;
			}
		}
		return null;
	}
	/**
	 * search product
	 * @param where
	 * @return arrayList
	 */
	public ArrayList search(Product where) {
		ArrayList<Product> arrayList=new ArrayList<Product>();
		for(Object object:database.selectTable(database.PRODUCT,"")) {
			Product product=(Product)object;
			if(product.getId()==where.getId()) {
				arrayList.add(product);
			}
		}
		return arrayList;
	}
	
}
