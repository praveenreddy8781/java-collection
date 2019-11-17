package collection7.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
//		Create HashMap

		HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
//		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>(12);
//		HashMap<String, Integer> hashMap3 = new HashMap<String, Integer>(12,0.5f);
//		HashMap<String, Integer> hashMap4 = new HashMap<String, Integer>(hashMap1);

		hashMap1.put("India", 91);
		hashMap1.put("Srilanka", 71);
		hashMap1.put("Pakistan", 41);
		hashMap1.put("South Africa", 51);
		hashMap1.put("Austrailia", 21);
		hashMap1.put("Austrailia", 21);// can't add duplicates

//		print hashMap : order is un predictable
		System.out.println("hashMap: " + hashMap1);

//		size
		System.out.println("hashMap:" + hashMap1.size());

//		can add one null key but multiple null values
		hashMap1.put(null, 00);
		hashMap1.put("Kenya", null);
		hashMap1.put("Uganda", null);

		System.out.println("hashMap: " + hashMap1);

//		Getting value based on key
		System.out.println("get(\"India\"): " + hashMap1.get("India"));
		System.out.println("getOrDefault(\"Argentina\", 00): " + hashMap1.getOrDefault("Argentina", 00));

//		searching key and value
		System.out.println("containsKey(\"Pakistan\"): " + hashMap1.containsKey("Pakistan"));
		System.out.println("containsValue(91): " + hashMap1.containsValue(91));

//		Getting all the keys
		Set<String> keySet = hashMap1.keySet();
		System.out.println("keySet:::::");
		Iterator<String> keysItr = keySet.iterator();
		while (keysItr.hasNext()) {
			System.out.println(keysItr.next());
		}

//		Getting all the values
		Collection<Integer> collection = hashMap1.values();
		System.out.println("Values:::::");
		Iterator<Integer> valuesItr = collection.iterator();
		while (valuesItr.hasNext()) {
			System.out.println(valuesItr.next());
		}

//		remove an entry
		System.out.println("remove(\"Pakistan\"): " + hashMap1.remove("Uganda"));

//		replacing an for specified key
		System.out.println("replace(\"Kenya\", 11): " + hashMap1.replace("Kenya", 11));

		System.out.println("hashMap: " + hashMap1);

//		clearing all the entries
		hashMap1.clear();
		System.out.println("hashMap: " + hashMap1);
	}
}
