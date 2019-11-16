package collection4.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

//		create linkedlist

		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
//		LinkedList<Integer> linkedList2 = new LinkedList<Integer>(c)

//		adding elements in linkedlist

		linkedList1.add(10);
		linkedList1.add(null);
		linkedList1.add(5);
		linkedList1.add(31);
		linkedList1.add(0);
		linkedList1.add(1);

//		Adding elements in both ends
		linkedList1.addFirst(1);
		linkedList1.addLast(100);

//		Iterating linked list: insertion orders
		System.out.println("linkedList1:: " + linkedList1);

		System.out.println("Iterating linked list: accessed in insertion order");
		Iterator<Integer> itr = linkedList1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("linkedList1:: " + linkedList1);
		
//		searching elements
		System.out.println("indexOf(2) : " + linkedList1.indexOf(2));
		System.out.println("indexOf(100) : " + linkedList1.indexOf(100));
		System.out.println("lastIndexOf(1): " + linkedList1.lastIndexOf(1));
		System.out.println("contains(100): " + linkedList1.contains(100));
		System.out.println("contains(100): " + linkedList1.contains(2));
		
//		Getting elements
//		linkedList1.clear();
		Integer first = linkedList1.getFirst(); //NoSuchElementException throws when list is empty
		System.out.println("first: " + first);
		
		
		
		Integer last = linkedList1.getLast();
		System.out.println("last: " + last);
		
//		removing elements
		System.out.println("removeFirst(): " + linkedList1.removeFirst());
		System.out.println("removeLast(): " + linkedList1.removeLast());
		
		System.out.println("linkedList1:: " + linkedList1);
		
//		offer methods are used to add elements to list
		boolean isAddedtoFirst = linkedList1.offerFirst(10);
		boolean isAddedtoLast = linkedList1.offerLast(200);
		System.out.println("offerFirst(10) " + isAddedtoFirst + " and offerLast(200)" + isAddedtoLast);
		System.out.println("linkedList1:: " + linkedList1);
		
//		Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
		Integer firstNum = linkedList1.peekFirst();
		System.out.println("peekFirst: " + firstNum);
		
		Integer lastNum = linkedList1.peekLast();
		System.out.println("peekLast: " + lastNum);
		
		System.out.println("linkedList1:: " + linkedList1);
		
//		Poll methods : Retrieves and removed elements from linkedlist
		Integer pollFirst = linkedList1.pollFirst();
		System.out.println("pollFirst::" + pollFirst);
		
		Integer pollLast = linkedList1.pollLast();
		System.out.println("pollLast::" + pollLast);
		System.out.println("linkedList1:: " + linkedList1);
		
//     Queue interface methods
	}

}
