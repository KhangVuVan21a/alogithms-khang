package dao;

import java.util.ArrayList;

import entity.Accessory;
import entity.Category;
import entity.Product;

public class Database {
	private ArrayList<Product> productTable=new ArrayList<Product>();
	private ArrayList<Category> categoryTable=new ArrayList<Category>();
	private ArrayList<Accessory> accessoryTable=new ArrayList<Accessory>();
	public Database instants;
	public int insertTable(String name,Object row) {
		if(name.equalsIgnoreCase("product")) {
			this.productTable.add((Product)row);
			return 1;
		}else if(name.equalsIgnoreCase("category")){
			this.categoryTable.add((Category)row);
			return 1;
		}else if(name.equalsIgnoreCase("accessory")){
			this.accessoryTable.add((Accessory)row);
			return 1;
		}else {
			return 0;
		}
	}
	public ArrayList selectTable(String name,String where){
		if(name.equalsIgnoreCase("product")) {
			return this.productTable;
		}else if(name.equalsIgnoreCase("category")){
			return this.categoryTable;
		}else if(name.equalsIgnoreCase("accessory")){
			return this.accessoryTable;
		}else {
			return null;
		}
	}
	public int updateTable(String name,Object row) {
		int count=0;
		if(name.equalsIgnoreCase("product")) {
			Product rows=(Product)row;
			for(int i=0;i<this.productTable.size();i++) {
				if(productTable.get(i).getId() == rows.getId())
				{
					productTable.set(i, rows);
					count++;
				}
			}
			return count;
		}else if(name.equalsIgnoreCase("category")){
			Category rows=(Category)row;
			for(int i=0;i<this.categoryTable.size();i++) {
				if(categoryTable.get(i).getId() == rows.getId())
				{
					categoryTable.set(i, rows);
					count++;
				}
			}
			return count;
		}else if(name.equalsIgnoreCase("accessory")){
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
	public boolean deleteTable(String name, Object row) {
		if(name.equalsIgnoreCase("product")) {
			Product rows=(Product)row;
			productTable.remove(rows);
			return true;
		}else if(name.equalsIgnoreCase("category")){
			Category rows=(Category)row;
			categoryTable.remove(rows);
			return true;
		}else if(name.equalsIgnoreCase("accessory")){
			Accessory rows=(Accessory)row;
			accessoryTable.remove(rows);
			return true;
		}else {
			return false;
		}
	}
	public void truncateTable(String name) {
		if(name.equalsIgnoreCase("product")) {
			productTable.clear();
		}else if(name.equalsIgnoreCase("category")){
			categoryTable.clear();
		}else if(name.equalsIgnoreCase("accessory")){
			accessoryTable.clear();
		}
	}
	public int updateTableById(int Id,Object row) {
		int count=0;
		if(row.getClass().getName().equalsIgnoreCase(Product.class.getName())) {
			for(int i=0;i<productTable.size();i++) {
				if(Id == productTable.get(i).getId()) {
					productTable.set(i,(Product) row);
					count++;
				}
			}
			return count;
		}else if(row.getClass().getName().equalsIgnoreCase(Category.class.getName())){
			for(int i=0;i<categoryTable.size();i++) {
				if(Id == categoryTable.get(i).getId()) {
					categoryTable.set(i,(Category) row);
					count++;
				}
			}
			return count;
		}else if(row.getClass().getName().equalsIgnoreCase(Accessory.class.getName())){
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
	public ArrayList findAll(String name,int id) {
		if(name.equalsIgnoreCase("product")) {
			ArrayList<Product> arrayList= new ArrayList<Product>();
			for(int i=0;i<productTable.size();i++) {
				if(id== productTable.get(i).getId()) {
					arrayList.add(productTable.get(i));
				}
			}
			return arrayList;
		}else if(name.equalsIgnoreCase("category")){
			ArrayList<Category> arrayList= new ArrayList<Category>();
			for(int i=0;i<categoryTable.size();i++) {
				if(id== categoryTable.get(i).getId()) {
					arrayList.add(categoryTable.get(i));
				}
			}
			return arrayList;
			
		}else if(name.equalsIgnoreCase("accessory")){
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
