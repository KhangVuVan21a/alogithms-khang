package entity;
public class Product extends BaseRow {

	
	/**
	 * @param id
	 * @param name
	 * @param categoryId
	 */
	public Product(int id, String name, int categoryId) {
		this.id=id;
		this.name=name;
		this.categoryId = categoryId;
	}

	private int categoryId;
	/**
	 * @return categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Product ["+super.toString()+"categoryId=" + categoryId + "]";
	}

	


}
