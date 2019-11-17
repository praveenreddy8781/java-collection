package collection6.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		//creating hashset
		
		HashSet<String> hashSet1 = new HashSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>(hashSet1);
		HashSet<Integer> hashSet3 = new HashSet<Integer>(10);
		HashSet<String> hashSet4 = new HashSet<String>(10, 0.5f);
		
//		System.out.println(hashSet1);
//		System.out.println(hashSet2);
//		System.out.println(hashSet3);
//		System.out.println(hashSet4);
		
		
//		Add elements
		hashSet1.add("");
//		hashSet1.add(null);
//		hashSet1.add(null); // duplicates cannot be added
		hashSet1.add("Bangalore");
		hashSet1.add("Hyderabad");
		hashSet1.add("Zaheerabad");
		hashSet1.add("Manglore");
		hashSet1.add("Bidar");
		hashSet1.add("Mandya");
		
//		order is not guaranteed
		System.out.println("hashSet1: " + hashSet1);
		
//		search elements
		System.out.println("contains(\"Bidar\"): " 
				+ hashSet1.contains("Bidar"));
		
//		Removing an element
		System.out.println("remove(\"Mandya\"): " 
				+ hashSet1.remove("Mandya"));
		System.out.println("hashSet1: " + hashSet1);
		
		System.out.println("removeIf(str-> str.endsWith(\"bad\")) : " 
				+ hashSet1.removeIf(str-> str.endsWith("bad")));
		System.out.println("hashSet1: " + hashSet1);
		
//		Iterating elements from set
		Iterator<String> itr = hashSet1.iterator();
		System.out.println("Iterating elements from set: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		practice other methods
	}

}
