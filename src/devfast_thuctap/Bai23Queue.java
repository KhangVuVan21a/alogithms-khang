package devfast_thuctap;

import java.util.LinkedList;
import java.util.Queue;


public class Bai23Queue {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(2);
		queue.add(5);
		queue.add(3);
		queue.add(7);
		queue.add(6);
		queue.add(4);
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
}
