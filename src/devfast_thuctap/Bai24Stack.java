package devfast_thuctap;

import java.util.Stack;

public class Bai24Stack {
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(2);
		stack.push(8);
		stack.push(4);
		stack.push(7);
		stack.push(5);
		stack.push(3);
//		for(int i:stack) {
//			System.out.println(i);
//		}
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
