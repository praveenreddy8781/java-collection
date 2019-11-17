package collection5.queue.dequeue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
//		Create ArrayDequeue

		ArrayDeque<String> arrayDeque1 = new ArrayDeque<String>();
//		ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<Integer>(collection);
		ArrayDeque<String> arrayDeque3 = new ArrayDeque<String>(10);

		
//		Adding elements into ArrayDeque
		arrayDeque1.add("Bangalore");
//		arrayDeque1.add(null);

		arrayDeque1.addFirst("Hyderabad");

		arrayDeque1.addLast("Mangalore");

		arrayDeque1.offerFirst("Delhi");

		arrayDeque1.offerLast("Bidar");

		System.out.println("arrayDeque1: " + arrayDeque1);

		System.out.println("peekFirst(): " + arrayDeque1.peekFirst());
		System.out.println("peekLast(): " + arrayDeque1.peekLast());

		System.out.println("arrayDeque1: " + arrayDeque1);

		System.out.println("pollFirst: " + arrayDeque1.pollFirst());
		System.out.println("pollLast: " + arrayDeque1.pollLast());

		System.out.println("arrayDeque1: " + arrayDeque1);
		
		System.out.println("removeFirst(): " + arrayDeque1.removeFirst());
		System.out.println("removeLast(): " + arrayDeque1.removeLast());
		
		System.out.println("arrayDeque1: " + arrayDeque1);
		
		
	}

}
