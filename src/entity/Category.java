package entity;

public class Category extends BaseRow {
	public Category() {
		
	}
	/**
	 * @param id
	 * @param name
	 */
	public Category(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Category ["+super.toString()+"]";
	}
	
}
