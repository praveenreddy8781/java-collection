package collection3.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
//		create hashtable

//		default constructor
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();

//		Adding items

//		null key or value cant be added
//		hashTable.put(null, null);
//		hashTable.put(null, "Anny"); 
//		hashTable.put(1, null);

		hashTable.put(100, "Anny");
		hashTable.put(100, "Anny");

//		put if absent
		hashTable.putIfAbsent(100, "Test");

//		compute if absent
//		hashTable.computeIfAbsent(100, v -> "Jack");
		hashTable.computeIfAbsent(101, v -> "Jack");

//		printing the object
		System.out.println("hashTable:: " + hashTable);

//		contains key?
		System.out.println("containsKey(100)? : " + hashTable.containsKey(100));

//		contains object
		System.out.println("containsValue(\"Anny\")?: " + hashTable.containsValue("Anny"));

//		display values using enumeration
		Enumeration<String> values = hashTable.elements();
		System.out.println("HashTable values: using enumeration ");
		while (values.hasMoreElements()) {
			System.out.println(values.nextElement());
		}

//		display entry<k,v> using entry set
		Set<Map.Entry<Integer, String>> entries = hashTable.entrySet();
		Iterator<Entry<Integer, String>> itr = entries.iterator();
		System.out.println("HashTable values: using entrySet ");
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			Integer key = entry.getKey();
			System.out.println(hashTable.get(key));
		}
	}
}
