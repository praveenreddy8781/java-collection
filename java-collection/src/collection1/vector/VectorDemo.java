package collection1.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		Vector<Integer> integers = new Vector<Integer>();

//		specifying the number of elements the vector can hold, 
//		once its full the the capacity will be doubled
		Vector<Integer> integers = new Vector<Integer>(12);

//		increament number of elements once vector is full
//		Vector<Integer> integers = new Vector<Integer>(12, 5);

//		Adding elements to vector
		integers.add(null);
		integers.add(null);

		integers.add(10);
		integers.add(40);
		integers.add(20);
		integers.add(10);
		integers.add(10);
		integers.add(40);
		integers.add(20);
		integers.add(10);
		integers.add(20);
		integers.add(10);
		integers.add(10);

//		Adding element at specified position
		integers.add(1, 200);

		System.out.println("integers: capacity " + integers.capacity());
		System.out.println("integers: " + integers);

//		updating element
		integers.set(0, 100);

//		Remove an element using remove() of vector
		integers.remove(null);

//		Searching an element
		int elementFoundAt = integers.indexOf(200);

		System.out.println("200 found at: " + elementFoundAt);
		boolean eleFound = integers.contains(200);
		System.out.println("contains 200? : " + eleFound);

//		Iterating elements
//		Using Enumeration
		Enumeration<Integer> enumeration = integers.elements();
		while (enumeration.hasMoreElements()) {
			Integer integer = (Integer) enumeration.nextElement();
			System.out.println("integer: " + integer);
		}

//		Using Iterator

//		Iterator<Integer> iterator = integers.iterator();
//		
//		while(iterator.hasNext()) {
//			Integer integer = iterator.next();
//			System.out.println("integer: " + integer);
//		}

	}

}
