package devfast_thuctap;

public class Product {
	private String name;
	private int price;
	private int quality;
	private int categoryId;
	public Product(String name, int price, int quality, int categoryId) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quality=" + quality + ", categoryId=" + categoryId
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
}
