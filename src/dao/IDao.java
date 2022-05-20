package dao;

import java.util.ArrayList;

public interface IDao {
	/**
	 * add Object into data
	 * @param row
	 * @return
	 */
	public int insert(Object row);

	/**
	 * update object in data
	 * @param row
	 * @return
	 */
	public int update(Object row);

	/**
	 *  delete object
	 * @param row
	 * @return
	 */
	public boolean delete(Object row);

	/**
	 * get all data by name
	 * @param name
	 * @return
	 */
	public ArrayList findAll(String name);

	/**
	 * find data by id
	 * @param name
	 * @param id
	 * @return
	 */
	public Object findById(String name, int id);
}
