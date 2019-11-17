package collection6.set.linkedhashset;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
//		create LinkedHashSet

		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>();
		LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>(10);
		LinkedHashSet<String> linkedHashSet3 = new LinkedHashSet<String>(10, 0.5f);
		LinkedHashSet<String> linkedHashSet4 = new LinkedHashSet<String>(linkedHashSet1);

		linkedHashSet1.add("");
		linkedHashSet1.add(null);
		linkedHashSet1.add(null); // duplicates not allowed
		linkedHashSet1.add("Bangalore");
		linkedHashSet1.add("Mangalore");
		linkedHashSet1.add("Bidar");
		linkedHashSet1.add("Mandya");
		linkedHashSet1.add("Hubli");

//		Maintains insertion order
		System.out.println("linkedHashSet1: " + linkedHashSet1);

//		Searching an element
		System.out.println("contains(\"bidar\"): " + linkedHashSet1.contains("bidar"));
		System.out.println("contains(\"B``idar\"): " + linkedHashSet1.contains("Bidar"));

//		Removing an element
		System.out.println("remove(\"Hubli\"): " + linkedHashSet1.remove("Hubli"));
		System.out.println("linkedHashSet1: " + linkedHashSet1);

//		Converting linkedhashset to array
		Object[] arr;
		arr = linkedHashSet1.toArray();
		System.out.println("Array: " + Arrays.toString(arr));

//		Iterating over the linkedhashset : insertion order
		Iterator<String> itr = linkedHashSet1.iterator();
		System.out.println("Iterating over the linkedhashset: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
