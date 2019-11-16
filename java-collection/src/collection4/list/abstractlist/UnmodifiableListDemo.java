package collection4.list.abstractlist;

import java.util.AbstractList;

class UnmodifiableList<E> extends AbstractList<E> {

	@Override
	public E get(int index) {
		System.out.println("get called");
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class UnmodifiableListDemo {

	public static void main(String[] args) {
		UnmodifiableList list = new UnmodifiableList();
		
//		Not supported
//		list.add(10);
		
//		Not supported
//		list.remove(0);
		
		list.get(0);
		System.out.println("size of the unmodifiable list: " + list.size());
		System.out.println(list);

	}

}
