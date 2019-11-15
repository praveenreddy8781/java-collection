package collection2.stack;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// Create a stack of plates

		Stack<Integer> integers = new Stack<Integer>();

		integers.push(10);
		integers.push(null);
		integers.push(20);
		integers.push(30);

		System.out.println("stack items: " + integers);

//		peek element
		System.out.println("Peek item: " + integers.peek());

//		pop element: 
		System.out.println("popped item: " + integers.pop());

//		searching an item in stack
		System.out.println("search null : " + integers.search(null));

//		Iterating over stack
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

//		stack is empty?
		System.out.println("Stack is empty? : " + integers.empty());

//		Exception in thread "main" java.util.EmptyStackException
//		integers.pop();
//		integers.pop();
//		integers.pop();
//		integers.pop();
//		integers.pop();
	}
}
