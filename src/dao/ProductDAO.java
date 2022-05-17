package dao;

import java.util.ArrayList;

import entity.Product;

public class ProductDAO {
	public int insert(Product row) {
		Database database = new Database();
		return database.insertTable("product", row);
	}
	public int update(Product row) {
		Database database =new Database();
		return database.updateTable("product", row);
	}
	public boolean delete(Product row) {
		Database database=new Database();
		return database.deleteTable("product", row); 
	}
	public ArrayList findAll() {
		Database database = new Database();
		return database.findAll("product", 1);
	}
	public Object findById(int id) {
		Database database = new Database();
		for(Object object:database.selectTable("product","")) {
			Product product=(Product)object;
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}
	public Object findByName(String name) {
		Database database = new Database();
		for(Object object:database.selectTable("product","")) {
			Product product=(Product)object;
			if(product.getName() == name) {
				return product;
			}
		}
		return null;
	}
	public ArrayList search(Product where) {
		Database database = new Database();
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
