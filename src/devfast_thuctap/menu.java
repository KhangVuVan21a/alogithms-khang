package devfast_thuctap;

public class menu {
	private int id;
	private String title;
	private int parent_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	@Override
	public String toString() {
		return "menu [id=" + id + ", title=" + title + ", parent_id=" + parent_id + "]";
	}
	public menu(int id, String title, int parent_id) {
		super();
		this.id = id;
		this.title = title;
		this.parent_id = parent_id;
	}
	
}
