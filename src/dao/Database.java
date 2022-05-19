package dao;

import java.util.ArrayList;

import entity.Accessory;
import entity.Category;
import entity.Product;

public class Database {
	private ArrayList<Product> productTable=new ArrayList<Product>();
	private ArrayList<Category> categoryTable=new ArrayList<Category>();
	private ArrayList<Accessory> accessoryTable=new ArrayList<Accessory>();
	private static final Database INSTANTS= new Database();
	// const string classname
	static final String PRODUCT="product";
	static final String CATEGORY="category";
	static final String ACCESSORY="accessory";
	private Database() {
		
	}
	public static Database getInstants() {
		return INSTANTS;
	}
	//add 1 Object for table by "name", return the number of row added
	public int insertTable(String name,Object row) {
		//add 1 object for productTable
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			this.productTable.add((Product)row);
			return 1;
		}
		//add 1 object for categoryTable
		if(name.equalsIgnoreCase(this.CATEGORY)){
			this.categoryTable.add((Category)row);
			return 1;
		}
		//add 1 object for accessoryTable
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			this.accessoryTable.add((Accessory)row);
			return 1;
		}else {
			return 0;
		}
	}
	// return arraylist by "name" and "where"
	public ArrayList selectTable(String name,String where){
		//return arraylist productTable
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			return this.productTable;
		}
		//return arraylist categoryTable
		if(name.equalsIgnoreCase(this.CATEGORY)){
			return this.categoryTable;
		}
		//return arraylist accessoryTable
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			return this.accessoryTable;
		}else {
			return null;
		}
	}
	// return the number of row updated by "name" and "row"
	public int updateTable(String name,Object row) {
		// the  number of row updated
		int count=0;
		//update productTable and count the number row updated
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			Product rows=(Product)row;
			for(int i=0;i<this.productTable.size();i++) {
				if(productTable.get(i).getId() == rows.getId())
				{
					productTable.set(i, rows);
					count++;
				}
			}
			return count;
		}
		//update categoryTable and count the number row updated
		if(name.equalsIgnoreCase(this.CATEGORY)){
			Category rows=(Category)row;
			for(int i=0;i<this.categoryTable.size();i++) {
				if(categoryTable.get(i).getId() == rows.getId())
				{
					categoryTable.set(i, rows);
					count++;
				}
			}
			return count;
		}
		//update accessoryTable and count the number row updated
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			Accessory rows=(Accessory)row;
			for(int i=0;i<this.accessoryTable.size();i++) {
				if(accessoryTable.get(i).getId() == rows.getId())
				{
					accessoryTable.set(i, rows);
					count++;
				}
			}
			return count;
		}else {
			return 0;
		}
	}
	//delete "row" by "name" in data, return true if it had more 1 row deleted else return false
	public boolean deleteTable(String name, Object row) {
		//delete "row" in productTable
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			Product rows=(Product)row;
			return productTable.remove(rows);
		}
		//delete "row" in categoryTable
		if(name.equalsIgnoreCase(this.CATEGORY)){
			Category rows=(Category)row;
			return categoryTable.remove(rows);
		}
		//delete "row" in accessoryTable
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			Accessory rows=(Accessory)row;
			return accessoryTable.remove(rows);
		}else {
			return false;
		}
	}
	//delete all data in table by "name"
	public void truncateTable(String name) {
		//delete all data in product
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			productTable.clear();
		}
		//delete all data in category
		if(name.equalsIgnoreCase(this.CATEGORY)){
			categoryTable.clear();
		}
		//delete all data in accessory
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			accessoryTable.clear();
		}
	}
	// update data by "Id" and return the number of row updated   
	public int updateTableById(int Id,Object row) {
		//the number of row updated
		int count=0;
		//update data in productTable 
		if(row.getClass().getName().equalsIgnoreCase(Product.class.getName())) {
			for(int i=0;i<productTable.size();i++) {
				if(Id == productTable.get(i).getId()) {
					productTable.set(i,(Product) row);
					count++;
				}
			}
			return count;
		}
		//update data in categoryTable 
		if(row.getClass().getName().equalsIgnoreCase(Category.class.getName())){
			for(int i=0;i<categoryTable.size();i++) {
				if(Id == categoryTable.get(i).getId()) {
					categoryTable.set(i,(Category) row);
					count++;
				}
			}
			return count;
		}
		//update data in accessoryTable 
		if(row.getClass().getName().equalsIgnoreCase(Accessory.class.getName())){
			for(int i=0;i<accessoryTable.size();i++) {
				if(Id == accessoryTable.get(i).getId()) {
					accessoryTable.set(i,(Accessory) row);
					count++;
				}
			}
			return count;
		}else {
			return 0;
		}
	}
	//find all table by "name" and "id", return arraylist 
	public ArrayList findAll(String name,int id) {
		
		// Add product for "arrayList"
		if(name.equalsIgnoreCase(this.PRODUCT)) {
			ArrayList<Product> arrayList= new ArrayList<Product>();
			for(int i=0;i<productTable.size();i++) {
				if(id== productTable.get(i).getId()) {
					arrayList.add(productTable.get(i));
				}
			}
			return arrayList;
		} 
		// Add category for "arrayList"
		if(name.equalsIgnoreCase(this.CATEGORY)){
			ArrayList<Category> arrayList= new ArrayList<Category>();
			for(int i=0;i<categoryTable.size();i++) {
				if(id== categoryTable.get(i).getId()) {
					arrayList.add(categoryTable.get(i));
				}
			}
			return arrayList;
			
		}
		// Add accessory for "arrayList"
		if(name.equalsIgnoreCase(this.ACCESSORY)){
			ArrayList<Accessory> arrayList= new ArrayList<Accessory>();
			for(int i=0;i<accessoryTable.size();i++) {
				if(id== accessoryTable.get(i).getId()) {
					arrayList.add(accessoryTable.get(i));
				}
			}
			return arrayList;
		}
		return null;
	}
	
}
