package collection7.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
//		Create LinkedHashMap

		LinkedHashMap<Integer, String> lHashMap1 = new LinkedHashMap<Integer, String>();

		LinkedHashMap<Integer, String> lHashMap2 = new LinkedHashMap<Integer, String>(10);

		LinkedHashMap<Integer, String> lHashMap3 = new LinkedHashMap<Integer, String>(10, 0.55f);

		LinkedHashMap<Integer, String> lHashMap4 = new LinkedHashMap<Integer, String>(lHashMap1);

//		Constructs an empty LinkedHashMap instance with the specified initial capacity, 
//		load factor and ordering mode.
		LinkedHashMap<Integer, String> lHashMap5 = new LinkedHashMap<Integer, String>(10, 0.5f, true);

//		Adding entries
		lHashMap1.put(2, "Lenovo");
		lHashMap1.put(1, "Apple");
		lHashMap1.put(3, "Nokia");
		lHashMap1.put(4, "Htc");
		lHashMap1.put(5, "Motorola");

		System.out.println(lHashMap1.get(2));
		System.out.println("lHashMap1: " + lHashMap1);

		lHashMap5.put(2, "Lenovo");
		lHashMap5.put(1, "Apple");
		lHashMap5.put(3, "Nokia");
		lHashMap5.put(4, "Htc");
		lHashMap5.put(5, "Motorola");

		System.out.println(lHashMap5.get(2));
		System.out.println("lHashMap5: " + lHashMap5);
		
//		Other methods practise
	}

}
