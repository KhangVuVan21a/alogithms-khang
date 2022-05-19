package dao;

import java.util.ArrayList;

import entity.Category;


public class CategoryDAO {
	//add "row" into data, return true if "row" added
	public boolean insert(Category row) {
		Database database= Database.getInstants();
		int check=database.insertTable(database.CATEGORY, row);
		return (check>0?true:false);
	}
	//update "row"
	public int update(Category row) {
		Database database = Database.getInstants();
		int check = database.updateTable(database.CATEGORY, row);
		return check;
	}
	public boolean delete(Object row) {
		Database database =Database.getInstants();
		return database.deleteTable(database.CATEGORY, row);
	}
	public ArrayList findAll() {
		Database database =Database.getInstants();
		return database.selectTable(database.CATEGORY,"");
	}
	public Object findById(int id) {
		Database database=Database.getInstants();
		return database.findAll(database.CATEGORY, id);
	}
}
