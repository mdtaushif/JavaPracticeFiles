package taushif_java;
import java.util.ArrayList;

public class ArrayList_Practice {
public static void main(String[] args) {
	ArrayList<Integer> arraylist = new ArrayList<>();
	arraylist.add(1);
	arraylist.add(2);
	arraylist.add(3);
	arraylist.add(4);
	arraylist.add(5);
	arraylist.add(6);
	System.out.println(arraylist);
	arraylist.remove(5);
	System.out.println(arraylist);
	for(int i : arraylist) {
		System.out.println(i +" ");
	}
	for(int i=0;i<=arraylist.size()-1;i++) {
		System.out.print(arraylist.get(i)+ " ");
	}
}
}
