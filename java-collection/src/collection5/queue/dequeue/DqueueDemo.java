package collection5.queue.dequeue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DqueueDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();

		deque.add("Bangalore");
		deque.addFirst("Mysore");
		deque.addLast("Chennai");
		deque.offer("Mangalore");
		deque.offerFirst("Hyderabad");

		System.out.println("deque: " + deque);

		// Iterate through the queue elements.
		Iterator<String> itr = deque.iterator();
		System.out.println("Standard Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Reverse order iterator
		Iterator<String> rItr = deque.descendingIterator();
		System.out.println("Reverse Iterator");
		while (rItr.hasNext()) {
			System.out.println(rItr.next());
		}

//		push an element
		deque.push("Mandya");
		System.out.println("Pushing Mandya: ");
		System.out.println("deque: " + deque);

//		pop return the head ele and removes it from the queue
		System.out.println("pop: " + deque.pop());
		System.out.println("deque: " + deque);

//		contains element
		System.out.println("Contains Bangalore: " + deque.contains("Bangalore"));

//		Removing an element
		deque.removeFirst();
		deque.removeLast();
		System.out.println("deque after removing first and last: " + deque);
	}
}
