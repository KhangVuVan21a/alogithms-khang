package dao;

import java.util.ArrayList;

import entity.Accessory;
import entity.Category;
import entity.Product;

public class AccessoryDAO extends BaseDao {
	/**
	 * search accessory 
	 * @param where
	 * @return arrayList
	 */
	public ArrayList search(Accessory where) {
		ArrayList<Accessory> arrayList = new ArrayList<Accessory>();
		for (Object object : database.selectTable(database.ACCESSORY, "")) {
			Accessory accessory = (Accessory) object;
			if (accessory.getId()==where.getId()) {
				arrayList.add(accessory);
			}
		}
		return arrayList;
	}

}
