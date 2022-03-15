package taushif_java;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "nawaz");
		map.put(2, "taushif");
		System.out.println(map);
//		System.out.println(map.get());
		if (map.containsValue("nawaz")) {
			System.out.println("nawa");
		}
		if (map.containsKey(2)) {
			System.out.println(map.get(2));
		}
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		for(Entry<Integer, String> name: map.entrySet()) {
			System.out.println("key "+name.getKey()+"value "+name.getValue() );
		}
	}
}
