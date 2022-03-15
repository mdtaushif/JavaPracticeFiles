package taushif_java;

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> que = new PriorityQueue<>();
		for (int i = 0; i < 11; i++) {
			que.add(i);
		}
//		queue follows fifo- First in first out
		System.out.println(que);
//		let us access the first element and use it
		int a = que.peek();
		System.out.println(a+"peeks for the element");
//		dosenot return null value if it was not able to remove rather it throws exception error
		int b = que.remove();
		System.out.println(b + "removes the element");
//		polling returns null value if it was not able to return any values 
		int d = que.peek();
		System.out.println(d+ "peeks for the element");
		int c = que.poll();
		System.out.println(c+  "removes the element");
		System.out.println(que);
//		removing first five element from queue 
		for(int i=0;i<=5;i++) {
			que.poll();
		}
		System.out.println(que);
		}
}
