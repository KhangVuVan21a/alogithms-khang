package dao;

import java.util.ArrayList;

import entity.Category;
import entity.Product;

public class CategoryDAO extends BaseDao{
	/**
	 * search category
	 * @param where
	 * @return arrayList
	 */
	public ArrayList search(Category where) {
		ArrayList<Category> arrayList = new ArrayList<Category>();
		for (Object object : database.selectTable(database.CATEGORY, "")) {
			Category category = (Category) object;
			if (category.equals(where)) {
				arrayList.add(category);
			}
		}
		return arrayList;
	}
}
