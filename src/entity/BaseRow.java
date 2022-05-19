package entity;

public abstract class BaseRow implements IEnity{
	protected int id;
	protected String name;
	
	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BaseRow [id=" + id + ", name=" + name + "]";
	}
	
	
}
