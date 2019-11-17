package collection6.set.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		create treeSet

//		creates a treeSet object which uses natural ordering
		TreeSet<Character> treeSet1 = new TreeSet<Character>();

//		Cannot add null from jdk1.7
//		treeSet1.add(null);

//		adding elements
		treeSet1.add('k');
		treeSet1.add('z');
		treeSet1.add('l');
		treeSet1.add('p');
		treeSet1.add('a');

		System.out.println("treeSet1: " + treeSet1);

//		Overriding natural ordering
		TreeSet<Character> treeSet2 = new TreeSet<Character>(Collections.reverseOrder());
		treeSet2.addAll(treeSet1);

		System.out.println("treeSet2: " + treeSet2);

//		getting first char
		System.out.println("first(): " + treeSet1.first());

//		getting last char
		System.out.println("last(): " + treeSet1.last());

		System.out.println("treeSet1: " + treeSet1);

//		getting the headSet
		SortedSet<Character> headSet = treeSet1.headSet('l');
//		SortedSet<Character> headSet = treeSet1.headSet('l', true);
		System.out.println("headSet('l'): " + headSet);

//		getting the tailSet
		SortedSet<Character> tailSet = treeSet1.tailSet('l');
//		SortedSet<Character> tailSet = treeSet1.tailSet('l', false);
		System.out.println("tailSet('l'): " + tailSet);

		System.out.println("treeSet1: " + treeSet1);

//		getting the subSet
		SortedSet<Character> subSet = treeSet1.subSet('k', 'p');
//		SortedSet<Character> subSet = treeSet1.subSet('p', 'k');
//		SortedSet<Character> subSet = treeSet1.subSet('k', true, 'p', true);
		System.out.println("subSet('z', 'p'): " + subSet);
//		subSet.clear();

		System.out.println("treeSet1: " + treeSet1);

//		cieling 
		System.out.println("ceiling('m') : " + treeSet1.ceiling('m'));

//		floor
		System.out.println("floor('m'): " + treeSet1.floor('m'));

//		higher
		System.out.println("higher('m') : " + treeSet1.higher('p'));

//		lower
		System.out.println("lower('p'): " + treeSet1.lower('p'));
		System.out.println("treeSet1: " + treeSet1);

//		pollFirst
		System.out.println("pollFirst(): " + treeSet1.pollFirst());
		System.out.println("treeSet1: " + treeSet1);

//		pollLast
		System.out.println("pollLast(): " + treeSet1.pollLast());
		System.out.println("treeSet1: " + treeSet1);

//		remove 
		System.out.println("remove('k'): " + treeSet1.remove('k'));
		System.out.println("treeSet1: " + treeSet1);

//		iterator
		Iterator<Character> itr = treeSet1.iterator();
		System.out.println("Iterating through the elements using iterator:");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//		descending iterator
		Iterator<Character> descItr = treeSet1.descendingIterator();
		System.out.println("Iterating through the elements using descendingIterator:");
		while (descItr.hasNext()) {
			System.out.println(descItr.next());
		}
	}
}
