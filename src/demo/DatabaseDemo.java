package demo;


import dao.Database;
import devfast_thuctap.Category;
import entity.Accessory;
import entity.Product;

public class DatabaseDemo{
	private Database database;
	public void initDatabaseTest() {
		database=new Database();
		database.insertTable("product", new Product(1,"CPU",1));
		database.insertTable("product", new Product(2,"RAM",2));
		database.insertTable("product", new Product(3,"HDD",2));
		database.insertTable("product", new Product(4,"Main",1));
		database.insertTable("product", new Product(5,"Keyboard",4));
		database.insertTable("product", new Product(6,"Mouse",4));
		database.insertTable("product", new Product(7,"VGA",3));
		database.insertTable("product", new Product(8,"Monitor",2));
		database.insertTable("product", new Product(9,"Case",5));
		database.insertTable("category", new Category(1, "Computer"));
		database.insertTable("category", new Category(2, "Memory"));
		database.insertTable("category", new Category(3, "Card"));
		database.insertTable("category", new Category(4, "Accessory"));
		database.insertTable("category", new Category(5, "Device"));
		database.insertTable("accessory", new Accessory(1, "acc1"));
		database.insertTable("accessory", new Accessory(2, "acc2"));
		database.insertTable("accessory", new Accessory(3, "acc3"));
		database.insertTable("accessory", new Accessory(4, "acc4"));
		database.insertTable("accessory", new Accessory(5, "acc5"));
			
		
	}
	public void printTableTest() {
		for(Object i:database.instants.selectTable("product","")) {
			System.out.println((Product)i);
		}
		for(Object i:database.instants.selectTable("category","")) {
			System.out.println((Category)i);
		}
		for(Object i:database.instants.selectTable("accessory","")) {
			System.out.println((Accessory)i);
		}
	}
	public void insertTableTest() {
		System.out.println(database.insertTable("product",new Product(10, "Product10",2)));
		System.out.println(database.insertTable("category",new Category(6, "Categori6")));
		System.out.println(database.insertTable("accessory",new Accessory(6, "Accessory6")));
	}
	public void selectTableTest() {
		for(Object i:database.instants.selectTable("product","")) {
			System.out.println((Product)i);
		}
		for(Object i:database.instants.selectTable("category","")) {
			System.out.println((Category)i);
		}
		for(Object i:database.instants.selectTable("accessory","")) {
			System.out.println((Accessory)i);
		}
	}
	public void updateTableTest() {
		System.out.println(database.instants.updateTableById(1, database.instants.selectTable("product","")));

	}
	public void deleteTableTest() {
		System.out.println(database.deleteTable("product", new Product(3,"HDD",2)));
		System.out.println(database.deleteTable("category", new Category(3, "Card")));
		System.out.println(database.deleteTable("accessory", new Accessory(4, "acc4")));	
	}
	public void truncateTableTest() {
		database.truncateTable("product");
		database.truncateTable("category");
		database.truncateTable("accessory");
		printTableTest();
	}
	public void insertTest() {
		System.out.println(database.insertTable("product",new Product(10, "Product10",2)));
		System.out.println(database.insertTable("category",new Category(6, "Categori6")));
		System.out.println(database.insertTable("accessory",new Accessory(6, "Accessory6")));

	}
	public void findAllTest() {
		System.out.println(database.findAll("product", 1).toString());
		System.out.println(database.findAll("category", 1).toString());
		System.out.println(database.findAll("accessory", 1).toString());
	}
	public void updateTest() {
		System.out.println(database.updateTableById(1,new Product(10, "Product10",2)));
		System.out.println(database.updateTableById(1,new Category(7, "Category7")));
		System.out.println(database.updateTableById(1,new Accessory(7, "Accessory")));
	}
}
