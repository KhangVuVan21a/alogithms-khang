package demo;

import dao.AccessoryDAO;
import dao.CategoryDAO;
import dao.Database;
import entity.Accessory;
import entity.Category;
import entity.Product;

public class AccessoryDaoDemo {
	public static void main(String[] args) {
		initDatabaseTest();
		AccessoryDAO dao=new AccessoryDAO();
		System.out.println(dao.search( new Accessory(2, "acc2")));
		System.out.println(dao.insert(  new Accessory(100, "acc3")));
		System.out.println(dao.update( new Accessory(100, "acc3")));
		System.out.println(dao.delete(new Accessory(100, "acc3")));
		System.out.println(dao.findAll(Accessory.class.getName()));
		System.out.println(dao.findById(Accessory.class.getName(),4));
	}
	public static void initDatabaseTest() {
		Database database=Database.getInstants();
		System.out.println(database.insertTable(Product.class.getName(), new Product(1,"CPU",1)));
		System.out.println(database.insertTable(Product.class.getName(), new Product(2,"RAM",2)));
		System.out.println(database.insertTable(Product.class.getName(), new Product(3,"HDD",2)));
		System.out.println(database.insertTable(Product.class.getName(), new Product(4,"Main",1)));
		System.out.println(database.insertTable(Product.class.getName(),new Product(5,"Keyboard",4)));
		System.out.println(database.insertTable(Product.class.getName(), new Product(6,"Mouse",4)));
		System.out.println(database.insertTable(Category.class.getName(), new Category(1, "Computer")));
		System.out.println(database.insertTable(Category.class.getName(),new Category(2, "Memory")));
		System.out.println(database.insertTable(Category.class.getName(), new Category(3, "Card")));
		System.out.println(database.insertTable(Category.class.getName(), new Category(4, "Accessory")));
		System.out.println(database.insertTable(Accessory.class.getName(),  new Accessory(1, "acc1")));
		System.out.println(database.insertTable(Accessory.class.getName(),   new Accessory(2, "acc2")));
		System.out.println(database.insertTable(Accessory.class.getName(),   new Accessory(3, "acc3")));
		System.out.println(database.insertTable(Accessory.class.getName(),   new Accessory(4, "acc4")));
		System.out.println(database.insertTable(Accessory.class.getName(),  new Accessory(5, "acc5")));
			
		
	}
	public void printTableTest() {
		for(Object i:Database.getInstants().selectTable("product","")) {
			System.out.println((Product)i);
		}
		for(Object i:Database.getInstants().selectTable("category","")) {
			System.out.println((Category)i);
		}
		for(Object i:Database.getInstants().selectTable("accessory","")) {
			System.out.println((Accessory)i);
		}
	}
	public void insertTableTest() {
		System.out.println(Database.getInstants().insertTable("product",new Product(10, "Product10",2)));
		System.out.println(Database.getInstants().insertTable("category",new Category(6, "Categori6")));
		System.out.println(Database.getInstants().insertTable("accessory",new Accessory(6, "Accessory6")));
	}
	public void selectTableTest() {
		for(Object i:Database.getInstants().selectTable("product","")) {
			System.out.println((Product)i);
		}
		for(Object i:Database.getInstants().selectTable("category","")) {
			System.out.println((Category)i);
		}
		for(Object i:Database.getInstants().selectTable("accessory","")) {
			System.out.println((Accessory)i);
		}
	}
	public void updateTableTest() {
		System.out.println(Database.getInstants().updateTableById(1, Database.getInstants().selectTable("product","")));

	}
	public void deleteTableTest() {
		System.out.println(Database.getInstants().deleteTable("product", new Product(3,"HDD",2)));
		System.out.println(Database.getInstants().deleteTable("category", new Category(3, "Card")));
		System.out.println(Database.getInstants().deleteTable("accessory", new Accessory(4, "acc4")));	
	}
	public void truncateTableTest() {
		Database.getInstants().truncateTable("product");
		Database.getInstants().truncateTable("category");
		Database.getInstants().truncateTable("accessory");
		printTableTest();
	}
	public void insertTest() {
		System.out.println(Database.getInstants().insertTable("product",new Product(10, "Product10",2)));
		System.out.println(Database.getInstants().insertTable("category",new Category(6, "Categori6")));
		System.out.println(Database.getInstants().insertTable("accessory",new Accessory(6, "Accessory6")));

	}
	public void findAllTest() {
		System.out.println(Database.getInstants().findAll("product", 1).toString());
		System.out.println(Database.getInstants().findAll("category", 1).toString());
		System.out.println(Database.getInstants().findAll("accessory", 1).toString());
	}
	public void updateTest() {
		System.out.println(Database.getInstants().updateTableById(1,new Product(10, "Product10",2)));
		System.out.println(Database.getInstants().updateTableById(1,new Category(7, "Category7")));
		System.out.println(Database.getInstants().updateTableById(1,new Accessory(7, "Accessory")));
	}
}
