package collection5.queue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class AbstractQueueDemo {

	public static void main(String[] args) {
		AbstractQueue<Integer> abstractQueue = new LinkedBlockingDeque<Integer>();
//		abstractQueue.add(null); //cann't add null values

		abstractQueue.add(20);
		abstractQueue.add(10);
		abstractQueue.add(30);
		abstractQueue.add(40);

		System.out.println(abstractQueue);

		Integer element = abstractQueue.element();
		System.out.println("element::" + element);

		Integer removedEle = abstractQueue.remove();
		System.out.println("removedEle: " + removedEle);
		System.out.println(abstractQueue);

		System.out.println("Iterating items: ");
		Iterator<Integer> itr = abstractQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		clear elements from the queue
		abstractQueue.clear();
		System.out.println(abstractQueue);
	}

}
