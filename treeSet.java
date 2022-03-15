package taushif_java;
import java.util.*;
public class treeSet {
public static void main(String[] args) {
	TreeSet<Integer> treeset= new TreeSet<>();
	System.out.println(treeset.pollFirst());
	treeset.add(1);
	treeset.add(1);
	treeset.add(1);
	treeset.add(1);
	treeset.add(5);
	System.out.println(treeset);
	
	
}
}
