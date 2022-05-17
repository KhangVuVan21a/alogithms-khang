package devfast_thuctap;

import java.util.ArrayList;

public class Bai23printMenu {
	public static void main(String[] args) {
		ArrayList<menu> listMenu=new ArrayList<menu>();
		listMenu.add(new menu(1,"thể thao",0));
		listMenu.add(new menu(2,"Xã hội",0));
		listMenu.add(new menu(3,"Thể thao trong nước",1));
		listMenu.add(new menu(4,"Giao thông",2));
		listMenu.add(new menu(5,"Môi trường",2));
		listMenu.add(new menu(6,"Thể thao quốc tế",1));
		listMenu.add(new menu(7,"Môi trường đô thị",5));
		listMenu.add(new menu(8,"Giao thông ùn tắc",4));
		printMenu(listMenu);
	}
	public static void printMenu(ArrayList<menu> listMenus) {
		for(menu i:listMenus) {
			int parent_id=i.getParent_id();
			while(parent_id>0) {
				System.out.print('-');
				parent_id--;
			}
			System.out.println(i.getTitle());
		}
	}
}
