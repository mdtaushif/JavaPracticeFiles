package taushif_java;

import java.util.Stack;

public class SdackDemo {

	static public void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(2);
		stack.push(4);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		int a = stack.peek();
		System.out.println(a);
	}
}
//stack is last in first out in nature , that is the element which is inserted into the stack the lastly is the element 
//which can be acessed the firstly, LIFO-Last In First out;
