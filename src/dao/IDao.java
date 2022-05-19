package dao;

import java.util.ArrayList;

public interface IDao {
	public int insert(Object row);

	public int update(Object row);

	public boolean delete(Object row);

	public ArrayList findAll(String name);

	public Object findById(String name, int id);
}
