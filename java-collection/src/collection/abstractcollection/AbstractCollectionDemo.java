package collection.abstractcollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class AbstractCollectionDemo {

	public static void main(String[] args) {
		AbstractCollection<Integer> abstractCollection = new ArrayList<Integer>();

//		Adding elements
		abstractCollection.add(10);
		abstractCollection.add(23);
		abstractCollection.add(1);
		abstractCollection.add(2);
		abstractCollection.add(null);

//		print object
		System.out.println("abstractCollection: " + abstractCollection);

//		Remove an element
		abstractCollection.remove(null);
		System.out.println("abstractCollection after removing null : " + abstractCollection);

//		iterating items
		Iterator<Integer> itr = abstractCollection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
