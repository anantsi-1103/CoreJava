package CollectionFramework;

import java.util.HashMap; // no order
import java.util.LinkedHashMap; // order - define kra hai ussi order m woh create hogya

public class cf6 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(1, "Apple");
		map.put(3, "Banana");
		map.put(3, "Mango");
		
//		3 = mango

		System.out.println(map);
		
//		System.out.println(map.get(1));
//		System.out.println(map.get(2));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.containsKey(3));
		
		
	}
}
