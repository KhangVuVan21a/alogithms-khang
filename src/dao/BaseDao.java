package dao;

import java.util.ArrayList;

public abstract class BaseDao implements IDao {
	protected static Database database = Database.getInstants();

	/**
	 * insert data
	 * 
	 * @param row
	 * @return
	 */
	public int insert(Object row) {
		return database.insertTable(row.getClass().getName(), row);
	}

	/**
	 * update data
	 * 
	 * @param row
	 * @return
	 */
	public int update(Object row) {
		return database.updateTable(row.getClass().getName(), row);
	}

	/**
	 * delete data
	 * 
	 * @param row
	 * @return
	 */
	public boolean delete(Object row) {
		return database.deleteTable(row.getClass().getName(), row);
	}

	/**
	 * findAll 
	 * 
	 * @param name
	 * @return
	 */
	public ArrayList findAll(String name) {
		return database.findAll(name);
	}

	/**
	 * findById
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public Object findById(String name, int id) {
		return database.findById(name, id);
	}

}
