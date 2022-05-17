package entity;

public class Product {
	private int id;
	private String name;
	private int categoryId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", categoryId=" + categoryId + "]";
	}
	public Product(int id, String name, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}
	
}
