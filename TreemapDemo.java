package taushif_java;
import java.util.*;
import java.util.Map.Entry;
public class TreemapDemo {
	public static void main(String[] args) {
		Map<Integer,String> treemap =new TreeMap<>();
		treemap.put(2,"uzair");
		treemap.put(1, "sahein");
		treemap.put(5,"oosman");
		treemap.put(3, "rizwan");
		treemap.put(4, "ummul");
		System.out.println(treemap);
		for(Entry<Integer,String> EntryTemp: treemap.entrySet()) {
			System.out.println("key "+ EntryTemp.getKey()+"value "+ EntryTemp.getValue());
		}
	}
}
