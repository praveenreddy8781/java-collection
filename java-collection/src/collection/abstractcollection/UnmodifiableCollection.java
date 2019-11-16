package collection.abstractcollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UnmodifiableCollection<E> extends AbstractCollection<E> {
	int[] arr;
	int index;

	public UnmodifiableCollection(int size) {
		System.out.println("UnmodifiableCollection is created");
		arr = new int[size];
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);

		UnmodifiableCollection collection = new UnmodifiableCollection<Integer>(10);
		collection.add(10);
		collection.add(23);
		collection.add(12);
		collection.add(11);
		collection.add(15);
		collection.add(1);
		collection.add(3);
		collection.add(4);
		collection.add(5);
		collection.add(6);
//		collection.addAll(al);
//		collection.iterator();

		System.out.println(collection);
	}

	@Override
	public Iterator<E> iterator() {
		System.out.println("Returning Iterator");
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean add(E e) {
		arr[index] = (int) e;
		index++;
		return true;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
}
