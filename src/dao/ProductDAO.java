package dao;

import java.util.ArrayList;

import entity.Product;

public class ProductDAO {
	public int insert(Product row) {
		Database database = Database.getInstants();
		return database.insertTable("product", row);
	}
	public int update(Product row) {
		Database database =Database.getInstants();
		return database.updateTable("product", row);
	}
	public boolean delete(Product row) {
		Database database=Database.getInstants();
		return database.deleteTable("product", row); 
	}
	public ArrayList findAll() {
		Database database = Database.getInstants();
		return database.findAll("product", 1);
	}
	public Object findById(int id) {
		Database database = Database.getInstants();
		for(Object object:database.selectTable("product","")) {
			Product product=(Product)object;
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
	public Object findByName(String name) {
		Database database = Database.getInstants();
		for(Object object:database.selectTable("product","")) {
			Product product=(Product)object;
			if(product.getName() == name) {
				return product;
			}
		}
		return null;
	}
	public ArrayList search(Product where) {
		Database database = Database.getInstants();
		ArrayList<Product> arrayList=new ArrayList<Product>();
		for(Object object:database.selectTable("product","")) {
			Product product=(Product)object;
			if(product.equals(where)) {
				arrayList.add(product);
			}
		}
		return arrayList;
	}
	
}
