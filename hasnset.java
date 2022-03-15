package taushif_java;
import java.util.*;
public class hasnset {
	public static void main(String[] args) {
		HashSet<String> hashset= new HashSet<>();
		hashset.add("b");
		hashset.add("a");
		hashset.add("c");
		hashset.add("a");
		hashset.add("d"); 
		System.out.println(hashset);
		System.out.println(hashset.contains("a"));
		hashset.remove("a");
		System.out.println(has hset);
		for(String i : hashset) {
			System.out.print(i+ " ");
		}
	}
}
