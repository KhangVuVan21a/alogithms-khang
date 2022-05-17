package dao;

import java.util.ArrayList;

import entity.Category;


public class CategoryDAO {

	public boolean insert(Category row) {
		Database database=new Database();
		int check=database.insertTable("category", row);
		return (check>0?true:false);
	}
	public int update(Category row) {
		Database database = new Database();
		int check = database.updateTable("category", row);
		return check;
	}
	public boolean delete(Object row) {
		Database database =new  Database();
		return database.deleteTable("category", row);
	}
	public ArrayList findAll() {
		Database database =new Database();
		return database.selectTable("category","");
	}
	public Object findById(int id) {
		Database database=new Database();
		for(Object object:database.selectTable("category","" )) {
			Category category=(Category)object;
			if(category.getId()==id) {
				return category;
			}
		}
		return null;
	}
	
	
}
