package entity;

public class Accessory extends BaseRow {
	public Accessory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 */
	public Accessory(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Accessory ["+super.toString()+"]";
	}
	

}
