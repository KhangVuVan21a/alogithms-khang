package dao;

import java.util.ArrayList;

import entity.Accessory;
import entity.Category;
import entity.Product;

public class Database {
	private ArrayList<Product> productTable = new ArrayList<Product>();
	private ArrayList<Category> categoryTable = new ArrayList<Category>();
	private ArrayList<Accessory> accessoryTable = new ArrayList<Accessory>();
	private static Database INSTANTS;
	static final String PRODUCT = Product.class.getName();
	static final String CATEGORY = Category.class.getName();
	static final String ACCESSORY = Accessory.class.getName();

	private Database() {

	}

	public static Database getInstants() {
		if (INSTANTS == null) {
			INSTANTS = new Database();
		}
		return INSTANTS;
	}

	/**
	 * add 1 Object for table by "name", return the number of row added
	 * 
	 * @param name
	 * @param row
	 * @return
	 */
	public int insertTable(String name, Object row) {
		// add 1 object for productTable
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			this.productTable.add((Product) row);
			return 1;
		}
		// add 1 object for categoryTable
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			this.categoryTable.add((Category) row);
			return 1;
		}
		// add 1 object for accessoryTable
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			this.accessoryTable.add((Accessory) row);
			return 1;
		} else {
			return 0;
		}
	}

	// return arraylist by "name" and "where"
	/**
	 * select dataTable
	 * 
	 * @param name
	 * @param where
	 * @return
	 */
	public ArrayList selectTable(String name, String where) {
		// return arraylist productTable
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			return this.productTable;
		}
		// return arraylist categoryTable
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			return this.categoryTable;
		}
		// return arraylist accessoryTable
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			return this.accessoryTable;
		} else {
			return null;
		}
	}

	/**
	 * return the number of row updated by "name" and "row"
	 * 
	 * @param name
	 * @param row
	 * @return
	 */
	public int updateTable(String name, Object row) {
		// the number of row updated
		int count = 0;
		// update productTable and count the number row updated
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			Product rows = (Product) row;
			for (int i = 0; i < this.productTable.size(); i++) {
				if (productTable.get(i).getId() == rows.getId()) {
					productTable.set(i, rows);
					count++;
				}
			}
			return count;
		}
		// update categoryTable and count the number row updated
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			Category rows = (Category) row;
			for (int i = 0; i < this.categoryTable.size(); i++) {
				if (categoryTable.get(i).getId() == rows.getId()) {
					categoryTable.set(i, rows);
					count++;
				}
			}
			return count;
		}
		// update accessoryTable and count the number row updated
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			Accessory rows = (Accessory) row;
			for (int i = 0; i < this.accessoryTable.size(); i++) {
				if (accessoryTable.get(i).getId() == rows.getId()) {
					accessoryTable.set(i, rows);
					count++;
				}
			}
			return count;
		} else {
			return 0;
		}
	}

	/**
	 * delete "row" by "name" in data, return true if it had more 1 row deleted else
	 * return false
	 * 
	 * @param name
	 * @param row
	 * @return
	 */
	public boolean deleteTable(String name, Object row) {
		// delete id of "row" in productTable
		boolean check=false;
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			Product rows = (Product) row;
			for (int i=0;i<productTable.size();i++) {
				if (productTable.get(i).getId() == rows.getId()) {
					productTable.remove(i);
					check=true;
				}
			}
			return check;
		}
		// delete "row" in categoryTable
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			Category rows = (Category) row;
			for (int i=0;i<categoryTable.size();i++) {
				if (categoryTable.get(i).getId() == rows.getId()) {
					categoryTable.remove(i);
					check=true;
				}
			}
			return check;
		}
		// delete "row" in accessoryTable
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			Accessory rows = (Accessory) row;
			for (int i=0;i<accessoryTable.size();i++) {
				if (accessoryTable.get(i).getId() == rows.getId()) {
					accessoryTable.remove(i);
					check=true;
					
				}
			}
			return check;
		} else {
			return false;
		}
	}

	/**
	 * delete all data in table by "name"
	 * 
	 * @param name
	 */
	public void truncateTable(String name) {
		// delete all data in product
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			productTable.clear();
		}
		// delete all data in category
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			categoryTable.clear();
		}
		// delete all data in accessory
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			accessoryTable.clear();
		}
	}

	/**
	 * update data by "Id" and return the number of row updated
	 * 
	 * @param Id
	 * @param row
	 * @return
	 */
	public int updateTableById(int Id, Object row) {
		// the number of row updated
		int count = 0;
		// update data in productTable
		if (row.getClass().getName().equalsIgnoreCase(this.PRODUCT)) {
			for (int i = 0; i < productTable.size(); i++) {
				if (Id == productTable.get(i).getId()) {
					productTable.set(i, (Product) row);
					count++;
				}
			}
			return count;
		}
		// update data in categoryTable
		if (row.getClass().getName().equalsIgnoreCase(this.CATEGORY)) {
			for (int i = 0; i < categoryTable.size(); i++) {
				if (Id == categoryTable.get(i).getId()) {
					categoryTable.set(i, (Category) row);
					count++;
				}
			}
			return count;
		}
		// update data in accessoryTable
		if (row.getClass().getName().equalsIgnoreCase(this.ACCESSORY)) {
			for (int i = 0; i < accessoryTable.size(); i++) {
				if (Id == accessoryTable.get(i).getId()) {
					accessoryTable.set(i, (Accessory) row);
					count++;
				}
			}
			return count;
		} else {
			return 0;
		}
	}

	/**
	 * find table in data by "name" , return arraylist
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList findAll(String name) {

		// Add product for "arrayList"
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			ArrayList<Product> arrayList = new ArrayList<Product>();
			for (int i = 0; i < productTable.size(); i++) {
				arrayList.add(productTable.get(i));

			}
			return arrayList;
		}
		// Add category for "arrayList"
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			ArrayList<Category> arrayList = new ArrayList<Category>();
			for (int i = 0; i < categoryTable.size(); i++) {
				arrayList.add(categoryTable.get(i));

			}
			return arrayList;

		}
		// Add accessory for "arrayList"
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			ArrayList<Accessory> arrayList = new ArrayList<Accessory>();
			for (int i = 0; i < accessoryTable.size(); i++) {
				arrayList.add(accessoryTable.get(i));
			}
			return arrayList;
		}
		return null;
	}

	/**
	 * find all table by "name" and "id", return arraylist
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public ArrayList findAll(String name, int id) {

		// Add product for "arrayList"
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			ArrayList<Product> arrayList = new ArrayList<Product>();
			for (int i = 0; i < productTable.size(); i++) {
				if (id == productTable.get(i).getId()) {
					arrayList.add(productTable.get(i));
				}
			}
			return arrayList;
		}
		// Add category for "arrayList"
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			ArrayList<Category> arrayList = new ArrayList<Category>();
			for (int i = 0; i < categoryTable.size(); i++) {
				if (id == categoryTable.get(i).getId()) {
					arrayList.add(categoryTable.get(i));
				}
			}
			return arrayList;

		}
		// Add accessory for "arrayList"
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			ArrayList<Accessory> arrayList = new ArrayList<Accessory>();
			for (int i = 0; i < accessoryTable.size(); i++) {
				if (id == accessoryTable.get(i).getId()) {
					arrayList.add(accessoryTable.get(i));
				}
			}
			return arrayList;
		}
		return null;
	}

	/**
	 * // find object by "name" and "id"
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public Object findById(String name, int id) {
		// find product in data by id of "name"
		if (name.equalsIgnoreCase(this.PRODUCT)) {
			for (Object object : this.productTable) {
				Product product = (Product) object;
				if (product.getId() == id) {
					return product;
				}
			}
		}
		// find category in data by id of "name"
		if (name.equalsIgnoreCase(this.CATEGORY)) {
			for (Object object : this.categoryTable) {
				Category category = (Category) object;
				if (category.getId() == id) {
					return category;
				}
			}
		}
		// find accessory in data by id of "name"
		if (name.equalsIgnoreCase(this.ACCESSORY)) {
			for (Object object : this.accessoryTable) {
				Accessory accessory = (Accessory) object;
				if (accessory.getId() == id) {
					return accessory;
				}
			}
		}
		return null;
	}

}
