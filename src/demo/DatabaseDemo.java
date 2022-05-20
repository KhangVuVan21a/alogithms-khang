
package demo;


import java.lang.reflect.Array;
import java.util.ArrayList;

import dao.Database;
import dao.ProductDAO;
import entity.Accessory;
import entity.Category;
import entity.Product;

public class DatabaseDemo{
	public static void main(String[] args) {
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
		
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		System.out.println(database.updateTable(Product.class.getName(),  new Product(1,"CPU",2)));
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		System.out.println(database.updateTable(Category.class.getName(),  new Category(1, "ComputerEEEEEE")));
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		System.out.println(database.updateTable(Accessory.class.getName(),   new Accessory(1, "acc111111")));
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		System.out.println(database.deleteTable(Product.class.getName(), new Product(2,"RAM",2)));
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		System.out.println(database.deleteTable(Category.class.getName(), new Category(1, "Computer")));
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		System.out.println(database.deleteTable(Accessory.class.getName(),   new Accessory(1, "acc1")));
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
		
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		database.truncateTable(Product.class.getName());
//		System.out.println(database.selectTable(Product.class.getName(), ""));
		
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		database.truncateTable(Category.class.getName());
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		database.truncateTable(Accessory.class.getName());
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
		
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		System.out.println(database.updateTableById(2, new Product(2,"RAAM",2)));
//		System.out.println(database.selectTable(Product.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		System.out.println(database.updateTableById(1, new Category(1, "ComputerRRRRR")));
//		System.out.println(database.selectTable(Category.class.getName(), ""));
//		
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		System.out.println(database.updateTableById(1,   new Accessory(1, "acc12")));
//		System.out.println(database.selectTable(Accessory.class.getName(), ""));
//		System.out.println(database.findAll(Product.class.getName()));
//		System.out.println(database.findAll(Category.class.getName()));
//		System.out.println(database.findAll(Accessory.class.getName()));
		
//		System.out.println(database.findAll(Product.class.getName(),1));
//		System.out.println(database.findAll(Category.class.getName(),1));
//		System.out.println(database.findAll(Accessory.class.getName(),1));
		
		System.out.println(database.findById(Product.class.getName(),1));
		System.out.println(database.findById(Category.class.getName(),1));
		System.out.println(database.findById(Accessory.class.getName(),1));
		//printTableTest();
		
//		ProductDAO dao=new ProductDAO();
//		dao.insert( new Product(1,"CPU",1));
//		System.out.println(dao.findAll(Product.class.getName()));
//		System.out.println(dao.findById(Product.class.getName(), 1).toString());
		
	}
	public void initDatabaseTest() {
		Database database=Database.getInstants();
//		database.insertTable("product", new Product(1,"CPU",1));
//		database.insertTable("product", new Product(2,"RAM",2));
//		database.insertTable("product", new Product(3,"HDD",2));
//		database.insertTable("product", new Product(4,"Main",1));
//		database.insertTable("product", new Product(5,"Keyboard",4));
//		database.insertTable("product", new Product(6,"Mouse",4));
//		database.insertTable("product", new Product(7,"VGA",3));
//		database.insertTable("product", new Product(8,"Monitor",2));
//		database.insertTable("product", new Product(9,"Case",5));
//		database.insertTable("category", new Category(1, "Computer"));
//		database.insertTable("category", new Category(2, "Memory"));
//		database.insertTable("category", new Category(3, "Card"));
//		database.insertTable("category", new Category(4, "Accessory"));
//		database.insertTable("category", new Category(5, "Device"));
//		database.insertTable("accessory", new Accessory(1, "acc1"));
//		database.insertTable("accessory", new Accessory(2, "acc2"));
//		database.insertTable("accessory", new Accessory(3, "acc3"));
//		database.insertTable("accessory", new Accessory(4, "acc4"));
//		database.insertTable("accessory", new Accessory(5, "acc5"));
			
		
	}
	public static void printTableTest() {
		for(Object i:Database.getInstants().selectTable(Product.class.getName(),"")) {
			System.out.println((Product)i);
		}
		for(Object i:Database.getInstants().selectTable(Category.class.getName(),"")) {
			System.out.println((Category)i);
		}
		for(Object i:Database.getInstants().selectTable(Accessory.class.getName(),"")) {
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
