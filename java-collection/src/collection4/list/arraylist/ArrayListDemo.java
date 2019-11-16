package collection4.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

//		creating arraylist

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();// default size of 10
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(2); // with specified size of 2
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>(arrayList1); // using the specified collection

//		Adding items
		arrayList1.add(10);
		arrayList1.add(1, 20);
		arrayList1.add(10);
		arrayList1.add(40);
		arrayList1.add(50);
		arrayList1.add(5);

//		print arraylist object
		System.out.println(arrayList1);

//		increasing the capacity
		arrayList1.ensureCapacity(20);

//		search the items
		System.out.println("indexOf(20) : " + arrayList1.indexOf(20));
		System.out.println("lastIndexOf(10): " + arrayList1.lastIndexOf(10));
		System.out.println("indexOf(30) : " + arrayList1.indexOf(30));
		System.out.println("lastIndexOf(10): " + arrayList1.lastIndexOf(20));
		System.out.println("contains(10): " + arrayList1.contains(10));
		System.out.println("contains(30): " + arrayList1.contains(30));

//		Getting an item
		Integer item = arrayList1.get(2);
		System.out.println("Getting item at index 2: " + item);

//		Getting sublist
		List<Integer> sublist = arrayList1.subList(0, 1);
		System.out.println("sublist: " + sublist);

//		When we clear the sublist then items from the source will also be cleared
		sublist.clear();

		System.out.println("After clearing sublist:");
		System.out.println("sublist: " + sublist);
		System.out.println(arrayList1);

//		Replace the element at specified position
		arrayList1.set(2, 100);
		System.out.println("Atfer replacing 100 at 2nd index: ");
		System.out.println(arrayList1);

//	Converting the arraylist into array	
		Object[] integers = arrayList1.toArray();
		System.out.println("array of integers: " + Arrays.toString(integers));
//		integers[5] = 100; //fixed array throws AIOOBException

// Iterating items from arraylist

//		using Iterator(only forward direction)
		System.out.println("using Iterator(only forward direction)");
		Iterator<Integer> itr = arrayList1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		using listiterator(forward and backward direction)
		System.out.println("using listiterator(forward direction)");
		ListIterator<Integer> listIterator1 = arrayList1.listIterator();
		while (listIterator1.hasNext()) {
			System.out.println("nextIndex " + listIterator1.nextIndex());
			System.out.println("Item : " + listIterator1.next());
		}

		System.out.println("using listiterator(backward direction)");
		ListIterator<Integer> listIterator2 = arrayList1.listIterator(arrayList1.size());
		while (listIterator2.hasPrevious()) {
			System.out.println("Previous index" + listIterator2.previousIndex());
			System.out.println("Item : " + listIterator2.previous());
		}

//		Removing an Item
		System.out.println("Removing 20 from arraylist using remove and iterator");
		Iterator<Integer> itrR = arrayList1.iterator();
		while (itrR.hasNext()) {
			System.out.println(itrR.next());
//			arrayList1.remove(0);
			if (arrayList1.contains(20)) {
				itrR.remove();
			}
		}

		System.out.println(arrayList1);

//		retainAll
		arrayList2.add(100);
		arrayList2.add(50);
		arrayList1.retainAll(arrayList2);

		System.out.println("arrayList1: " + arrayList1);
		System.out.println("arrayList2: " + arrayList2);
	}
}
